package aula1_data;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExercicioData {
    public static void main(String[] args) {


        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a data da primeira dose da vacina (dd/mm/aaaa): ");
        LocalDate dataPrimeiraDose = LocalDate.parse((entrada.nextLine()), formato);

        System.out.println("Digite a data da terceira dose da vacina (dd/mm/aaaa): ");
        LocalDate dataTerceiraDose = LocalDate.parse((entrada.nextLine()), formato);

        LocalDate SegundaDose = dataPrimeiraDose.plusMonths(1);
        System.out.println("A primeira dose da vacina  será em: " + dataPrimeiraDose.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("A segunda dose da vacina será em: " + SegundaDose.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("A terceira dose da vacina será em: " + dataTerceiraDose.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
}


