/*
 Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total 
de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas
pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
 */

package POO4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int resp = 0;
        Scanner leitor = new Scanner(System.in);
        elevador e = new elevador(0, 10, 10, 0);

        while (resp != 5) {
            System.out.println(" 1-Entra \n 2-Sai \n 3-Sobe \n 4-Desce \n 5-Encerrar programa");
            resp = leitor.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Numero de pessoas: " +e.Entra());
                    break;
                case 2:
                    System.out.println("Numero de pessoas: " + e.Sai());
                    break;
                case 3:
                    System.out.println(e.Sobe() + " andar");
                    break;
                case 4:
                    System.out.println(e.Desce() + " andar");
                    break;
                case 5:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Numero invalido, tente novamente");
                    break;
            }
        }
    }
}
-----------------------------

package POO4;

public class elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    // parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    public elevador(int andarAtual, int totalAndares, int capacidade, int pessoas) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoas = pessoas;
    }

    //acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço)
    public int Entra() {
        if (pessoas < capacidade) {
            this.setPessoas(pessoas + 1);
        }
        return pessoas;
    }

    //para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele)
    public int Sai() {
        if (pessoas > 0) {
            this.setPessoas(pessoas - 1);
        }
        return pessoas;
    }

    //para subir um andar (não deve subir se já estiver no último andar);
    public int Sobe() {
        if (andarAtual < totalAndares) {
            this.setAndarAtual(andarAtual+1);
        }
        return andarAtual;
    }

    //para descer um andar (não deve descer se já estiver no térreo)
    public int Desce() {
        if (andarAtual > 0) {
            this.setAndarAtual(andarAtual-1);
        }
        return andarAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

}

