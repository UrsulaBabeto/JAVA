/*
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel 
deve conter os seguintes atributos: tipo de combustível, valor por litro e 
quantidade de combustível. Além desses atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra
a quantidade de litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de 
combustível e mostra o valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba
Crie uma classe que contenha um método main para testar sua classe BombaCombustível 
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
    
    //método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
    public float abastecerPorValor() {
        return qtidade = valorAbastecimento / valorLitro;
    }

    // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
    public float abastecerPorLitro() {
        return  qtidade * valorLitro;
    }

    //altera o valor do litro do combustível.
    public float alterarValor(float valor) {
        return this.valorLitro = valor;
    }

//altera o tipo do combustível.
    public String alterarCombustivel(String tipo) {
        return this.tipoCombustivel = tipo;
    }

//altera a quantidade de combustível restante na bomba.
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



