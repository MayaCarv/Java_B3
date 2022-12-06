package Java_B3.Modulo_03.FinalProject.Repository;

import Java_B3.Modulo_03.FinalProject.Telas.TelaPaciente;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sort {
    private static class SortById implements Comparator<Paciente> {
        @Override
        public int compare(Paciente a, Paciente b) {
            return a.getId() - b.getId();
        }
    }
    private static class SortByName implements Comparator<Paciente> {
        @Override
        public int compare(Paciente a, Paciente b) {
            return a.getNomeCompleto().compareTo(b.getNomeCompleto());
        }
    }
    public static void sort() {
        int opcaoSelecionada;
        do {
            System.out.println("\nSelecione o tipo de ordenação desejada:");
            System.out.println("1 - por ID");
            System.out.println("2 - por Ordem Alfabética");
            System.out.println("3 - Voltar para menu anterior");
            System.out.println("4 - Sair");

            Scanner scanner = new Scanner(System.in);
            try {
                opcaoSelecionada = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcaoSelecionada = 0;
            }

            switch (opcaoSelecionada){
                case 1:
                    Collections.sort(PacienteRepository.pacientesCadastrados, new SortById());
                    Cadastro.imprimePacientesCadastrados();
                    break;
                case 2:
                    Collections.sort(PacienteRepository.pacientesCadastrados, new SortByName());
                    Cadastro.imprimePacientesCadastrados();
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
        } while (opcaoSelecionada != 4);
    }
}
