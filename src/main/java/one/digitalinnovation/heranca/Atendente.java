package one.digitalinnovation.heranca;

public class Atendente extends Funcionario {

    Atendente(String nome, Double salario) {
        super(nome, salario);
    }

    public Double calculaImposto() {
        return this.getSalario() * 0.01;
    }

}
