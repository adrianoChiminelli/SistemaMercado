package controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Usuario;

public class UsuarioController {

    public boolean excluiUsuario(int id, String nome) {
        UIManager.put("OptionPane.okButtonText", "Sim");
        UIManager.put("OptionPane.cancelButtonText", "Não");
        int opcao = JOptionPane.showConfirmDialog(null, "Você está preste a excluir o cliente: " + nome + "\nDeseja continuar?", "Confirmar exclusão", 2, 2);

        if (opcao == 0) {
            new Usuario().delete(id);
            return true;
        }

        return false;
    }

    public boolean salvaUsuario(String usuario, String senha, String confSenha, String nvAcesso) {

        int numNvAcesso = converteNvAcesso(nvAcesso);

        if (senha.equals(confSenha) && senha.length() > 0) {

            if (usuario != null && usuario.length() > 0 && (numNvAcesso >= 0 || numNvAcesso <= 2)) {
                Usuario user = new Usuario(usuario, senha, numNvAcesso);
                user.salvar(user);
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Preencha as informações Corretamente!", "Erro ao cadastrar", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "As senhas não coincidem! Tente novamente.", "Atenção", 0);
        }
        return false;
    }

    public boolean alteraUsuario(int id, String usuario, String senha, String confSenha, String nvAcesso) {

        int numNvAcesso = converteNvAcesso(nvAcesso);

        if (senha.equals(confSenha) && senha.length() > 0) {
            if (id != 0 && usuario != null && usuario.length() > 0 && (numNvAcesso >= 0 || numNvAcesso <= 2)) {
                Usuario user = new Usuario(id, usuario, senha, numNvAcesso);
                user.alterar(user);
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Preencha as informações Corretamente!", "Erro ao cadastrar", 0);
            }
        } else {

        }

        return false;
    }

    public TableModel montarTabela(JTable tbUsuarios) {
        DefaultTableModel modelo = (DefaultTableModel) tbUsuarios.getModel();
        modelo.setRowCount(0);

        List<Usuario> listaUsuarios = new Usuario().getListaUsuario();

        for (Usuario usuario : listaUsuarios) {
            int id = usuario.getIdUsuario();
            String nomeUsuario = usuario.getNomeUsuario();
            String nvAcesso = converteNvAcesso(usuario.getNivelAcesso());

            modelo.addRow(new Object[]{id, nomeUsuario, nvAcesso});
        }

        return modelo;
    }

    public int converteNvAcesso(String nvAcesso) {
        return switch (nvAcesso) {
            case "Inativo" ->
                0;
            case "Padrão" ->
                1;
            case "Admin" ->
                2;
            default ->
                0;
        };
    }

    private String converteNvAcesso(int nvAcesso) {
        return switch (nvAcesso) {
            case 0 ->
                "Inativo";
            case 1 ->
                "Padrão";
            case 2 ->
                "Admin";
            default ->
                "Inativo";
        };
    }

}
