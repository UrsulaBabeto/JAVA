/*
 34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma
das seguintes categorias:
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. S�nior = 18 - 25 anos.
Apresentar mensagem �idade fora da faixa et�ria� quando for outro ano n�o contemplado;
*/
package TrintaEQuatro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade;
        System.out.println("Idade:");
        idade = leitor.nextInt();
        if (idade >= 5 && idade <= 7) {
            System.out.println("INFANTIL A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("INFANTIL B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("JUVENIL A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("JUVENIL B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("SENIOR");
        } else {
            System.out.println("idade fora da faixa etaria");
        }
    }
}
