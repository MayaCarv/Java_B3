package Java_B3.Modulo_03.FinalProject.Filing;

import Java_B3.Modulo_03.FinalProject.Repository.Paciente;
import Java_B3.Modulo_03.FinalProject.Repository.PacienteRepository;
import Java_B3.Modulo_03.FinalProject.Telas.TelaPaciente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Overload {
    public static void choice ( Paciente paciente) {
        int opcaoSelecionada = getOpcaoSelecionada();
        switch (opcaoSelecionada) {
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
        int opcaoSelecionada = getOpcaoSelecionada();
        switch (opcaoSelecionada) {
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
    private static int getOpcaoSelecionada() {
        int opcaoSelecionada;
        System.out.println("\nSelecione a opção desejada:");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("3 - Sair");

        Scanner scanner = new Scanner(System.in);
        try {
            opcaoSelecionada = scanner.nextInt();
        } catch (InputMismatchException e) {
            opcaoSelecionada = 0;
        }
        return opcaoSelecionada;
    }
}
