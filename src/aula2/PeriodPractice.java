package aula2;

import java.time.LocalDate;
import java.time.Period;

public class PeriodPractice {
    public static void main(String[] args) {
        Period umAno = Period.ofYears(1);
        Period umDia = Period.ofDays(1);
        Period doisMeses = Period.ofMonths(2);
        Period duasSemanas = Period.ofWeeks(3);
        System.out.println(umAno);
        System.out.println(umDia);
        System.out.println(doisMeses);
        System.out.println(duasSemanas);

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje.plus(umAno));
        System.out.println(hoje.plus(umDia));
        System.out.println(hoje.plus(doisMeses));
        System.out.println(hoje.plus(duasSemanas));



    }
}
