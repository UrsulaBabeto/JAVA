/*
  13. Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este 
n�mero seja maior que 10;
*/
package Treze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;

        System.out.println("Numero:");
        numero = leitor.nextInt();
        if (numero > 10) {
            System.out.println("Maior que 10");
        } else {
            System.out.println("Menor que 10");
        }
    }
}
