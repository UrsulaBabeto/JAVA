/*
 30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva 
em ordem crescente;
*/
package Trinta;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int aux = 0;

        System.out.println("numero 1");
        n1 = leitor.nextInt();
        System.out.println("numero 2");
        n2 = leitor.nextInt();
        System.out.println("numero 3");
        n3 = leitor.nextInt();

        if (n1 > n3) {
            aux = n3;
            n3 = n1;
            n1 = aux;
        }

        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        System.out.println(n1 + ", " + n2 + ", " + n3);
    }
}
