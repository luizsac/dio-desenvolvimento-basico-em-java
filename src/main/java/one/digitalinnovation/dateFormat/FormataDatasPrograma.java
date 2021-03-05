package one.digitalinnovation.dateFormat;

import java.util.Date;

public class FormataDatasPrograma {

    public static void main(String[] args) {
        Date data = new Date();
        FormataDatas formatador = new FormataDatas();
        System.out.println("Data formatada: " + formatador.formatarData(data));
    }

}
