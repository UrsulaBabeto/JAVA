/*
12. O custo de um carro novo ao consumidor� a soma do custo de f�brica mais o
percentual do distribuidor e dos impostos aplicados (primeiro os impostos s�o
aplicados sobre o custo de f�brica, e depois o percentual do distribuidor sobre
o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de f�brica de um carro e informe o 
custo ao consumidor do mesmo;
 */
package Doze;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float custo;
        float percentualFabrica = 0.28f;
        float impostos = 0.45f;
        float calculo;
        float total;

        System.out.println("Custo de fabrica:");
        custo = leitor.nextFloat();
        calculo = (custo * percentualFabrica) + custo;
        total = (calculo * impostos) + calculo;

        System.out.println("O total para a revenda � de RS" + total);
    }
}
