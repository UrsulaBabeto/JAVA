/*
 * 2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
multiplicação e a divisão dos dois números lidos;
 */
package Dois;

 import java.util.Scanner;

public class App {
     public static void main(String[] args) {
      Scanner  leitor = new Scanner (System.in);
      System.out.println("Numero 1:");
      int n1 = leitor.nextInt();
      System.out.println("Numero 2:");
      int n2 = leitor.nextInt();
      
     System.out.println(n1+n2);
     System.out.println(n1-n2);
     System.out.println(n1*n2);
     System.out.println(n1/n2);
     System.out.println(n1%n2);
    }
}
