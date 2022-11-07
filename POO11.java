/*
 Crie uma classe chamada Ingresso, que possui um valor em reais e um metodo 
imprimirValor. Crie uma classe IngressoVIP, que herda de Ingresso e possui um 
valor adicional. Crie um metodo que retorne o valor do ingresso VIP (com o 
adicional incluido). Crie um programa para criar as instâncias de Ingresso e 
IngressoVIP, mostrando a diferença de preços.*/

package POO11;

public class App {

    public static void main(String[] args) {
    
        IngressoVIP i = new IngressoVIP();
        i.setValor(2.50f);
        
        System.out.print("O valor do ingresso VIP e: RS"+i.imprimeValor());
        
        }
}

--------------------------

package POO11;

public class Ingresso {

    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}

----------------------------


package POO11;

public class IngressoVIP extends Ingresso {
    
    private float ingressoVIP = 30.0f;
    
    public IngressoVIP(){
        super();
    }

    public float imprimeValor(){
     return super.getValor() + ingressoVIP;
    }
    
    public float getIngressoVIP() {
        return ingressoVIP;
    }

    public void setIngressoVIP(float ingressoVIP) {
        this.ingressoVIP = ingressoVIP;
    }
    
}

