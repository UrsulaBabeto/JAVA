/*
 35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se
que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
*/
package TrintaECinco;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float kwcasa = 0.60f;
        float kwcomercio = 0.48f;
        float kw = 0;
        String tipo;

        System.out.println("A conta e \n"
                + "1 - residencial \n"
                + "2 - comercial");
        tipo = leitor.next();
        System.out.println("total de consumo de KW: ");
        kw = leitor.nextFloat();

        switch (tipo) {
            case "1":
                kw = (kw * kwcasa);
                System.out.println("Valor final conta: RS " + kw);
                break;
            case "2":
                kw = (kw * kwcomercio);
                System.out.println("Valor final conta: RS " + kw);
                break;
            default:
               System.out.println("OPCAO INVALIDA");      
        }
    }
}