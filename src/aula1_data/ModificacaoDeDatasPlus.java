package aula1_data;

import java.time.LocalDate;
import java.time.Month;

public class ModificacaoDeDatasPlus {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(data);

        data = data.plusDays(2);
        System.out.println(data);

        data = data.plusWeeks(1);
        System.out.println(data);

        data = data.plusMonths(1);
        System.out.println(data);
        System.out.println(data.plusYears(2).isLeapYear());
        System.out.println(data);
    }
}
