package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String NOME_BANCO = "mercadotemdetudo";
    private static final String USUARIO_BANCO = "root";
    private static final String SENHA_BANCO = "";

    public Connection conectar() {

        try {
            Connection connection = DriverManager.getConnection(URL + NOME_BANCO, USUARIO_BANCO, SENHA_BANCO);
            return connection;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao Conectar!", 0);
        }

        return null;
    }

    public boolean excutaComando(String comando) {
        Connection con = conectar();

        try {
            PreparedStatement pstm = con.prepareStatement(comando);
            return pstm.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao Conectar!", 0);
        }
        return false;
    }
}
