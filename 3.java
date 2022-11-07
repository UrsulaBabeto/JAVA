/*
 Escreva um algoritmo para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida pelo automóvel e o total
de combustível gasto;
 */
package Tres;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float media = 0.0f;
        float km = 0.0f;
        float gas = 0.0f;
        
        System.out.println("Km percorrido:");
        km = leitor.nextFloat();
        System.out.println("Total de combustivel gasto:");
        gas = leitor.nextFloat();
        
        media = km/gas;
       System.out.println("o consumo médio do automóvel é:" + media); 
    }
}