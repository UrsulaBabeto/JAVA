/*
 31. Dados três valores A, B e C, em que A e B são números reais e C é um 
caractere, pede-se para imprimir o resultado da operação de A por B se C for um
símbolo de operador aritmético; caso contrário deve ser impressa uma mensagem de
operador não definido. Tratar erro de divisão por zero;
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
