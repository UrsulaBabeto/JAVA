/*
 * 2. Fa�a um algoritmo que receba dois n�meros e ao final mostre a soma, subtra��o,
multiplica��o e a divis�o dos dois n�meros lidos;
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
