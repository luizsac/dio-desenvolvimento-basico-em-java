package one.digitalinnovation.calendario;

import java.util.Calendar;

public class FaturaPrograma {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.set(2021, Calendar.MARCH, 6);

        fatura.prazoParaPagarSemJuros(dataVencimento);
    }

}
