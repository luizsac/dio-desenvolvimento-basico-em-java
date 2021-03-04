package one.digitalinnovation.heranca;

public class Funcionario {

        private String nome;
        private Double salario;

    Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double calculaImposto() {
        return this.getSalario() * 0.0;
    }

}