package one.digitalinnovation;

public class Carro {

    private int pessoasNoCarro;
    private final int capacidade;

    Carro(int pessoas, int capacidade) {
        this.pessoasNoCarro = (pessoas > capacidade) ? capacidade : pessoas;
        this.capacidade = capacidade;
    }

    public void adicionaPessoa() {
        if (pessoasNoCarro == capacidade) {
            System.out.println("O carro está cheio!");
        } else {
            pessoasNoCarro++;
            System.out.println("Uma pessoa foi adicionada ao carro");
        }
    }

    public void removePessoa() {
        if (pessoasNoCarro == 0) {
            System.out.println("O carro está vazio!");
        } else {
            pessoasNoCarro--;
            System.out.println("Uma pessoa foi removida do carro!");
        }
    }

    public void pessoasNoCarro() {
        if (pessoasNoCarro == 0) {
            System.out.println("O carro está vazio!");
        } else {
            System.out.printf("Há %d pessoas no carro!", pessoasNoCarro);
        }
    }

}
