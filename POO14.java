/*
Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. 
A classe deve conter quatro atributos:
a. número (String);
b. descrição (String);
c. quantidade comprada de um item (int);
d. preço por item (double).
A classe deve ter um construtor e os métodos getters e setters. Além disso, 
forneça um método chamado getTotalFatura que calcula o valor da fatura e depois 
retorna o valor como um double. Se o valor não for positivo, ele deve ser alterado para 0.
Se o preço por item não for positivo, ele deve ser alterado para 0. Escreva uma 
nova classe chamada FaturaTeste (que contenha o método main) que demonstre as 
capacidades da classe Fatura. */


package POO14;

public class App {

    public static void main(String[] args) {
        
        
         Fatura f = new Fatura("1", "mouse", 5, 6.71f);      

        System.out.println("O total da fatura e de: RS" + f.getTotalFatura());

    }
}

-----------------------

package POO14;

public class Fatura {

    private String número;
    private String descrição;
    private int quantidade;
    private double preco;

    public Fatura(String número, String descrição, int quantidade, double preco) {
        this.número = número;
        this.descrição = descrição;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getTotalFatura() {
        return quantidade * preco;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
         if (preco < 0) {
            this.quantidade = 0;
        } else {
           this.quantidade = quantidade;
        }
        
    }

    public double getPreco() {
        return preco;
    }

    // Se o preço por item não for positivo, ele deve ser alterado para 0
    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

}

