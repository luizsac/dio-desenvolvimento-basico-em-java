package one.digitalinnovation.calendario;

import java.util.Calendar;

public class Fatura {

    public void prazoParaPagarSemJuros(Calendar dataVencimento) {
        Calendar dataAtual = Calendar.getInstance();

        Calendar dataCarencia = Calendar.getInstance();
        dataCarencia.setTime(dataVencimento.getTime());
        dataCarencia.add(Calendar.DATE, 10);

        if (dataCarencia.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            dataCarencia.add(Calendar.DATE, 1);
        } else if (dataCarencia.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            dataCarencia.add(Calendar.DATE, 2);
        }

        if (dataCarencia.before(dataAtual)) {
            System.out.println("O prazo acabou! Juros serão cobrados.");
        } else {
            Long diferenca = dataCarencia.getTimeInMillis() - dataAtual.getTimeInMillis();
            Integer dias = Math.toIntExact(diferenca / (1000 * 60 * 60 * 24));
            System.out.printf("Você tem %d dias para pagar a fatura sem que juros sejam cobrados.\n", dias);
        }

    }

}
