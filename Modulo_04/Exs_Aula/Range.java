package Java_B3.Modulo_04.Exs_Aula;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite a quantidade de horários:");
        int quantidade = input.nextInt();
        input.nextLine();

        int i = 0;
        while (i < quantidade) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

            System.out.println("\nDigite os dados de hora:");
            String hora = input.nextLine();

            String[] horaSeparada = hora.split("[|] *| +");

            LocalTime horaEntrada1 = LocalTime.parse(horaSeparada[0], formatter);
            LocalTime horaSaida1 = LocalTime.parse(horaSeparada[1], formatter);
            LocalTime horaEntrada2 = LocalTime.parse(horaSeparada[3], formatter);
            LocalTime horaSaida2 = LocalTime.parse(horaSeparada[4], formatter);

            long periodo1 = Duration.between(horaEntrada1, horaSaida1).toMinutes() - 240 ;
            long periodo2 = Duration.between(horaEntrada2, horaSaida2).toMinutes() - 240;

            if (horaEntrada1.isAfter(LocalTime.parse("08:05")))
                System.out.println("Abusou");
            else if (horaSaida1.isBefore(LocalTime.parse("11:55")))
                System.out.println("Abusou");
            else if (horaEntrada2.isAfter(LocalTime.parse("14:05")))
                System.out.println("Abusou");
            else if (horaSaida2.isBefore(LocalTime.parse("17:55")))
                System.out.println("Abusou");
            else if (periodo1 + periodo2 < 0)
                System.out.println("Abusou");
            else
                System.out.println("Não Abusou");
            i++;
        }
    }
}
