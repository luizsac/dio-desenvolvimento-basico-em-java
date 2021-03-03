package one.digitalinnovation.construtores;

public class CarroPrograma {

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Argo", 2018);

        System.out.println(carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno() +
                " " + carro.getVariante());

        carro.descricao();
    }

}
