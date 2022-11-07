/*
 Crie uma classe chamada Invoice que possa ser utilizado por uma loja de 
suprimentos de informática para representar uma fatura de um item vendido na loja.
Uma fatura deve incluir as seguintes informações como atributos:
a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a 
quantidade não for positiva, ela deve ser configurada como 0. Se o preço por 
item não for positivo ele deve ser configurado como 0.0. Forneça os métodos getters 
e setters para cada variável de instância. Além disso, forneça um método chamado 
getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade 
pelo preço por item) e depois retorna o valor como um double. Escreva um aplicativo
de teste que demonstra as capacidades da classe Invoice.*/

package POO6;

public class App {
    
    public static void main(String[] args) {
       invoice i = new invoice(1,"mouse",5,15.5f);
       
       System.out.print("fatura: "+ i.getInvoiceAmout());
    }
}
-----------------------------

package POO6;

public class invoice {

    private int item;
    private String descricao;
    private int quantidade;
    private float preco;

    public invoice(int item, String descricao, int quantidade, float preco) {
        this.item = item;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public double getInvoiceAmout(){
    return quantidade*preco;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }

    }

}

