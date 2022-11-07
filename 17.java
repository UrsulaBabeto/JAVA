/*
 17. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo
entre 10 (inclusive) e 150
*/
package Dezessete;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero;
        int cont = 0;

        for (int i = 0; i < 80; i++) {
            System.out.println("Numero:");
            numero = leitor.nextInt();

            if (numero >= 10 && numero <= 150) {
                cont = cont + 1;
            };
        }
        System.out.println("Voce tem um total de "+cont+" numeros no intervalo"
                + "de 10 e 150");
    }
}
         