/*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo
e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que 
este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar 
o seu nome, o salário fixo e salário no final do mês;

 */
package Quatro;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float salario = 0.0f;
        float vendas = 0.0f;
        float comissao = 0.0f;

        System.out.println("Nome do Funcionario: ");
        String nome = leitor.next();

        System.out.println("Salario: ");
        salario = leitor.nextFloat();

        System.out.println("Total de vendas mes (RS):");
        vendas = leitor.nextFloat();

        comissao = (vendas * 15) / 100 + salario;

        System.out.println("Funcionario: " + nome + " Salario: R$" + salario);
        System.out.println("Salario + comissao: R$ "+ comissao);
   
    }
}
