/*
 22. Faça um algoritmo que receba o preço de custo e o preço de venda de 40 
produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada 
produto. Informe o valor de custo de cada produto, o valor de venda de cada 
produto, amédia de preço de custo e do preço de venda;
*/
package VinteEDois;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

float precoCusto;
        float precoVenda;
        float totalCusto = 0;
        float totalVenda = 0;
        float mediaCusto;
        float mediaVenda;
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o preco de custo:");
            precoCusto = leitor.nextFloat();
            System.out.println("Informe o preco de venda:");
            precoVenda = leitor.nextFloat();
            cont = cont + 1;
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("EMPATE");
            } else if (precoVenda > precoCusto) {
                System.out.println("LUCRO");
            } else {
                System.out.println("PREJUIZO");
            }
        }
        mediaCusto = totalCusto / cont;
        mediaVenda = totalVenda / cont;
        System.out.print(" a media dp custo e RS" + mediaCusto+ ". a media de venda e RS" + mediaVenda);
    }
}
