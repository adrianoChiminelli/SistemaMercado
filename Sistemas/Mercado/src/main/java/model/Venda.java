package model;

public class Venda {

    private Integer idVendas, fkCliente, quantidadeTotal;
    private Double valorTotal;

    public Venda() {
    }

    public Venda(Integer fkCliente, Integer quantidadeTotal, Double valorTotal) {
        this.fkCliente = fkCliente;
        this.quantidadeTotal = quantidadeTotal;
        this.valorTotal = valorTotal;
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

}
