/*
 8. Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em 
real (R$) de um valorlido em d�lar (US$). O algoritmo dever� solicitar o valor
da cota��o do d�lar e tamb�m aquantidade de d�lares dispon�veis com ousu�rio;
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

