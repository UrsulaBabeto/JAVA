/*
 33. A escola �APRENDER� faz o pagamento de seus professores por hora/aula. Fa�a 
um algoritmo que calcule e exiba o sal�rio de um professor. Sabe-se que o valor 
da hora/aula segue a tabela abaixo:
a. Professor N�vel 1 R$12,00 por hora/aula;
b. Professor N�vel 2 R$17,00 por hora/aula;
c. Professor N�vel 3 R$25,00 por hora/aula.

*/
package TrintaETres;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        String nivel;
        float horas;

        System.out.println("Quantas horas trabalhadas? ");
        horas = leitor.nextFloat();

        System.out.println("Qual o nivel? \n"
                + "1- nivel 1;\n"
                + "2 - nivel 2;\n"
                + "3 - nivel 3");
        nivel = leitor.next();

        switch (nivel) {
            case "1":
                horas = 12 * horas;
                System.out.println("O funcionario ira receber: RS" + horas);
                break;
            case "2":
                horas = 17 * horas;
                System.out.println("O funcionario ira receber: RS" + horas);
                break;
            case "3":
                horas = 25 * horas;
                System.out.println("O funcionario ira receber: RS" + horas);
                break;
            default:
                System.out.println("ERRO... tente novamente");
                
        }
    }
}
