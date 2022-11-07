/*
    Construa uma classe para representar um carro. O tanque de combustível do carro
   armazena no máximo 50 litros de gasolina. O carro consome 15 km/litro. Deve ser possível:
a. Abastecer o carro com certa quantidade de gasolina;
b. Mover o carro em uma determinada distância (medida em km);
c. Retornar a quantidade de combustível e a distância total percorrida.
No programa principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros 
no segundo. Desloque o primeiro em 200 km e o segundo em 400 km. Exiba na tela a 
distância percorrida e o total de combustível restante para cada um.
*/

package POO16;

public class App {

    public static void main(String[] args) {

        Carro c = new Carro();
        Carro ca = new Carro();
        c.setTanque(20f);
        ca.setTanque(30);

        System.out.println("Voce precisa de mais " + c.abastecer()
                + " para completar o tanque");
        System.out.println("Com esta capacidade, voce consegue percorrer mais "
                + c.Mover() + "Km");
        c.restante();

         System.out.println("");
        System.out.println("Voce precisa de mais " + ca.abastecer()
                + " para completar o tanque");
        System.out.println("Com esta capacidade, voce consegue percorrer mais "
                + ca.Mover() + "Km");
        ca.restante();
    }
}

------------------------------

package POO16;

public class Carro {

    private final float tanqueMax = 50f;
    private float tanqueTot;
    private float tanque;
    private final float velocidade = 15f;

//Abastecer o carro com certa quantidade de gasolina;
    public double abastecer() {
        if (tanque < tanqueMax) {
            tanqueTot = tanqueMax -tanque;
        }
        return tanqueTot;
    }

//Mover o carro em uma determinada distância (medida em km);
    public double Mover() {
        return tanque*velocidade;

    }

//Retornar a quantidade de combustível e a distância total percorrida.
    public void restante(){
    System.out.println("Ate agora voce ja percorrreu " + tanqueTot*velocidade+"km");
    System.out.println("Ate agora voce ja consumiu " + Mover()/velocidade +"L de combustivel");
    }

    public float getTanqueTot() {
        return tanqueTot;
    }

    public void setTanqueTot(float tanqueTot) {
        this.tanqueTot = tanqueTot;
    }

    public float getTanque() {
        return tanque;
    }

    public void setTanque(float tanque) {
        this.tanque = tanque;
    }
    
}

