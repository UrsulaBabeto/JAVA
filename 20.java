/*
  20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos
com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o
valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado 
de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema
deverá perguntar se deseja continuar calculando desconto até que a resposta s
eja: “(N) Não”.Informar total de carros com ano até 2000 e total geral;
*/
package Vinte;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       System.out.println("---------------------------------");
       System.out.println("---------CARANGO VELHO-----------");
       System.out.println("---------------------------------");    
       
       char continuar = 's';
       int carro;
       float valor;
       float desconto;
       
       while (continuar == 's' || continuar == 'S'){
           
           System.out.println("Qual o ano do carro?");
           carro = leitor.nextInt();
           System.out.println("Digite o valor do carro:");
           valor = leitor.nextFloat();
           
           if(carro <= 2000){
            desconto = valor-(valor*12/100);
            System.out.println("O seu carro saira por: RS"+ desconto); 
           }else{
             desconto = valor-(valor*7/100);
            System.out.println("O seu carro saira por: RS"+ desconto) ;     
           };
           
           System.out.println("Deseja continuar? S - Sim / N - Nao");
            continuar = leitor.next().charAt(0);
       }
    }
}
