/*
27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com 
desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a
ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo 
de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). 
Com valor do veículo zero encerra entrada de dados. Informe total de desconto e
total pago pelos clientes;
 */
package VinteESete;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

int continuar = 1;
        int numero;
        float precoCarro;
        float desconto = 0;
        float precoAtualizado = 0;
        float totalDesconto = 0;
        float totalPago = 0;

        while (continuar != 0 && continuar == 1) {
            System.out.println("Qual o preco do carro?");
            precoCarro = leitor.nextFloat();
            if (precoCarro == 0) {
                break;
            } else {
                System.out.println("Qual combustivel voce prefere seu no seu carro:\n"
                        + "1 - Gasolina \n"
                        + "2 - Diesel \n"
                        + "3 - Alcool");
                numero = leitor.nextInt();

                switch (numero) {
                    case 1:
                        desconto = precoCarro * 21 / 100;
                        precoAtualizado = precoCarro - desconto;
                        System.out.println("Seu carro vai sair por: RS"
                                + precoAtualizado + "com RS" + desconto + " de desconto");
                        break;
                    case 2:
                        desconto = precoCarro * 14 / 100;
                        precoAtualizado = precoCarro - desconto;
                        System.out.println("Seu carro vai sair por: RS"
                                + precoAtualizado + "com RS" + desconto + " de desconto");
                        break;
                    case 3:
                        desconto = precoCarro * 25 / 100;
                        precoAtualizado = precoCarro - desconto;
                        System.out.println("Seu carro vai sair por: RS"
                                + precoAtualizado + "com RS" + desconto + " de desconto");
                        break;
                    default:
                        precoCarro = 0;
                        System.out.println("Saindo");

                }
            }
            totalDesconto = totalDesconto + desconto;
            totalPago = totalPago + precoAtualizado;

            System.out.println("Deseja continuar? 1 - sim / 0 - nao");
            continuar = leitor.nextInt();
        }
        System.out.println("O total de desconto foi RS"+totalDesconto+". O total pago foi: RS"+totalPago);
    }
}