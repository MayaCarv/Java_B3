package Java_B3.Modulo_03.FinalProject.Telas;

import java.util.Scanner;

public class TelaInicial {

    public static void main(String[] args) {
        welcome();
    }
    public static void welcome() {
        int opcaoSelecionada;
            do {
                System.out.println("\n**** Bem-vindo ao Sistema de Agendamento de Consultas ****");
                System.out.println("Selecione a opção desejada:");
                System.out.println("1 - Pacientes");
                System.out.println("2 - Agendamento");
                System.out.println("3 - Configurações");
                System.out.println("4 - Sair");

                Scanner scanner = new Scanner(System.in);
                opcaoSelecionada = scanner.nextInt();

                switch (opcaoSelecionada){
                    case 1:
                        TelaPaciente.telaPaciente();
                        break;
                    case 2:
                        TelaAgenda.telaAgenda();
                        break;
                    case 3:
                        TelaConfig.telaConfig();
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
