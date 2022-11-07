/*
 21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e
saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório.
Informe os totais;
*/
package VinteEUm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char continuar = 's';
        String nome;
        char genero;
        int idade;
        char saude;
        int contador = 0;

        while (continuar == 's' || continuar == 'S') {

            System.out.println("Nome:");
            nome = leitor.next();
            System.out.println("Bem de saude? S - sim / N - nao");
            saude = leitor.next().charAt(0);

            if (saude == 's' || saude == 'S') {
                System.out.println("Idade:");
                idade = leitor.nextInt();
                if (idade >= 18 && idade < 60) {
                    System.out.println("Sexo: M - masculino / F - Feminino");
                    genero = leitor.next().charAt(0);
                    if (idade >= 18 || idade < 60 && saude == 's' || saude == 'S'
                            && genero == 'm' || genero == 'M') {
                        contador = contador + 1;
                    }
                }
            }

            System.out.println("Deseja continuar: s - SIM/ n - NAO");
            continuar = leitor.next().charAt(0);
        }
        System.out.println("Temos um total de:" + contador + " pessoas aptas ao servico militar");
    }
}
