/*
6. Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores 
de forma que a vari�vel A passe a possuir ovalor da vari�vel B e a vari�vel B 
passe a possuir o valor da vari�vel A.Apresentar osvalores trocados;
 */
package Seis;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int aux = 0;
        System.out.println("Numero:");
        int a = leitor.nextInt();
        System.out.println("Numero:");
        int b = leitor.nextInt();
        System.out.println("A: " + a + " B: " + b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("A: " + a + " B: " + b);
    }
}
