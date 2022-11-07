/*Escreva uma classe em que cada objeto representa um Voo que acontece em determinada
data e em determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe
permite controlar a ocupação das vagas. A classe deve ter os seguintes métodos:
 */

package POO9;


public class App {

    public static void main(String[] args) {
        VOO v = new VOO(3122);
        System.out.println("Numero do Voo: "+v.getNumVoo()+ ".\n"
                + "Data: " + v.getData());
        
       System.out.println(v.verifica(1));
        System.out.println(v.ocupa(1));
        System.out.println(v.vagas());
        System.out.println(v.ProximoLivre());
    }
}

-------------------------

package POO9;

import java.text.DateFormat;
import java.util.Date;

public class VOO {

    private int numVoo;
    private String data;
    private int numMaxPax = 100;
    private int vagas;
    private int[] compara = {0};
    private int[] assento = new int[100];

    //Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo,
    //data (para armazenar a data utilize um objeto da classe Data, criada na questão anterior);
    public VOO(int numVoo) {
        this.numVoo = numVoo;
        this.data = DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());
    }

    // Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada    
    public String verifica(int x) {
        String resp = "";
        if (assento[x] == compara[0]) {
            assento[x] = 1;
            resp = "Assento vazio";
        } else {
            assento[x] = 0;
            resp = "Assento ocupado";
        }
        return resp;
    }

    //Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro,
    //e retorna verdadeiro se a cadeira ainda não estiver ocupada (operação foi  
    //bem sucedida) e falso caso contrário
    public boolean ocupa(int x) {
        return assento[x] == compara[0];
    }

    //ProximoLivre: retorna o número da próxima cadeira livre
    public int ProximoLivre() {
        int resp = 0;
        int j;
        for ( j = 0; j < assento.length; j++) {
            if (assento[j + 1] == compara[0]) {
                resp = j + 1;
                break;
            } else {
                resp = j - 1;
            }
        }
        return resp;
    }

    //Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
    public int vagas() {
        int cont = 0;
        for (int i = 0; i < 100; i++) {
            if (assento[i] == compara[0]) {
                cont += 1;
            }
        }
        return cont;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public int getNumMaxPax() {
        return numMaxPax;
    }

    public void setNumMaxPax(int numMaxPax) {
        this.numMaxPax = numMaxPax;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

