package aula1_data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EventosEspeciais {

    private EventosEspeciais() {}

    public static void main(String[] args) {
        evento1();
        evento2();
        evento3();
    }

    public static LocalDate evento1() {
        LocalDate aniversarioMae = LocalDate.of(1958, Month.APRIL, 28);;
        System.out.println(aniversarioMae.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return aniversarioMae;
    }
    public static LocalTime evento2() {
        LocalTime data = LocalTime.of(20, 36,23);
        System.out.println(data.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        return data;
    }
    public static LocalDateTime evento3() {
        LocalDateTime meuAniversario = LocalDateTime.of(1995, Month.MARCH, 29, 10, 45, 20);
        System.out.println(meuAniversario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        return meuAniversario;
    }


}
