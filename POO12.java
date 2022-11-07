/*
 Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:
a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
b. void removerPessoa(String nome); //remove a pessoa do array
c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda. */

package POO12;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int resp;
        Agenda a = new Agenda();
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("1 - Armazenar \n"
                    + "2 - Excluir \n"
                    + "3 - Buscar \n"
                    + "4 - Imprimir agenda completa \n"
                    + "5 - Imprimir dados cliente \n"
                    + "6 - Sair");
            resp = leitor.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Digite o Nome, a idade e a Altura:");
                    a.armazenarPessoa(leitor.next(), leitor.nextInt(), leitor.nextFloat());
                    break;
                case 2:
                    System.out.println("Nome:");
                    a.removerPessoa(leitor.next());
                    break;
                case 3:
                    System.out.println("Nome:");
                    System.out.println("O usuario esta na posicao " + a.buscarPessoa(leitor.next()));
                    break;
                case 4:
                    System.out.println("AGENDA:");
                    for (int i = 0; i < 10; i++) {
                        System.out.println(a.imprimirAgenda(i));
                    }
                    break;
                case 5:
                    System.out.println("Posicao:");
                    a.imprimirPessoa(leitor.nextInt());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente");
                    break;
            }
        } while (resp != 6);
    }

}

-----------------------

package POO12;

public class Agenda {

    private String[] nome = new String[10];
    private int[] idade = new int[10];
    private float[] altura = new float[10];

    //armazena a pessoa em um array
    public void armazenarPessoa(String name, int age, float alt) {
        for (int i = 0; i < nome.length; i++) {
            if (nome[i] == null) {
                nome[i] = name;
                idade[i] = age;
                altura[i] = alt;
                System.out.println(" Adicionado com sucesso");
                break;
            }
        }
    }

    //remove a pessoa do array
    public void removerPessoa(String name) {
        String resp;
        for (int i = 0; i < nome.length; i++) {
            if (name.equalsIgnoreCase(nome[i])) {
                nome[i] = null;
                idade[i] = 0;
                altura[i] = 0;
                resp = "removido com Sucesso!";
                System.out.println(resp);
            }
        }
    }

    // informa em que posição da agenda está a pessoa
    public int buscarPessoa(String name) {
        int resp = 0;
        for (int i = 0; i < nome.length; i++) {
            if (name.equalsIgnoreCase(nome[i])) {
                resp = i + 1;
            } else {
                resp = -1;
            }
        }
        return resp;
    }

    // imprime os dados de todas as pessoas da agenda
    public String imprimirAgenda(int i) {
        String resp = "Nome: " + nome[i] + " Idade: " + idade[i] + " Altura: " + altura[i];
        return resp;
    }

    // imprime os dados da pessoa que está na posição “i” da agenda.
    public void imprimirPessoa(int index) {
        String resp;

        for (int i = 0; i < nome.length; i++) {
            if (i == index-1) {
                resp = "Nome: " + nome[i] + " Idade: " + idade[i] + " Altura: " + altura[i];
                System.out.println(resp);
                break;
            }else {
                resp = "Usuario invalido";
                System.out.println(resp);
                break;
            } 
        }
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

    public float[] getAltura() {
        return altura;
    }

    public void setAltura(float[] altura) {
        this.altura = altura;
    }
}

