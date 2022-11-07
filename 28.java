/*
 28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 
funcion�rios de acordo com os seguintes crit�rios:
a. 50% para aqueles que ganham menos do que tr�s sal�rios m�nimos;
b. 20% para aqueles que ganham entre tr�s at� dez sal�rios m�nimos;
c. 15% para aqueles que ganham acima de dez at� vinte sal�rios m�nimos;
d. 10% para os demais funcion�rios.
Leia o nome do funcion�rio, seu sal�rio e o valor do sal�rio m�nimo. Calcule o 
seu novo sal�rio reajustado. Escrever o nome do funcion�rio, o reajuste e seu 
novo sal�rio. Calcule quanto � empresa vai aumentar sua folha de pagamento;
*/
package VinteEOito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        int funcionarios;
        int porcento;
        float salarioMinimo = 1200.0f;
        float salarioAtual;
        float reajuste = 0;
        float novoSalario = 0;
        float totalFolha = 0;
        float totalAtualizado = 0;

        System.out.println("Numeros de funcionarios para calcular o reajuste:");
        funcionarios = leitor.nextInt();

        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Nome funcionario: ");
            nome = leitor.next();
            System.out.println("Salario atual: ");
            salarioAtual = leitor.nextFloat();

            if (salarioAtual < salarioMinimo * 3) {
                porcento = 50;
                novoSalario = (salarioAtual * 50 / 100)+salarioAtual;
            } else if (salarioAtual > salarioMinimo * 3 && salarioAtual < salarioMinimo * 5) {
                porcento = 20;
                novoSalario = (salarioAtual * 20 / 100)+salarioAtual;                
            } else if (salarioAtual > salarioMinimo * 10 && salarioAtual < salarioMinimo * 20) {
                porcento = 15;
                novoSalario = (salarioAtual * 15 / 100)+salarioAtual;
            } else {
                porcento = 10;
                novoSalario = (salarioAtual * 10 / 100)+salarioAtual;
            }
            System.out.println("O funcionario: " + nome + " \n"
                    + " com salario atual de RS" + salarioAtual + " \n"
                    + " vai passar a receber RS" + novoSalario + "\n"
                    + "com um reajuste de " + porcento + "%.");
            totalFolha = salarioAtual + totalFolha;
            totalAtualizado = totalAtualizado + novoSalario;
        }
        System.out.println("A empresa que tinha uma folha de pagamento de RS" + totalFolha + ".\n"
                + " vai aumentar sua folha de pagamento em RS" + totalAtualizado + ".\n"
                + "Uma diferenca de RS" + (totalAtualizado - totalFolha));
    }
}
