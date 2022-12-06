package Java_B3.Modulo_04.FinalProject.Telas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaConfig {

    public static void telaConfig() {
        int option;
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
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                option = 0;
            }

            switch (option){
                case 1:
                    //configTime();
                    break;
                case 2:
                    //configDays();
                    break;
                case 3:
                    //configDuration();;
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
