package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.JOptionPane;
import model.Venda;
import model.VendaProduto;

public class VendaProdutoDAO {

    private final String INSERT_VENDA = "INSERT INTO vendas (fk_cliente, quantidade, valor_total, vendedor, metodo_pagamento, data) VALUES (?, ?, ?, ?, ?, ?)";

    private final String INSERT_PRODUTOS = "INSERT INTO venda_produto (id_venda, id_produto, qtd_produto) VALUES (?, ?, ?)";
    
    public void salvarVenda(Venda venda, List<VendaProduto> listaProdutos) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement psVenda = conexao.prepareStatement(INSERT_VENDA, Statement.RETURN_GENERATED_KEYS);
            PreparedStatement psProdutos = conexao.prepareStatement(INSERT_PRODUTOS);

            psVenda.setInt(1, venda.getFkCliente());
            psVenda.setInt(2, venda.getQuantidadeTotal());
            psVenda.setDouble(3, venda.getValorTotal());
            psVenda.setString(4, venda.getVendedor());
            psVenda.setString(5, venda.getMetodoPagamento());
            psVenda.setTimestamp(6, new Timestamp(venda.getData().getTime()));

            psVenda.executeUpdate();

            ResultSet rs = psVenda.getGeneratedKeys();

            if (rs.next()) {
                int idVenda = rs.getInt(1);
                for (VendaProduto vp : listaProdutos) {
                    psProdutos.setInt(1, idVenda);
                    psProdutos.setInt(2, vp.getIdProduto());
                    psProdutos.setInt(3, vp.getQuantidade());

                    psProdutos.executeUpdate();
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }

    }

}
