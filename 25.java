/*
 25. Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou diferentes. 
Caso eles sejam iguais imprima uma mensagem dizendo que eles s�o iguais. Caso
sejam diferentes, informe qual n�mero � o maior, e uma mensagem que s�o diferentes;
*/
package VinteECinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
             
        int numero;
        int numero1;

        System.out.println("Digite um numero:");
        numero = leitor.nextInt();
        System.out.println("Digite outro numero:");
        numero1 = leitor.nextInt();

        if (numero == numero1) {
            System.out.println("Os numeros sao iguais");

        } else {
            if (numero > numero1) {
                System.out.println("Os numero sao diferentes, " + numero + " � maior");
            } else {
                System.out.println("Os numero sao diferentes, " + numero1 + " � maior");
            }
        }
    }
}
