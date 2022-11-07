/*
 23. Faça um algoritmo que receba um número e mostre uma mensagem caso este 
número seja maior que 80, menor que 25 ou igual a 40;
*/
package VinteETres;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char continuar = 's';
        int numero;

        while(continuar == 's' || continuar == 'S'){
            System.out.println("Digite um numero:");
            numero = leitor.nextInt();

            if (numero == 40) {
                System.out.println("Numero igual a 40");
            } else if (numero > 80) {
                System.out.println("Numero maior que 80");
            } else if (numero < 25) {
                System.out.println("Numero menor que 25");
            } else {
                System.out.println("Nao esta no paramentro, tente novamente");
            }

            System.out.print("Deseja continuar: S ou N");
            continuar = leitor.next().charAt(0);
        }
    }
}