/*
32. Escreva um algoritmo que leia três valores inteiros e verifique se eles 
podem ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo 
que eles formam: equilátero, isóscele ou escaleno. Propriedade: o comprimento de
cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois
lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;

 */
package TrintaEDois;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;
        System.out.println("LADO 1:");
        lado1 = leitor.nextInt();
        System.out.println("LADO 2:");
        lado2 = leitor.nextInt();
        System.out.println("LADO 3:");
        lado3 = leitor.nextInt();

        if (lado1 + lado2 < lado3 && lado2 + lado3 < lado1 && lado3 + lado1 < lado2) {
            System.out.println("NAO E TRIANGULO");
        } else {
            if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
                System.out.println("Equilátero");
            } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
                System.out.println("Escaleno");
            } else {
                System.out.println("Isosceles");
            }
        }
    }
}
