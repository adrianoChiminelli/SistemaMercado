package dao;

import interfaces.FuncoesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import model.Produto;
import model.Usuario;
import model.Venda;
import model.VendaProduto;
import utils.Cripto;

public class VendasDAO implements FuncoesDAO<Venda> {

    private static final String INSERT = "INSERT INTO vendas (fk_cliente, quantidade, valor_total, vendedor, metodo_pagamento, data) VALUES (?, ?, ?, ?, ?, ?)";

    private static final String SELECT_ALL = "SELECT * FROM vendas";

    private static final String SELECT_BY_ID = "SELECT * FROM vendas WHERE id_venda = ?";

    private static final String SELECT_BY_CLIENTE_ID = "SELECT * FROM vendas WHERE fk_cliente = ?";

    private static final String SELECT_BY_CLIENTE_NAME = "SELECT v.id_venda, v.fk_cliente, v.quantidade, v.valor_total, v.vendedor, v.metodo_pagamento,  v.data FROM vendas v "
            + "INNER JOIN clientes c ON c.id_cliente = v.fk_cliente WHERE c.nome_cliente like ?";

    private final String SELECT_PRODUTOS
            = "SELECT p.id_produto, p.descricao_produto, vp.qtd_produto, p.valor from vendas v "
            + "INNER JOIN venda_produto vp on v.id_venda = vp.id_venda "
            + "INNER JOIN produtos p ON p.id_produto = vp.id_produto "
            + "WHERE v.id_venda = ?";
    
    private static final String SELECT_BY_DATE = "SELECT * FROM vendas WHERE data = ?";

    private static final String DELETE = "DELETE FROM vendas WHERE id_venda = ?";

    private static final String UPDATE = "UPDATE vendas SET fk_cliente = ?, quantidade = ? , valor_total = ?, vendedor = ?, metodo_pagamento = ?, data = ? WHERE id_venda = ?";

    @Override
    public void insert(Venda objeto) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(INSERT);

            pstm.setInt(1, objeto.getFkCliente());
            pstm.setInt(2, objeto.getQuantidadeTotal());
            pstm.setDouble(3, objeto.getValorTotal());
            pstm.setString(4, objeto.getVendedor());
            pstm.setString(5, objeto.getMetodoPagamento());
            pstm.setTimestamp(6, new Timestamp(objeto.getData().getTime()));

            pstm.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }

    @Override
    public List<Venda> findAll() {
        List<Venda> listaVendas = new ArrayList<>();

        try {
            Connection conexao = new Conexao().conectar();
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(SELECT_ALL);

            while (rs.next()) {

                listaVendas.add(criaVenda(rs));
            }

            return listaVendas;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
        return listaVendas;
    }

    @Override
    public Optional<Venda> findById(Integer id) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(SELECT_BY_ID);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                return Optional.of(criaVenda(rs));
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(DELETE);
            pstm.setInt(1, id);
            pstm.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e.getMessage());
        }
    }

    @Override
    public void update(Venda objeto) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(UPDATE);
            pstm.setInt(1, objeto.getFkCliente());
            pstm.setInt(2, objeto.getQuantidadeTotal());
            pstm.setDouble(3, objeto.getValorTotal());
            pstm.setString(4, objeto.getVendedor());
            pstm.setString(5, objeto.getMetodoPagamento());
            pstm.setTimestamp(6, new Timestamp(objeto.getData().getTime()));
            pstm.setInt(7, objeto.getIdVendas());

            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " + e.getMessage());
        }
    }

    private Venda criaVenda(ResultSet rs) throws SQLException {
        int id = rs.getInt("id_venda");
        int fkCliente = rs.getInt("fk_cliente");
        int qtd = rs.getInt("quantidade");
        Double valor = rs.getDouble("valor_total");
        String vendedor = rs.getString("vendedor");
        String metPagamento = rs.getString("metodo_pagamento");
        Date data = rs.getDate("data");

        return new Venda(id, fkCliente, qtd, valor, vendedor, metPagamento, data);
    }

    public List<Produto> findAllProducts(int id) {
        List<Produto> listaProduto = new ArrayList<>();

        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(SELECT_PRODUTOS);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                listaProduto.add(criaProduto(rs));
            }

            return listaProduto;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
        return listaProduto;
    }

    private Produto criaProduto(ResultSet rs) throws SQLException {
        int id = rs.getInt("id_produto");
        String descricaoProduto = rs.getString("descricao_produto");
        Integer quantidadeEstoque = rs.getInt("qtd_produto");
        Double valor = rs.getDouble("valor");

        return new Produto(id, descricaoProduto, quantidadeEstoque, valor);
    }

    public List<Venda> findByCliente(int id) {
        List<Venda> listaVendas = new ArrayList<>();

        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(SELECT_BY_CLIENTE_ID);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {

                listaVendas.add(criaVenda(rs));
            }

            return listaVendas;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
        return listaVendas;
    }

    public List<Venda> findByCliente(String nome) {
        List<Venda> listaVendas = new ArrayList<>();

        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(SELECT_BY_CLIENTE_NAME);
            pstm.setString(1, "%" + nome + "%");

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {

                listaVendas.add(criaVenda(rs));
            }

            return listaVendas;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
        return listaVendas;
    }

}
