/*
 Crie uma classe chamada Funcionário que inclui três atributos:
a. nome (String);
b. sobrenome (String);
c. salário mensal (double).
A classe deve ter um construtor, métodos getters e setters para cada atributo da
classe. Escreva uma classe chamada FuncionarioTeste (que contenha o método main)
que cria dois objetos da classe Funcionario e exibe o salário de cada objeto. 
Então dê a cada Funcionario um aumento de 10% e exiba novamente o salário anual 
de cada um deles. Introduza na classe Funcionario uma variável de classe capaz 
de contabilizar o numero de funcionarios que passaram pela empresa até a data.*/

package POO15;

public class App {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("joao", "cardoso", 3500.0d);
        f.setNome("Jorge");
        Funcionario p = new Funcionario("pedro", "caetano", 1350.5d);
        System.out.println(" nome: " + f.getNome() + "\n sobrenome: " + f.getSobrenome() + ""
                + "\n Salario: RS" + f.getSalario() + "\n"
                + "aumento de 10%: RS" + f.aumento() + "\n"
                + "Salario anual com aumento: RS" + f.salarioAnual());

        System.out.println(" ");
        System.out.println(" nome: " + p.getNome() + "\n sobrenome: " + p.getSobrenome() + ""
                + "\n Salario: RS" + p.getSalario() + "\n"
                + "aumento de 10%: RS" + p.aumento() + "\n"
                + "Salario anual com aumento: RS" + p.salarioAnual());

        System.out.println("Numero de funcionarios: "+ p.numFuncionarios());
    }
}

--------------------------------

package POO15;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private double salario;
    int cont = 0;

    public Funcionario(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double aumento() {
        return salario + (salario * 10 / 100);
    }

    public double salarioAnual() {
        return aumento() * 12;
    }

    public int numFuncionarios() {

        if (null != nome) {
            cont++;
        } else {
        }
        return cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

