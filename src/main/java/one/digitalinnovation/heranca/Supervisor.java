package one.digitalinnovation.heranca;

public class Supervisor extends Funcionario {

    Supervisor(String nome, Double salario) {
        super(nome, salario);
    }

    public Double calculaImposto() {
        return this.getSalario() * 0.05;
    }

}
