/*
11. Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre 
o valor de venda. Sabe-se que o pre�o de custo receber� um acr�scimo de acordo
com um percentual informado pelo usu�rio;
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
