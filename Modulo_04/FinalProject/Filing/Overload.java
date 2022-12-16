package Java_B3.Modulo_04.FinalProject.Filing;

import Java_B3.Modulo_04.FinalProject.Repository.Paciente;
import Java_B3.Modulo_04.FinalProject.Repository.PacienteRepository;
import Java_B3.Modulo_04.FinalProject.Telas.TelaPaciente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Overload {

    public static void apagaCadastro(Paciente paciente) {
        if (paciente != null) {
            do {
                System.out.println("\nTem certeza que deseja apagar os dados do paciente?");
                Overload.choice(paciente);
            } while (true);
        }
    }
    public static void apagaCadastro() {
        do {
            System.out.println("\nTem certeza que deseja apagar todos os dados de cadastro?");
            Overload.choice();
        } while (true);
    }

    public static void choice (Paciente paciente) {
        int option = getOption();
        switch (option) {
            case 1:
                System.out.println("_____________LIMPANDO PACIENTE______________\n");
                PacienteRepository.pacientesCadastrados.remove(paciente.getId() - 1);
                TelaPaciente.telaPaciente();
                break;
            case 2:
                TelaPaciente.telaPaciente();
                break;
            case 3:
                System.out.println("Saindo do Sistema...");
                System.exit(0);
            default:
                System.err.println("Opção inválida");
        }
    }
    public static void choice () {
        int option = getOption();
        switch (option) {
            case 1:
                System.out.println("_____________LIMPANDO O CADASTRO______________\n");
                PacienteRepository.pacientesCadastrados.clear();
                TelaPaciente.telaPaciente();
                break;
            case 2:
                TelaPaciente.telaPaciente();
                break;
            case 3:
                System.out.println("Saindo do Sistema...");
                System.exit(0);
            default:
                System.err.println("Opção inválida");
        }
    }
    private static int getOption() {
        int option;
        System.out.println("\nSelecione a opção desejada:");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("3 - Sair");

        Scanner scanner = new Scanner(System.in);
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException e) {
            option = 0;
        }
        return option;
    }
}
