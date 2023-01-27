package aula1_data;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        System.out.println("------ VACINAÇÃO ------");
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite seu nome: " );
        String nome = entrada.nextLine();

        System.out.println("Digite a data da primeira dose da vacina (dd/mm/aaaa): ");
        LocalDate dataPrimeiraDose = LocalDate.parse((entrada.nextLine()), formato);

        System.out.println("Digite a data da terceira dose da vacina (dd/mm/aaaa): ");
        LocalDate dataTerceiraDose = LocalDate.parse((entrada.nextLine()), formato);

        if(dataTerceiraDose.isAfter(dataPrimeiraDose)) {
            LocalDate SegundaDose = dataPrimeiraDose.plusMonths(1);
            System.out.println(nome +" a primeira dose da vacina  será em: " + dataPrimeiraDose.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println(nome +" a segunda dose da vacina será em: " + SegundaDose.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println(nome +" a terceira dose da vacina será em: " + dataTerceiraDose.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        } else System.out.println(nome + " a data para a terceira dose deve ser após a data da primeira dose");
    }
}
