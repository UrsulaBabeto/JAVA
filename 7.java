/*
7. Leia uma temperatura em graus Celsius e apresent�-la convertida em graus
Fahrenheit. Af�rmula de convers�o �:F=(9*C+160) / 5, sendo F a temperatura
em Fahrenheit e C a temperatura emCelsius;
 */
package Sete;

   import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float temperatura = 0.0f;
        
        System.out.println("Digite a temperatura (�C) para convers�o");
        temperatura = leitor.nextFloat();
        
        temperatura = (9*temperatura+160)/5;
        
        System.out.println("A temperaura convertida: "+temperatura+"�F");
        
    }
}
