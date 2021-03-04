package one.digitalinnovation.datas;

import java.util.Date;

public class TestaDataNascimento {

    public static void main(String[] args) {
        Date dataNascimento = new Date(660103200000L); //02/12/1990
        Date dataAComparar = new Date(1273892400000L); //15/05/2010

        System.out.println("Data de nascimento é anterior a 15/05/2010? " + dataNascimento.before(dataAComparar));
        System.out.println("Data de nascimento é posterior a 15/05/2010? " + dataNascimento.after(dataAComparar));
    }

}
