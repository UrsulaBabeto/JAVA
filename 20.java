/*
  20. A concession�ria de ve�culos �CARANGO VELHO� est� vendendo os seus ve�culos
com desconto. Fa�a um algoritmo que calcule e exiba o valor do desconto e o
valor a ser pago pelo cliente de v�rios carros. O desconto dever� ser calculado 
de acordo com o ano do ve�culo. At� 2000 - 12% e acima de 2000 - 7%. O sistema
dever� perguntar se deseja continuar calculando desconto at� que a resposta s
eja: �(N) N�o�.Informar total de carros com ano at� 2000 e total geral;
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
