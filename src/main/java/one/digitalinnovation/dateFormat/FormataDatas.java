package one.digitalinnovation.dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormataDatas {

    public String formatarData(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
        return formatador.format(data);
    }

}
