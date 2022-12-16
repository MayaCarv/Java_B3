package Java_B3.Modulo_04.FinalProject.Filing;

import Java_B3.Modulo_04.FinalProject.Repository.Paciente;
import Java_B3.Modulo_04.FinalProject.Repository.PacienteRepository;
import Java_B3.Modulo_04.FinalProject.Telas.TelaPaciente;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sort {
    public static void sort() {
        int option;
        do {
            System.out.println("\nSelecione o tipo de ordenação desejada:");
            System.out.println("1 - por ID");
            System.out.println("2 - por Ordem Alfabética");
            System.out.println("3 - Voltar para menu anterior");
            System.out.println("4 - Sair");

            Scanner scanner = new Scanner(System.in);
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                option = 0;
            }

            switch (option){
                case 1:
                    PacienteRepository.pacientesCadastrados.stream().
                            sorted(Comparator.comparingInt(Paciente::getId)).
                            forEach(System.out::println);
                    break;
                case 2:
                    PacienteRepository.pacientesCadastrados.stream().
                            sorted(Comparator.comparing(Paciente::getNomeCompleto)).
                            forEach(System.out::println);
                    break;
                case 3:
                    TelaPaciente.telaPaciente();
                    break;
                case 4:
                    System.out.println("Saindo do Sistema...");
                    System.exit(0);
                default:
                    System.err.println("Opção inválida");
            }
        } while (true);
    }
}
