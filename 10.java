/*
10. A Loja Mam�o com A��car est� vendendo seus produtos em5(cinco)presta��es
sem juros. Fa�a um algoritmo que receba um valor de uma compra e mostre o 
valor das presta��es;
 */
package Dez;
import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
        
        float valor = 0.0f;
    
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do produto");
        valor = leitor.nextFloat();
        
        System.out.println("Voce tera que pagar 5 parcelas de RS"+ valor/5);
        
    }
}
