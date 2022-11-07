/*
11. Faça um algoritmo que receba o preço de custo de um produto e mostre 
o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo
com um percentual informado pelo usuário;
 */
package Onze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float valor = 0.0f;
        int acrescimo;
        float revenda = 0.0f;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor bruto do produto:");
        valor = leitor.nextFloat();
        System.out.println("Qual o valor do acrescimo (%):");
        acrescimo = leitor.nextInt();
        
        revenda = valor*acrescimo/100;
        
        System.out.println("O valor de revenda com "+acrescimo+ "% de acrescimo e: RS"+ (valor+revenda));
        
    }
}
