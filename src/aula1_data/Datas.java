package aula1_data;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        //representando data de aniversario
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        //representando o horario de reuniao
        LocalTime now = LocalTime.now();
        System.out.println(now);

        //representando a data e hora de um evento
        LocalDateTime hojeAgora = LocalDateTime.now();
        System.out.println(hojeAgora);

        //representando fusos
        ZonedDateTime agoraZone = ZonedDateTime.now();
        System.out.println(agoraZone);

        LocalDate niver = LocalDate.of(2000, Month.JANUARY, 20);
        System.out.println(niver);

        LocalTime intervalo = LocalTime.of(20,45,20);

        System.out.println(niver.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        LocalDateTime niverHorario = LocalDateTime.of(niver, intervalo);
        LocalDateTime niverHorario2 = LocalDateTime.of(2000, Month.JANUARY, 20, 20, 45, 20);
        System.out.println(niverHorario);
        System.out.println(niverHorario2);
    }
}
