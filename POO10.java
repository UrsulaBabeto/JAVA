/*
 Crie uma classe para representar um jogador de futebol, com os atributos:
a. nome;
b. posição;
c. data de nascimento;
d. nacionalidade;
e. altura;
f. peso;
Crie os métodos públicos necessários para getters e setters e também um método 
para imprimir todos os dados do jogador. Crie um método para calcular a idade do 
jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar.
Para isso, considere que os jogadores da posição de defesa se aposentam em média aos
40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
*/

package POO10;

public class App {
  
    public static void main(String[] args) {
    
        jogadores j = new jogadores("Carlos", "atacante", 
                1958, "Brasileiro", 1.75f,78.0f);
        System.out.println("Nome: "+j.getNome()+"\n"
                + "Posicao: "+j.getPosição()+"\n"
                + "Ano de Nascimento: "+j.getAnoNascimento()+"\n"
                + "Nacionalidade: "+j.getNacionalidade()+"\n"
                + "Atura: "+j.getAltura()+"ms\n"
                + "Pso: "+j.getPeso()+"kg");
        
       System.out.println(j.getNome()+" tem "+j.idade()+" anos");
       System.out.println("Tempo para restante para aposentadoria: "
               +j.aposentadoria()+" anos");

    }
}

-----------------------------

package POO10;

import java.util.Calendar;

public class jogadores {

private String nome;
private String posição;
private int anoNascimento;
private String nacionalidade;
private float altura;
private float peso;

    public jogadores(String nome, String posição, int anoNascimento, String nacionalidade, float altura, float peso) {
        this.nome = nome;
        this.posição = posição;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }
    
    public int idade(){
        int anoAtual;
        int idade;
        Calendar date = Calendar.getInstance();
        anoAtual = date.get(Calendar.YEAR);        
         idade=(anoAtual-anoNascimento);
         return idade;
    }
    
 //quanto tempo falta para o jogador se aposentar. Para isso, considere que os 
 //jogadores da posição de defesa se aposentam em média aos 40 anos, os jogadores 
 //de meio-campo aos 38 e os atacantes aos 35.
    
    public int aposentadoria(){
        int tempoRestante = 0;
       if (getPosição() == "defesa"){
       tempoRestante = 40-idade();
       } else if (getPosição() == "meio"){
       tempoRestante = 38-idade();
       } else if(getPosição() == "atacante"){
       tempoRestante = 35-idade();
       }else{}
       return tempoRestante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    

    
}

