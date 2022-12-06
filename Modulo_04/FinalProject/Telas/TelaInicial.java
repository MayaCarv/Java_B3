package Java_B3.Modulo_04.FinalProject.Telas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaInicial {

    public static void main(String[] args) {
        welcome();
    }
    public static void welcome() {
        int option;
            do {
                System.out.println("\n**** Bem-vindo ao Sistema de Agendamento de Consultas ****");
                System.out.println("Selecione a opção desejada:");
                System.out.println("1 - Pacientes");
                System.out.println("2 - Agendamento");
                System.out.println("3 - Configurações");
                System.out.println("4 - Sair");

                Scanner scanner = new Scanner(System.in);
                try {
                    option = scanner.nextInt();
                } catch (InputMismatchException e) {
                    option = 0;
                }

                switch (option){
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
                        System.err.println("Opção inválida");
            }
        } while (true);
    }
}
