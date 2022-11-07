/*
 29. Faça um algoritmo que receba o número do mês e mostre o mês correspondente. 
Valide mês inválido;
*/
package VinteENove;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int mes;

        System.out.println("Digite um numero: ");
        mes = leitor.nextInt();

        switch (mes) {
            case 1:
                System.out.println("\nJaneiro\n");
                break;
            case 2:
                System.out.println("\nFevereiro\n");
                break;
            case 3:
                System.out.println("\nMarco\n");
                break;
            case 4:
                System.out.println("\nAbril\n");
                break;
            case 5:
                System.out.println("\nMaio\n");
                break;
            case 6:
                System.out.println("\nJunho\n");
                break;
            case 7:
                System.out.println("\nJulho\n");
                break;
            case 8:
                System.out.println("\nAgosto\n");
                break;
            case 9:
                System.out.println("\nSetembro\n");
                break;
            case 10:
                System.out.println("\nOutubro\n");
                break;
            case 11:
                System.out.println("\nNovembro\n");
                break;
            case 12:
                System.out.println("\nDezembro\n");
                break;
            default:
                System.out.println("\nValor nao corresponde a nenhum mes!\n");
        }
    }
}
