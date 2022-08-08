package dao;

import interfaces.FuncoesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import model.Produto;
import model.VendaProduto;

public class ProdutoDAO implements FuncoesDAO<Produto> {

    private static final String
    INSERT = "INSERT INTO produtos (descricao_produto, quantidade_produto, valor) VALUES (?, ?, ?)";
    
    private static final String
    SELECT_ALL = "SELECT * FROM produtos";
    
    private static final String
    SELECT_BY_ID = "SELECT * FROM produtos WHERE id_produto = ?";
    
    private static final String
    DELETE = "DELETE FROM produtos WHERE id_produto = ?";
    
    private static final String
    UPDATE = "UPDATE produtos SET descricao_produto = ?, quantidade_produto = ?, valor = ? WHERE id_produto = ?";
    
    private static final String
    UPDATE_ESTOQUE = "UPDATE produtos SET quantidade_produto = ? WHERE id_produto = ?";
    
    @Override
    public void insert(Produto objeto) {

        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(INSERT);
            pstm.setString(1, objeto.getDescricaoProduto());
            pstm.setInt(2, objeto.getQuantidadeEstoque());
            pstm.setDouble(3, objeto.getValor());
 

            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }

    @Override
    public List<Produto> findAll() {
        List<Produto> listaProduto = new ArrayList<>();

        try {
            Connection conexao = new Conexao().conectar();
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(SELECT_ALL);

            while (rs.next()) {

                listaProduto.add(criaProduto(rs));
            }

            return listaProduto;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
        return listaProduto;
    }

    @Override
    public Optional<Produto> findById(Integer id) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(SELECT_BY_ID);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                return Optional.of(criaProduto(rs));
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
    public void update(Produto objeto) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(UPDATE);
            pstm.setString(1, objeto.getDescricaoProduto());
            pstm.setInt(2, objeto.getQuantidadeEstoque());
            pstm.setDouble(3, objeto.getValor());
            pstm.setInt(4, objeto.getIdProduto());
            
            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " + e.getMessage());
        }
    }
    
    public void baixarEstoque(List<VendaProduto> listaProdutos) {

        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(UPDATE_ESTOQUE);

            for (VendaProduto vp : listaProdutos) {
                pstm.setInt(1, vp.getQuantidade());
                pstm.setInt(2, vp.getIdProduto());

                pstm.executeUpdate();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }

    private Produto criaProduto(ResultSet rs) throws SQLException {
        int id = rs.getInt("id_produto");
        String descricaoProduto = rs.getString("descricao_produto");
        Integer quantidadeEstoque = rs.getInt("quantidade_produto");
        Double valor = rs.getDouble("valor");

        return new Produto(id, descricaoProduto, quantidadeEstoque, valor);
    }

}
