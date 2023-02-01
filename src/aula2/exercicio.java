package aula2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        System.out.println("------ VACINAÇÃO ------");

        LocalDate hoje = LocalDate.now();
        Period umMes = Period.ofMonths(1);
        Period doisMeses = Period.ofMonths(2);

        System.out.println("A primeira dose da vacina  será em: " + hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("A segunda dose da vacina será em: "  +hoje.plus(umMes).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("A terceira dose da vacina será em: "  +hoje.plus(doisMeses).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
}

