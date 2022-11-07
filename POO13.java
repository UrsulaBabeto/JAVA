
/*
 Crie uma classe Calculadora. Esta classe deve implementar as operações básicas 
(soma, subtração, divisão e multiplicação). Utilizando o conceito de herança crie
uma classe chamada calculadora cientifica que implementa os seguintes cálculos: 
raizQuadrada e a potencia. Dica utilize a classe Math do pacote java.lang
 */


package POO13;

public class App {

    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        c.setNumero1(5);
        c.setNumero2(2);
        

        System.out.println("A soma entre os numeros e:" + c.somar() + "\n"
                + "A subtracao entre os numeros e:" + c.diminuir() + "\n"
                + "A multiplicacao entre os numeros e:" + c.multiplicar() + "\n"
                + "A divisao entre os numeros e: " + c.dividir());
        System.out.println("A raiz quadrada e: "+cc.raizQuadrada(c.getNumero1()));
        System.out.println("A potencia e: "+cc.potencia(c.getNumero1(), c.getNumero2()));

     }
}

-------------------------

package POO13;

public class Calculadora {
    
    private int numero1;
    private int numero2;

    public int somar(){
     return numero1+numero2;
    }
    
    public int diminuir(){
     return numero1-numero2;
    }
    
    public float multiplicar(){
     return numero1*numero2;
    }
    
     public float dividir(){
     return numero1/numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}

-----------------------------------

package POO13;

import java.lang.Math;

public class CalculadoraCientifica extends Calculadora {

        public double raizQuadrada(int x) {
        return Math.sqrt(x);
    }

    public double potencia(int x, int y) {
        return Math.pow(x,y);   
}
}
