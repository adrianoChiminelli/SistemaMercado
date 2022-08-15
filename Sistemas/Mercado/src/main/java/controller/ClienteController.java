package controller;

import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import utils.UtilCPF;

public class ClienteController {

    UtilCPF util = new UtilCPF();

    public boolean salvaCliente(String nomeCli, String cpf, String email, String tel) {
        Cliente cli = new Cliente();
        if (cli.cpfJaCadastrado(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF já cadastrador!", "Erro ao cadastrar", 0);
            return false;
        }

        if (util.validaCPF(cpf)) {
            if (nomeCli != null && nomeCli.length() > 0 && email != null
                    && cpf.length() > 0 && tel != null && tel.length() > 0) {
                cli = new Cliente(nomeCli, cpf, tel, email);
                cli.salvar(cli);
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Preencha as informações Corretamente!", "Erro ao cadastrar", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido ou digitado incorretamente!", "Erro ao cadastrar", 0);
        }
        return false;
    }

    public boolean alteraCliente(int id, String nomeCli, String cpf, String email, String tel) {
       Cliente cli = new Cliente();
        Optional<Cliente> cliente = cli.getCliente(id);
        String cpfAtual = cliente.get().getCpf();
        
        if (cli.cpfJaCadastrado(cpf) && !cpfAtual.equals(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF já cadastrador!", "Erro ao cadastrar", 0);
            return false;
        }

        if (util.validaCPF(cpf)) {
            if (id != 0 && nomeCli != null && nomeCli.length() > 0 && email != null
                    && cpf.length() > 0 && tel != null && tel.length() > 0) {
                cli = new Cliente(id, nomeCli, cpf, tel, email);
                cli.alterar(cli);
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Preencha as informações Corretamente!", "Erro ao cadastrar", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido ou digitado incorretamente!", "Erro ao cadastrar", 0);
        }
        return false;
    }

    public DefaultTableModel montarTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);

        List<Cliente> listaClientes = new Cliente().getListaCliente();

        for (Cliente cliente : listaClientes) {
            int id = cliente.getIdCliente();
            String nomeCli = cliente.getNomeCliente();
            String cpf = cliente.getCpf();
            String email = cliente.getEmail();
            String tel = cliente.getTelefone();

            modelo.addRow(new Object[]{id, nomeCli, cpf, email, tel});
        }

        return modelo;
    }

    public boolean excluiCliente(int id, String nome) {
        UIManager.put("OptionPane.okButtonText", "Sim");
        UIManager.put("OptionPane.cancelButtonText", "Não");
        int opcao = JOptionPane.showConfirmDialog(null, "Você está preste a excluir o cliente: " + nome + "\nDeseja continuar?", "Confirmar exclusão", 2, 2);

        if (opcao == 0) {
            new Cliente().delete(id);
            return true;
        }

        return false;
    }

}
