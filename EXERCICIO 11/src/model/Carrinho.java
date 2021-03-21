package model;
import java.util.ArrayList;
public class Carrinho
{
    private ArrayList<Produto> cadastro;


    public Carrinho()
    {
        this.cadastro = new  ArrayList<>();
    }


    public ArrayList<Produto> getCadastro() {
        return cadastro;
    }


    public void setCadastro(ArrayList<Produto> cadastro) {
        this.cadastro = cadastro;
    }



    public void cadastrarProduto(Produto p1)
    {
        this.cadastro.add(p1);
    }

    @Override
    public String toString() {
        return "Produtos Cadastrados: "+"\n"+this.cadastro;
    }
}
