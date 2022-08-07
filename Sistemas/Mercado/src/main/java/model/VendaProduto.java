package model;

public class VendaProduto {

    private int idProduto, idVenda, quantidade;

    public VendaProduto() {
    }

    public VendaProduto(int idProduto, int quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public VendaProduto(int idProduto, int idVenda, int quantidade) {
        this.idProduto = idProduto;
        this.idVenda = idVenda;
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
