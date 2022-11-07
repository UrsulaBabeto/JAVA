/*
10. A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações
sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o 
valor das prestações;
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
