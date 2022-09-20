package ProjetoEmpregado;

public class Empregado {
    
        
    //parte 1 - declarar atributos
    private String nome;
    private double salario;
    
    //parte 2 - construtor

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    // parte 3  - getters(consultar) e setters(alterar)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //parte 4 - os métodos do "business" propriamente dito
    public String exibir() {
        return this.nome + "R$" + this.salario;
    }
    
    public void aumentarSalario (double percentual){
        this.salario += this.salario * percentual / 100;
    }
}
