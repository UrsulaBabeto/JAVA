/*
15. Faça um algoritmo que receba um número e diga se este número está no 
intervalo entre 100 e 200;
 */
package Quinze;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Numero:");
        numero = leitor.nextInt();

        if (numero > 100 && numero < 200) {
            System.out.println("O numero " + numero + " esta no intervalo de 100 e 200");
        }else{
            System.out.println("O numero " + numero + " NAO esta no intervalo de 100 e 200");
        };
    }
 }
