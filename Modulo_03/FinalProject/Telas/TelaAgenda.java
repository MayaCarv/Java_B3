package FinalProject.Telas;

import java.util.Scanner;

public class TelaAgenda {
    public static void telaAgenda() {
        int opcaoSelecionada;
        do{
            System.out.println("\n*** Controle de Agendamento ***");
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Marcar nova consulta");
            System.out.println("2 - Ver consulta marcada");
            System.out.println("3 - Desmarcar consulta");
            System.out.println("4 - Voltar para menu anterior");
            System.out.println("5 - Sair");

            Scanner scanner = new Scanner(System.in);
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada){
                case 1:
                    //marcarConsulta(pacienteRepository);
                    break;
                case 2:
                    //verConsulta(pacienteRepository);
                    break;
                case 3:
                    //desmarcarConsulta(pacienteRepository);
                    break;
                case 4:
                    TelaInicial.welcome();
                    break;
                case 5:
                    System.out.println("Saindo do Sistema...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }

        }while (opcaoSelecionada != 5);
    }
}
