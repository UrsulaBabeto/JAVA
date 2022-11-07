/*
Escreva um algoritmo que leia o nome de um aluno e as notas das 
três provas que ele obteve no semestre. No finalinformar o nome do 
aluno e a sua média (aritmética);
 */
package Cinco;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float media = 0.0f;
        
        System.out.println("Nome do Aluno: ");
        String nome = leitor.next();
        
        System.out.println("Nota 1: ");
        int n1 = leitor.nextInt();
        
        System.out.println("Nota 2: ");
        int n2 = leitor.nextInt();
        
        System.out.println("Nota 3: ");
        int n3 = leitor.nextInt();
        
        media = (n1+n2+n3)/3;
        
        System.out.println("Aluno: "+nome+" Com notas: "+n1+", "+n2+", "+n3);
         System.out.println(" e media: "+media);
         
         if (media > 7){
         System.out.println("Foi APROVADO");
         }else if(media < 5){
         System.out.println("Foi REPROVADO");
         }else{
             System.out.println("esta em RECUPERACAO");
         }
    }
}
