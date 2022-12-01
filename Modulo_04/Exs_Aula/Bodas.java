package Java_B3.Modulo_04.Exs_Aula;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bodas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("\nDigite a data do casamento:");
        LocalDate dataCasamento = LocalDate.parse(input.next(), formatter);

        System.out.println("Digite a data atual:");
        LocalDate dataAtual = LocalDate.parse(input.next(), formatter);

        int boda = Period.between(dataCasamento, dataAtual).getYears();
        System.out.println("\n" + boda + " anos de casados!!");
            switch (boda) {
                case 1:
                    System.out.println("\n🥰Bodas de Papel🥰");
                    break;
                case 5:
                    System.out.println("\n🥰Bodas de Madeira ou Ferro🥰");
                    break;
                case 10:
                    System.out.println("\n🥰Bodas de Estanho🥰");
                    break;
                case 15:
                    System.out.println("\n🥰Bodas de Cristal🥰");
                    break;
                case 30:
                    System.out.println("\n🥰Bodas de Pérola🥰");
                    break;
                case 40:
                    System.out.println("\n🥰Bodas de Esmeralda🥰");
                    break;
                case 50:
                    System.out.println("\n🥰Bodas de Ouro🥰");
                    break;
                default:
                    System.out.println("\nSem bodas");
            }
        }
    }

