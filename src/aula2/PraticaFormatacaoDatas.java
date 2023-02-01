package aula2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PraticaFormatacaoDatas {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(agora.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(agora.format(DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a")));
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));

        String dataString = "20/03/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConvertida = LocalDate.parse(dataString, formatter);
        System.out.println(dataConvertida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        String dataHoraString =  "12/01/2023 08:59 PM";

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        LocalDateTime data1 = LocalDateTime.parse(dataHoraString, formatter1);
        System.out.println(data1.format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm a")));


    }
}
