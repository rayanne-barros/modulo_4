package aula2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DurationPratice {
    public static void main(String[] args) {
        Duration doisDias = Duration.ofDays(2);
        System.out.println(doisDias);
        Duration tresminutos = Duration.ofMinutes(3);
        System.out.println(tresminutos);
        Duration cincoSegundos = Duration.ofSeconds(5);
        System.out.println(cincoSegundos);

        LocalTime agora = LocalTime.now();
        System.out.println(agora.plus(doisDias));
        System.out.println(agora.plus(tresminutos));
        System.out.println(agora.plus(cincoSegundos));
    }
}
