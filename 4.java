/*
Escreva um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo
e o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que 
este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar 
o seu nome, o sal�rio fixo e sal�rio no final do m�s;

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
