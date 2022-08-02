package controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Produto;

public class FormProdutoController {

    public boolean salvaProduto(String descricao, int quant, Double valor) {

        if (descricao != null && descricao.length() > 0 && quant != 0 && valor != null) {
            Produto pro = new Produto(descricao, quant, valor);
            pro.salvar(pro);
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "Preencha as informações Corretamente!", "Erro ao cadastrar", 0);
        }
        return false;
    }

    public boolean alteraProduto(int id, String descricao, int quant, Double valor) {

        if (id != 0 && descricao != null && descricao.length() > 0 && quant != 0 && valor != 0) {
            Produto pro = new Produto(id, descricao, quant, valor);
            pro.alterar(pro);
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "Preencha as informações Corretamente!", "Erro ao cadastrar", 0);
        }
        return false;
    }

    public TableModel montarTabela(JTable tbProdutos) {
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setRowCount(0);

        List<Produto> listaProduto = new Produto().getListaProduto();

        for (Produto produto : listaProduto) {
            int id = produto.getIdProduto();
            String descricao = produto.getDescricaoProduto();
            int quant = produto.getQuantidadeEstoque();
            Double valor = produto.getValor();

            modelo.addRow(new Object[]{id, descricao, quant, valor});
        }

        return modelo;
    }

    public boolean excluiProduto(int id, String descricao) {
        UIManager.put("OptionPane.okButtonText", "Sim");
        UIManager.put("OptionPane.cancelButtonText", "Não");
        int opcao = JOptionPane.showConfirmDialog(null, "Você está preste a excluir o produto: " + descricao + "\nDeseja continuar?", "Confirmar exclusão", 2, 2);

        if (opcao == 0) {
            new Produto().delete(id);
            return true;
        }

        return false;
    }

}
