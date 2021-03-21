package model;

public class Produto
{
    private int codigo,quantidade;
    private String descProduto;
    private float preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public Produto() {}

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    @Override
    public String toString() {
        return  "Codigo: "+this.codigo+" - "+
                "Produto: "+this.descProduto+" - "+
                "Preço: "+this.preco+" - "+
                "Quantidade: "+this.quantidade;
    }
}
