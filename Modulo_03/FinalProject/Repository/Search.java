package Java_B3.Modulo_03.FinalProject.Repository;

import Java_B3.Modulo_03.FinalProject.Telas.TelaPaciente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Search {
    public static Paciente searchID() {
        System.out.println("\nDigite o ID do paciente desejado: ");

        int id;
        Scanner scanner = new Scanner(System.in);
        try {
            id = scanner.nextInt();
        } catch (InputMismatchException e) {
            id = 0;
        }
        for (Paciente paciente : PacienteRepository.pacientesCadastrados) {
            if (paciente.getId() == id) {
                System.out.println(paciente);
                return (paciente);
            } else {
                System.out.println("Paciente não encontrado!!!");
            }
        }
        return null;
    }

    private static Paciente searchNome() {
        System.out.println("\nDigite o nome completo do paciente desejado: ");

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        for (Paciente paciente : PacienteRepository.pacientesCadastrados) {
            if (paciente.getNomeCompleto().equals(nome)) {
                System.out.println(paciente);
                return (paciente);
            } else {
                System.out.println("Paciente não encontrado!!!");
            }
        }
        return null;
    }

    public static void pesquisar() {
        int opcaoSelecionada;
        do {
            System.out.println("\nSelecione o tipo de pesquisa desejada:");
            System.out.println("1 - por ID");
            System.out.println("2 - por Nome Completo");
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
                    searchID();
                    break;
                case 2:
                    searchNome();
                    break;
                case 3:
                    TelaPaciente.telaPaciente();
                    break;
                case 4:
                    System.out.println("Saindo do Sistema...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcaoSelecionada != 4);
    }
}
