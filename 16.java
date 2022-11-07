/*
16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9);
 */
package Dezesseis;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float numero;
        float numero2;
        float numero3;
        float media;

        System.out.println("Numero:");
        numero = leitor.nextFloat();
        System.out.println("Numero 2:");
        numero2 = leitor.nextFloat();
        System.out.println("Numero 3:");
        numero3 = leitor.nextFloat();

        media = (numero + numero2 + numero3) / 3;
        System.out.println("Aluno com media:" + media);

        if (media >= 7) {
            System.out.println("Aluno APROVADO");
        } else if (media <= 5) {
            System.out.println("Aluno REPROVADO");
        } else {
            System.out.println("Aluno em RECUPERACAO");
        }
    }
}
