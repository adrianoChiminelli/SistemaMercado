package model;

import dao.VendaProdutoDAO;
import dao.VendasDAO;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Venda {

    private Integer idVendas, fkCliente, quantidadeTotal;
    private Double valorTotal;
    private String vendedor, metodoPagamento;
    private Date data;

    public Venda() {
    }

    public Venda(Integer fkCliente, Integer quantidadeTotal, Double valorTotal, String vendedor, String metodoPagamento, Date data) {
        this.fkCliente = fkCliente;
        this.quantidadeTotal = quantidadeTotal;
        this.valorTotal = valorTotal;
        this.vendedor = vendedor;
        this.metodoPagamento = metodoPagamento;
        this.data = data;
    }

    public Venda(Integer idVendas, Integer fkCliente, Integer quantidadeTotal, Double valorTotal, String vendedor, String metodoPagamento, Date data) {
        this.idVendas = idVendas;
        this.fkCliente = fkCliente;
        this.quantidadeTotal = quantidadeTotal;
        this.valorTotal = valorTotal;
        this.vendedor = vendedor;
        this.metodoPagamento = metodoPagamento;
        this.data = data;
    }

    public Integer getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(Integer idVendas) {
        this.idVendas = idVendas;
    }

    public Integer getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(Integer fkCliente) {
        this.fkCliente = fkCliente;
    }

    public Integer getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(Integer quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean validaCampos() {
        return fkCliente != 0
                && quantidadeTotal != 0
                && valorTotal != 0
                && vendedor != null
                && vendedor.length() > 0
                && metodoPagamento != null
                && metodoPagamento.length() > 0
                && data != null;
    }

    public void salvaVenda(Venda venda, List<VendaProduto> listaProduto) {
        new VendaProdutoDAO().salvarVenda(venda, listaProduto);
    }

    public List<Venda> getListaVenda() {
        return new VendasDAO().findAll();
    }

    public List<Produto> getListaProduto(int id) {
        return new VendasDAO().findAllProducts(id);
    }

    public Optional<Venda> getVenda(int id) {
        return new VendasDAO().findById(id);
    }

    public List<Venda> getVendasByCliente(int id) {
        return new VendasDAO().findByCliente(id);
    }

    public List<Venda> getVendasByCliente(String nome) {
        return new VendasDAO().findByCliente(nome);
    }

}
