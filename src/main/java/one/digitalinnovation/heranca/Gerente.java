package one.digitalinnovation.heranca;

public class Gerente extends Funcionario {

    Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public Double calculaImposto() {
        return this.getSalario() * 0.1;
    }

}
