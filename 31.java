/*
 31. Dados tr�s valores A, B e C, em que A e B s�o n�meros reais e C � um 
caractere, pede-se para imprimir o resultado da opera��o de A por B se C for um
s�mbolo de operador aritm�tico; caso contr�rio deve ser impressa uma mensagem de
operador n�o definido. Tratar erro de divis�o por zero;
*/
package TrintaEUm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
   
        float a;
        float b;
        String c;

        System.out.println("Digite um numero: ");
        a = leitor.nextFloat();
        System.out.println("Digite outro numero:");
        b = leitor.nextFloat();
        System.out.println("Digite o operador:");
        c = leitor.next();

            switch (c) {
                case "+":
                    c = Float.toString(a + b);
                    System.out.println("O resultado da operacao e: " + a+ " + "+ b + " = " + c);
                    break;
                case "-":
                    c = String.valueOf(a - b);
                    System.out.println("O resultado da operacao e: " + a + " - " + b + " = " + c);
                    break;
                case "*":
                    c = String.valueOf(a * b);
                    System.out.println("O resultado da operacao e: " + a + " x " + b + " = " + c);
                    break;
                case "/":
                    c = String.valueOf(a / b);
                    System.out.println("O resultado da operacao e: " + a + " / " + b + " = " + c);
                    break;
                default:
                    System.out.println("Operador nao definido");
            } 
        }
    }
