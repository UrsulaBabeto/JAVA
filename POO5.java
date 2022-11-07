/*
 Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. 
Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome,
2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2) 
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)

*/

package POO5;

public class App {

    public static void main(String[] args) {
        

        alunos al = new alunos(123,"rod",7,7,7);

        System.out.println("media: "+ al.media());
        System.out.println("pontos necessarios para alcancar a media: "+al.Final());
    }
}
-------------------------------

package POO5;

public class alunos {

    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float trabalho;

    public alunos(int matricula, String nome, float nota1, float nota2, float trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }


    public double media() {
        return ((nota1 + nota2)*2.5 + trabalho*2) / 7;
    }

//calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
    public double Final() {
        
        if (media() < 7) {
            return 10 - media();
        } else {
            return 0;
        }
    }

    public float getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

}

