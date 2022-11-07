/*
 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em 
real (R$) de um valorlido em dólar (US$). O algoritmo deverá solicitar o valor
da cotação do dólar e também aquantidade de dólares disponíveis com ousuário;
 */
package Oito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float dolar = 0.0f;
        float real = 0.0f;
        float cotacao = 0.0f;
        
        System.out.println("Qual a cotacao do dia do Dolar:");
         dolar = leitor.nextFloat();
         
        System.out.println("Quantos reais voce quer converter? R$"); 
        real = leitor.nextFloat();
        
        cotacao = real/dolar;
        System.out.println("A conversao e: "+ cotacao);
    }
}

