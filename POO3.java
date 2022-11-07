/*
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel 
deve conter os seguintes atributos: tipo de combust�vel, valor por litro e 
quantidade de combust�vel. Al�m desses atributos a classes deve conter os seguintes m�todos.
a. abastecerPorValor; //m�todo onde � informado o valor a ser abastecido e mostra
a quantidade de litros que foi colocada no ve�culo
b. abastecerPorLitro; // m�todo onde � informado a quantidade em litros de 
combust�vel e mostra o valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combust�vel.
d. alterarCombustivel; //altera o tipo do combust�vel.
e. alterarQuantidadeCombustivel; //altera a quantidade de combust�vel restante na bomba
Crie uma classe que contenha um m�todo main para testar sua classe BombaCombust�vel 
 */
package POO3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        BombaCombustivel bc = new BombaCombustivel("gas", 4.50f, 10);

        System.out.println("Valor a ser abastecido:");
        bc.setValorAbastecimento(leitor.nextFloat());
        bc.alterarValor(3);
        bc.alterarCombustivel("diesel");
        System.out.println(bc.abastecerPorValor());
        System.out.println(bc.abastecerPorLitro());
        System.out.println(bc.getTipoCombustivel());
    }
}

---------------------

package POO3;

public class BombaCombustivel {

    private String tipoCombustivel;
    private float valorLitro;
    private float qtidade;
    float valorAbastecimento;

    public BombaCombustivel(String tipoCombustivel, float valorLitro, float qtidade) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.qtidade = qtidade;
    }
    
    //m�todo onde � informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no ve�culo
    public float abastecerPorValor() {
        return qtidade = valorAbastecimento / valorLitro;
    }

    // m�todo onde � informado a quantidade em litros de combust�vel e mostra o valor a ser pago pelo cliente.
    public float abastecerPorLitro() {
        return  qtidade * valorLitro;
    }

    //altera o valor do litro do combust�vel.
    public float alterarValor(float valor) {
        return this.valorLitro = valor;
    }

//altera o tipo do combust�vel.
    public String alterarCombustivel(String tipo) {
        return this.tipoCombustivel = tipo;
    }

//altera a quantidade de combust�vel restante na bomba.
//  public float alterarQuantidadeCombustivel() {
//
//  }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public float getQtidade() {
        return qtidade;
    }

    public void setQtidade(float qtidade) {
        this.qtidade = qtidade;
    }
    
     public float getValorAbastecimento() {
        return valorAbastecimento;
    }

    public void setValorAbastecimento(float valorAbastecimento) {
        this.valorAbastecimento = valorAbastecimento;
    }
}



