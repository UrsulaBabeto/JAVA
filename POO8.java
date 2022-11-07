/*
Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe
deverá dispor dos seguintes métodos:
a. Construtor: define a data que determinado objeto (através de parâmetro), este
método verifica se a data está correta, caso não esteja a data é configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e retorne:
i. 0 se as datas forem iguais;
ii. 1 se a data corrente for maior que a do parâmetro;
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data

h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe 
Data com os mesmos valores de atributos e retorna sua referência pelo método

 */


package POO8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App {

    public static void main(String[] args) {

        data d = new data(15, 10, 2000);
        DateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        Date data = new Date();

        System.out.println(d.comparadia() + "/" + d.comparames() + "/" + d.comparaano());
        System.out.println(d.getDia() + "/" + d.getMes() + "/" + d.getAno());
        System.out.println(d.compara());
        System.out.println(formato.format(data));
        System.out.println(d.Bissexto());
    }
}

----------------------------

package POO8;

import java.util.Calendar;

public class data {

   private int dia;
   private int mes;
   private int ano;
   private int diaAtual;
   private int mesAtual;
   private int anoAtual;
   private String bissexto;

    public data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int comparadia() {
        Calendar data = Calendar.getInstance();
        this.diaAtual = data.get(Calendar.DAY_OF_MONTH);
        return diaAtual;
    }

    public int comparames() {
        Calendar data = Calendar.getInstance();
        this.mesAtual = data.get(Calendar.MONTH);
        return mesAtual+1;
    }

    public int comparaano() {
        Calendar data = Calendar.getInstance();
        this.anoAtual = data.get(Calendar.YEAR);
        return anoAtual;
    }


    /*i. 0 se as datas forem iguais;
      ii. 1 se a data corrente for maior que a do parâmetro;
      iii. -1 se a data do parâmetro for maior que a corrente. */
      
    public String compara() {
        String datas;
        if (dia == diaAtual && mes == mesAtual+1 && ano == anoAtual) {
            datas = "0";
        } else if (ano > anoAtual || dia > diaAtual && mes == mesAtual+1 && ano == anoAtual ||
                mes > mesAtual+1 && ano == anoAtual) {
            datas = "1";
        } else {
            datas = "-1";
        }
        return datas;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(int diaAtual) {
        this.diaAtual = diaAtual;
    }

    public int getMesAtual() {
        return mesAtual;
    }

    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public String getBissexto() {
        return bissexto;
    }

    //g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
    public void setBissexto(String bissexto) {
            this.bissexto = bissexto;
    }
    
     public String Bissexto() {
         getAno();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            this.bissexto = bissexto;
            bissexto = "ano bissexto";
        }else{
        bissexto = "nao e bissexto";
        }
        return bissexto;
     }
}

