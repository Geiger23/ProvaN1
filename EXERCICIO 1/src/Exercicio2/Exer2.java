package Exercicio2;

import java.util.Scanner;

public class Exer2
{
    public static void main(String[] args){
        Scanner exer2 = new Scanner(System.in);
        String nome;
        double valor;
        double soma;
        double resultado;

        System.out.println("Escreva Seu nome: ");
        nome = exer2.next();
        System.out.println("Digite o Valor: ");
        valor = exer2.nextDouble();

soma = valor*0.25;
resultado = valor-soma;

        System.out.println("Nome: "+nome);
        System.out.println(" Valor Total : "+resultado);




}



}
