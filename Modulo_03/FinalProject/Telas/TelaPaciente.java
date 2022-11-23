package Java_B3.Modulo_03.FinalProject.Telas;

import Java_B3.Modulo_03.FinalProject.Repository.*;
import Java_B3.Modulo_03.FinalProject.Repository.Sort;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaPaciente {
    private static final PacienteRepository pacienteRepository = new PacienteRepository();
    public static void telaPaciente() {
        int opcaoSelecionada;
        do {
            System.out.println("\n*** Controle de Cadastro de Pacientes ***");
            System.out.println("\nSelecione a opção desejada:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Ver cadastrados");
            System.out.println("3 - Pesquisar paciente");
            System.out.println("4 - Apagar paciente");
            System.out.println("5 - Limpar cadastro completo");
            System.out.println("6 - Voltar para menu anterior");
            System.out.println("7 - Sair");

            Scanner scanner = new Scanner(System.in);
            try {
                opcaoSelecionada = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcaoSelecionada = 0;
            }
            switch (opcaoSelecionada){
                case 1:
                    Cadastro.cadastrar(scanner, pacienteRepository);
                    break;
                case 2:
                    Sort.sort();
                    break;
                case 3:
                    Search.pesquisar();
                    break;
                case 4:
                    Cadastro.apagaPaciente();
                    break;
                case 5:
                    Cadastro.apagaCadastro();
                    break;
                case 6:
                    TelaInicial.welcome();
                    break;
                case 7:
                    System.out.println("Saindo do Sistema...");
                    System.exit(0);
                default:
                    System.err.println("Opção inválida");
            }

        } while (opcaoSelecionada != 7);
    }
}

