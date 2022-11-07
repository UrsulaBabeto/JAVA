/*
14. Escreva um algoritmo que leia dois valores inteiro distintos e informe 
qual é o maior;
 */
package Quatorze;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        int numero2;

        System.out.println("Numero:");
        numero = leitor.nextInt();
        System.out.println("Numero 2:");
        numero2 = leitor.nextInt();

        if (numero > numero2) {
            System.out.println(numero + " que e o primeiro numero e maior que o segundo: " + numero2);

        } else {
            System.out.println(numero2 + " que e o segundo numero e maior que o primeiro " + numero);
        }
    }
}
