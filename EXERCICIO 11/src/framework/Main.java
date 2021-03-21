package framework;
import model.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Carrinho i1  = new Carrinho();

    int menu;
        do{
            System.out.println("\n---------------------------------"+
                    "\n|>       |GEIGER SYSTEM|       <|");
            System.out.println("\n---------------------------------"+
                    "\n|x|           |MENU|          |x|"+
                    "\n---------------------------------");
            System.out.println("[1] Cadastrar Cliente\n"+
                    "[2] Cosultar Dados\n"+
                    "[0] Sair");


            menu = input.nextInt();

        switch (menu)
        {
            case 1:
                System.out.println("---CADASTRAR PRODUTO---");
                Produto p1 = new Produto();
                input.nextLine();
                System.out.println("Digite o Codigo: ");
                p1.setCodigo(input.nextInt());
                System.out.println("Descrição do produto: ");
                p1.setDescProduto(input.next());
                System.out.println("Preço: ");
                p1.setPreco(input.nextFloat());
                System.out.println("Quantidade: ");
                p1.setQuantidade(input.nextInt());
                i1.cadastrarProduto(p1);
                System.out.println("Produto Cadastrado com Sucesso!!");

                break;
            case 2:
                System.out.println("---CONSULTAR DADOS---");
               if(i1.getCadastro().isEmpty())
               {
                   System.out.println("Não hà Produtos Cadastrados!!");
            }else{
                   System.out.println(i1);
               }

                break;


            case 0:
                System.out.println("OBRIGADO POR USAR O PROGRAMA :)");
                break;

            default:
                System.out.println("---------------------------------------");
                System.out.println("         Erro Opção invalalida: ");
                System.out.println("---------------------------------------");
                break;


        }

        }while(menu!=0);

    }

}
