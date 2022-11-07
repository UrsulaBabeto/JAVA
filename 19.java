/*
 19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome
e se ela é homem ou mulher. No final informe total de homens e de mulheres;
 */
package Dezenove;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        char genero;
        int cont = 0;
        int cont1 = 0;
        int i = 0;

        for (; i < 5; i++) {

            System.out.println("Nome:");
            nome = leitor.next();

            System.out.println("Sexo:(M - masculino / F - feminino)");
            genero = leitor.next().charAt(0);

            if (genero == 'm' || genero == 'M') {
                cont = cont + 1;
                System.out.println(nome + " e um homem");
            } else if (genero == 'F' || genero == 'f') {
                cont1 = cont1 + 1;
                System.out.println(nome + " e uma mulher");
            } else {
                System.out.println("ERRO... TENTE NOVAMENTE...");
            }
        }

        System.out.println("no total temos:" + cont + " homens e " + cont1 + " mulheres");
    }
}
