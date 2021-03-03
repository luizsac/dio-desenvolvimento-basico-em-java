package one.digitalinnovation;

public class CarroPrograma {

    public static void main(String[] args) {
        Carro carro = new Carro(4, 6);

        carro.adicionaPessoa();
        carro.adicionaPessoa();
        carro.adicionaPessoa();
        carro.removePessoa();
        carro.removePessoa();
        carro.pessoasNoCarro();
    }

}
