package Java_B3.Modulo_03.FinalProject.Telas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaConfig {

    public static void telaConfig() {
        int opcaoSelecionada;
        do {
            System.out.println("\n*** Controle de Configurações ***");
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Definir horário de funcionamento");
            System.out.println("2 - Definir dias de funcionamento");
            System.out.println("3 - Definir duração dos consultas");
            System.out.println("4 - Voltar para menu anterior");
            System.out.println("5 - Sair");

            Scanner scanner = new Scanner(System.in);
            try {
                opcaoSelecionada = scanner.nextInt();
            } catch (InputMismatchException e) {
                opcaoSelecionada = 0;
            }

            switch (opcaoSelecionada){
                case 1:
                    //configHorario();
                    break;
                case 2:
                    //configDias();
                    break;
                case 3:
                    //configDuracao();;
                    break;
                case 4:
                    TelaInicial.welcome();
                    break;
                case 5:
                    System.out.println("Saindo do Sistema...");
                    System.exit(0);
                default:
                    System.err.println("Opção inválida");
            }

        } while (true);
    }
}
