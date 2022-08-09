package controller;

import dao.ClienteDAO;
import dao.ProdutoDAO;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Produto;
import model.Venda;
import model.VendaProduto;
import utils.StringFormat;

public class FormVendaController {

    public Optional<Cliente> selecionaCliente(int id) {
        return new ClienteDAO().findById(id);
    }

    public Optional<Produto> selecionaProduto(int id) {
        return new ProdutoDAO().findById(id);
    }

    public void adicionaTabela(JTable tabela, int id, int qtd, int estoque) {
        Optional<Produto> optProduto = new ProdutoDAO().findById(id);
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        StringFormat format = new StringFormat();

        if (optProduto.isPresent()) {
            Produto produto = optProduto.get();
            String nomeProd = produto.getDescricaoProduto();
            Double precoUni = produto.getValor();
            String valor = format.doubleParaReal(precoUni * qtd);

            if (modelo.getRowCount() != 0) {
                int idExistente;
                int qtdExistente;

                for (int linha = 0; linha < modelo.getRowCount(); linha++) {
                    idExistente = (int) modelo.getValueAt(linha, 0);
                    qtdExistente = (int) modelo.getValueAt(linha, 3);

                    if (id == idExistente) {
                        int novaQtd = qtd + qtdExistente;
                        if (estoque >= novaQtd) {
                            modelo.setValueAt(novaQtd, linha, 3);
                            modelo.setValueAt(format.doubleParaReal(novaQtd * precoUni), linha, 4);
                            tabela.setModel(modelo);
                            return;
                        } else {
                            modelo.setValueAt(estoque, linha, 3);
                            modelo.setValueAt(format.doubleParaReal(estoque * precoUni), linha, 4);
                            tabela.setModel(modelo);
                            return;
                        }
                    }
                }
            }

            modelo.addRow(new Object[]{id, nomeProd, precoUni, qtd, valor});
            tabela.setModel(modelo);

        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado, selecione um ID válido.", "Atenção", 2);
        }
    }

    public void removeTabela(JTable tabela, int linha) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        modelo.removeRow(linha);

        tabela.setModel(modelo);
    }

    public boolean salvaVenda(Venda venda, List<VendaProduto> listaProduto) {

        if (venda.validaCampos()) {
            if (!listaProduto.isEmpty()) {
                new Venda().salvaVenda(venda, listaProduto);
                new Produto().baixaEstoque(listaProduto);
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Preencha os dados corretamente.", "Atenção!", 0);
        return false;
    }

}
