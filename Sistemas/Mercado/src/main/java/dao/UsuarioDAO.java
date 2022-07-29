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
import model.Usuario;
import utils.Cripto;

public class UsuarioDAO implements FuncoesDAO<Usuario> {

    private static final String
    INSERT = "INSERT INTO usuarios (nome_usuario, senha, nivel_acesso) VALUES (?, ?, ?)";
    
    private static final String
    SELECT_ALL = "SELECT * FROM usuarios";
    
    private static final String
    SELECT_BY_ID = "SELECT * FROM usuarios WHERE id_usuario = ?";
    
    private static final String
    DELETE = "DELETE FROM usuarios WHERE id_usuario = ?";
    
    private static final String
    UPDATE = "UPDATE usuarios SET nome_usuario = ?, senha = ?, nivel_acesso = ? WHERE id_usuario = ?";
    
    @Override
    public void insert(Usuario objeto) {
                
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(INSERT);
            pstm.setString(1, objeto.getNomeUsuario());
            pstm.setString(2, new Cripto().cripgrafaSenha(objeto.getSenha()));
            pstm.setInt(3, objeto.getNivelAcesso());

            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> listaUsuario = new ArrayList<>();

        try {
            Connection conexao = new Conexao().conectar();
            Statement stm = conexao.createStatement();
            ResultSet rs = stm.executeQuery(SELECT_ALL);

            while (rs.next()) {

                listaUsuario.add(criaUsuario(rs));
            }

            return listaUsuario;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
        return listaUsuario;
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(SELECT_BY_ID);
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                return Optional.of(criaUsuario(rs));
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
    public void update(Usuario objeto) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement pstm = conexao.prepareStatement(UPDATE);
            pstm.setString(1, objeto.getNomeUsuario());
            pstm.setString(2, objeto.getSenha());
            pstm.setInt(3, objeto.getNivelAcesso());
            pstm.setInt(5, objeto.getIdUsuario());
            
            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar " + e.getMessage());
        }
    }

    private Usuario criaUsuario(ResultSet rs) throws SQLException {
        int id = rs.getInt("id_usuario");
        String usuario = rs.getString("nome_usuario");
        String senha = rs.getString("senha");
        int nivelAcesso = rs.getInt("nivel_acesso");

        return new Usuario(id, usuario, senha, nivelAcesso);
    }
}
