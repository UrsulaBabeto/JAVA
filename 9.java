/*
9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor
com rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
package Nove;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       float valor = 0.0f;
       float rendimento = 0.0f;
       
       System.out.println("Valor de deposito: ");
       valor = leitor.nextFloat();
       
       rendimento =( valor * 7 / 100);
 System.out.println("O valor depoistado foi RS "+valor+",00 com um rendimento de RS "
 +rendimento+". O total mensal e de "+ (rendimento+valor)+",00");
    }
}
