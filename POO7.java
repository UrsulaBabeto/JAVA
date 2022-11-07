/*
 A fim de representar funcionários em uma empresa, crie uma classe chamada 
Funcionario que inclui as três informações a seguir como atributos:
a. um primeiro nome,
b. um sobrenome
c. um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos. Forneça os 
métodos getters e setters para cada atributo. Se o salário mensal não for positivo,
configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades
da classe. Crie duas instâncias da classe e exiba o salário anual de cada instância.
Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado.
 */

package POO7;

public class App {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joao", "Batista", 1200.0f);
        Funcionario fu = new Funcionario("Pedro", "Cardoso", 1500.0f);

        System.out.println("Nome:" + f.getPrimeiroNome() + " " + f.getSobrenome() + ". "
                + "Salario Anual: RS" + f.salarioAnual() + ". Salario Anual reajustado: RS" + f.salarioAjustado());
        System.out.println("Nome:" + fu.getPrimeiroNome() + " " + fu.getSobrenome() + ". "
                + "Salario Anual: RS" + fu.salarioAnual() + ". Salario Anual reajustado: RS" + fu.salarioAjustado());
    }
}

-----------------------------


package POO7;

public class Funcionario {

    private String primeiroNome;
    private String sobrenome;
    private float salario;

    public Funcionario(String primeiroNome, String sobrenome, float salario) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double salarioAnual() {
        return salario * 12;
    }
    
   public double salarioAjustado(){
       double SA = salarioAnual();
        return(SA*10)/100 + SA;
    
   }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float salario() {
        return salario;
    }

    public void salario(float salario) {
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }

}

