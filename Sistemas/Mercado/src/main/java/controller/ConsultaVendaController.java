package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Cliente;
import model.Produto;
import model.Venda;
import utils.StringFormat;

public class ConsultaVendaController {

    public TableModel montaTabelaVenda(JTable tbVenda) {
        DefaultTableModel modelo = (DefaultTableModel) tbVenda.getModel();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        modelo.setRowCount(0);

        List<Venda> listaVenda = new Venda().getListaVenda();
        try {
            for (Venda venda : listaVenda) {
                int id = venda.getIdVendas();
                String cliente = new Cliente().getCliente(venda.getFkCliente()).orElseThrow().getNomeCliente();
                int quant = venda.getQuantidadeTotal();
                String valor = new StringFormat().doubleParaReal(venda.getValorTotal());
                String data = format.format(venda.getData());

                modelo.addRow(new Object[]{id, cliente, quant, valor, data});
            }
        } catch (NoSuchElementException e) {
        }

        return modelo;
    }

    public TableModel montaTabelaProduto(JTable tbProdutos, int id) {
         DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
         
         List<Produto> listaProduto = new Venda().getListaProduto(id);
         
           for (Produto produto : listaProduto) {
                int idProd = produto.getIdProduto();
                String descricao = produto.getDescricaoProduto();
                int quant = produto.getIdProduto();
                String valor = new StringFormat().doubleParaReal(produto.getValor());

                modelo.addRow(new Object[]{idProd, descricao, quant, valor});
            }
         
         return modelo;
    }

}
