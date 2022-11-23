package Java_B3.Modulo_03.FinalProject.Telas;

import FinalProject.Repository.*;
import FinalProject.Repository.Sort;
import FinalProject.Telas.TelaInicial;

import java.text.ParseException;
import java.util.Scanner;

import static FinalProject.Repository.Cadastro.editaPaciente;

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
            System.out.println("4 - Editar cadastro");
            System.out.println("5 - Apagar cadastro");
            System.out.println("6 - Voltar para menu anterior");
            System.out.println("7 - Sair");

            Scanner scanner = new Scanner(System.in);
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada){
                case 1:
                    try {
                        Cadastro.cadastrar(scanner, pacienteRepository);
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    Sort.sort();
                    break;
                case 3:
                    Search.pesquisar();
                    break;
                case 4:
                    editaPaciente();
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
                    System.out.println("Opção inválida");
            }

        } while (opcaoSelecionada != 7);
    }
}

