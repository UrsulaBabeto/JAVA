/*
 28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 
funcionários de acordo com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o 
seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e seu 
novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento;
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
