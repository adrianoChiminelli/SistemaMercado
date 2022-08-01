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
import model.Cliente;

public class ClienteDAO implements FuncoesDAO<Cliente> {
    
    private static final String
    INSERT = "INSERT INTO  clientes (nome_cliente, cpf, telefone, email) VALUES (?, ?, ?, ?)";
    
    private static final String
    SELECT_ALL = "SELECT * FROM clientes";
    
    private static final String
    SELECT_BY_ID = "SELECT * FROM clientes WHERE id_cliente = ?";
    
    private static final String
    DELETE = "DELETE FROM clientes WHERE id_cliente = ?";
    
    private static final String
    UPDATE = "UPDATE clientes SET nome_cliente = ?, cpf = ?, telefone = ?, email = ? WHERE id_cliente = ?";
    
    @Override
    public void insert(Cliente objeto) {

        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(INSERT);
            pstm.setString(1, objeto.getNomeCliente());
            pstm.setString(2, objeto.getCpf());
            pstm.setString(3, objeto.getTelefone());
            pstm.setString(4, objeto.getEmail());

            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> listaCliente = new ArrayList<>();

        try {
            Connection conexao = new Conexao().conectar();
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(SELECT_ALL);

            while (rs.next()) {

                listaCliente.add(criaCliente(rs));
            }

            return listaCliente;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
        return listaCliente;
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(SELECT_BY_ID);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                return Optional.of(criaCliente(rs));
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
    public void update(Cliente objeto) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(UPDATE);
            pstm.setString(1, objeto.getNomeCliente());
            pstm.setString(2, objeto.getCpf());
            pstm.setString(3, objeto.getTelefone());
            pstm.setString(4, objeto.getEmail());
            pstm.setInt(5, objeto.getIdCliente());
            
            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " + e.getMessage());
        }
    }
    
    public boolean cpfJaCadastrado(String cpf) {
        Connection conexao = new Conexao().conectar();
        String sql = "SELECT * FROM clientes WHERE cpf = ?";

        try {
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, cpf);
            
            ResultSet rs = pstm.executeQuery();
           
            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro  " + e.getMessage());
        }
        return false;
    }

    private Cliente criaCliente(ResultSet rs) throws SQLException {
        int id = rs.getInt("id_cliente");
        String nome = rs.getString("nome_cliente");
        String cpf = rs.getString("cpf");
        String telefone = rs.getString("telefone");
        String email = rs.getString("email");

        return new Cliente(id, nome, cpf, telefone, email);
    }

}
