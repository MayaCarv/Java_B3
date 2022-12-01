package Java_B3.Modulo_04.Exs_Aula.Cronometro;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite A para iniciar:");
        String letra = input.next();

        if (letra.equals("A")) {
            Instant horaInicial = Instant.now();

            System.out.println("Digite B para parar:");
            letra = input.next();

            if (letra.equals("B")) {
                Instant horaFinal = Instant.now();
                System.out.println("Tempo: " +
                        Duration.between(horaInicial, horaFinal).toHours() + "h " +
                        Duration.between(horaInicial, horaFinal).toSeconds() + "s " +
                        Duration.between(horaInicial, horaFinal).toMillisPart() + "ms");
            }
        }


    }

}

