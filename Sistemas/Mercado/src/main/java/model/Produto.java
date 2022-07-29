package model;

public class Produto {

    private Integer idProduto, quantidadeEstoque;
    private String descricaoProduto;
    private Double valor;

    public Produto() {
    }

    public Produto(String descricaoProduto, Integer quantidadeEstoque, Double valor) {
        this.descricaoProduto = descricaoProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valor = valor;
    }

    public Produto(Integer idProduto, String descricaoProduto, Integer quantidadeEstoque, Double valor) {
        this.idProduto = idProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valor = valor;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
