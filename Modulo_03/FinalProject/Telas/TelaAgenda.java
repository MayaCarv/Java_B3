package Java_B3.Modulo_03.FinalProject.Telas;

import java.util.Scanner;

public class TelaAgenda {
    public static void telaAgenda() {
        int opcaoSelecionada;
        do {
            System.out.println("\n*** Controle de Agendamento ***");
            System.out.println("Selecione a op��o desejada:");
            System.out.println("1 - Marcar nova consulta");
            System.out.println("2 - Ver consulta marcada");
            System.out.println("3 - Desmarcar consulta");
            System.out.println("4 - Ver agenda");
            System.out.println("5 - Voltar para menu anterior");
            System.out.println("6 - Sair");

            Scanner scanner = new Scanner(System.in);
            opcaoSelecionada = scanner.nextInt();

            switch (opcaoSelecionada){
                case 1:
                    //marcarConsulta();
                    break;
                case 2:
                    //verConsulta();
                    break;
                case 3:
                    //desmarcarConsulta();
                    break;
                case 4:
                    //verAgenda();
                    break;
                case 5:
                    TelaInicial.welcome();
                    break;
                case 6:
                    System.out.println("Saindo do Sistema...");
                    System.exit(0);
                default:
                    System.out.println("Op��o inv�lida");
            }

        } while (opcaoSelecionada != 6);
    }
}
