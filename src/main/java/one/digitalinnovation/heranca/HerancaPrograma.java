package one.digitalinnovation.heranca;

public class HerancaPrograma {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Geraldo", 3309.3);
        Gerente gerente = new Gerente("Flaviano", 7854.9);
        Supervisor supervisor = new Supervisor("Adelson", 5987.5);
        Atendente atendente = new Atendente("Vicente", 3466.7);

        System.out.printf("Funcionário: R$ %.2f\n", funcionario.calculaImposto());
        System.out.printf("Gerente: R$ %.2f\n", gerente.calculaImposto());
        System.out.printf("Supervisor: R$ %.2f\n", supervisor.calculaImposto());
        System.out.printf("Atendente: R$ %.2f\n", atendente.calculaImposto());
    }

}
