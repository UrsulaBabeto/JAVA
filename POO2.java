/*
 Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os
seguintes atributos: número da conta, nome do correntista e saldo. Os métodos 
são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional,
com valor default zero e os demais atributos são obrigatórios.
 */
package POO2;

public class App {

    public static void main(String[] args) {

        CC pessoa = new CC(123, "pedro", 150.0f);
        pessoa.alteraNome("Carlos");
        pessoa.deposito(100.0f);
        pessoa.saque(200);
        
        System.out.println(" C/C:" + pessoa.getNumeroConta() + "\n"
                         + " nome:" + pessoa.getNome() + "\n"
                         + " saldo=" + pessoa.getSaldo());
    }
}

--------------------------

package POO2;

public class CC {

    private int numeroConta;
    private String nome;
    private float saldo;

    public CC(int numeroConta, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String alteraNome(String nome) {
        return this.nome = nome;
    }

    public float deposito(float valor) {
        return this.saldo += valor;
    }

    public float saque(float valor) {
        return this.saldo -= valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}

