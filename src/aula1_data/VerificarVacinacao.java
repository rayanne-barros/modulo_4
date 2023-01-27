package aula1_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VerificarVacinacao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer quantDoses = 3;
        System.out.println("------ CALENDÁRIO DE VACINAÇÃO ------");
        System.out.println("Digite seu nome: " );
        String nome = input.nextLine();

        System.out.println("qual dia vc deseja iniciar sua vacinacão ? ");

        System.out.println("0 - Hoje \n" +
                "1 - agendar" );

        Integer opcao = input.nextInt();
        if (opcao == 0){
            LocalDate dataInicial = LocalDate.now();

            for (int i = 0; i < quantDoses; i++){
                System.out.println("O dia da sua " + (i + 1) + "ª dose = " + dataInicial.plusMonths(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }

            System.out.println("\nVacina salva vidas");

        }if (opcao == 1){

            DateTimeFormatter dataFonmatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Informe o dia (dd/mm/aaaa): ");
            input.nextLine();

            LocalDate agendamento = LocalDate.parse((input.nextLine()),dataFonmatada);

            for (int i = 0; i < quantDoses; i++){
                System.out.println("O dia da sua " + (i + 1) + "ª dose = " + agendamento.plusMonths(i));

            }
            System.out.println("\nVacina salva vidas");
        }




    }
}
