/*
24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou 
zero para cada número;
*/
package vinteEQuatro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
       
        char continuar = 's';
        int numero;

        while (continuar == 's' || continuar == 'S') {
            System.out.println("Digite um numero:");
            numero = leitor.nextInt();;

            if (numero == 0) {
                System.out.println("numero igual a zero");
            } else if (numero > 0) {
                System.out.println("numero MAIOR que zero");
            } else {
                System.out.println("numero MENOR que a zero");
            }
            System.out.println("Deseja continuar? s - sim / n - nao");
            continuar = leitor.next().charAt(0);
        }
    }
}
