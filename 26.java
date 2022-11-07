/*
 26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso 
o usuário digite um número que não esteja neste intervalo, exibir a seguinte 
mensagem: número inválido;
*/
package VInteESeis;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero:");
        numero = leitor.nextInt();

        if (numero == 1) {
            System.out.println("Voce digitou o numero 'Um'");
        } else if (numero == 2) {
            System.out.println("Voce digitou o numero 'Dois'");
        } else if (numero == 3) {
            System.out.println("Voce digitou o numero 'Tres'");
        } else if (numero == 4) {
            System.out.println("Voce digitou o numero 'Quatro'");
        } else if (numero == 5) {
            System.out.println("Voce digitou o numero 'Cinco'");
        } else {
            System.out.println("Erro.. tente novamente");
        }  
        
        /*OUTRA OPCAO

        int numero;

        System.out.println("Digite um numero:");
        numero = leitor.nextInt();
        
        switch (numero){
                case 1:
                    System.out.println("Voce digitou o numero 'Um'");
                    break;
                case 2:
                    System.out.println("Voce digitou o numero 'Dois'");
                    break;
                case 3:
                    System.out.println("Voce digitou o numero 'Tres'");
                    break;
                case 4:
                    System.out.println("Voce digitou o numero 'Quatro'");
                    break;
                case 5:
                    System.out.println("Voce digitou o numero 'Cinco'");
                    break;
                default:
                     System.out.println("Erro.. tente novamente");
        }*/
    }
}
