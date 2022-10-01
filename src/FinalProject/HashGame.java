package FinalProject;

import java.util.Scanner;

public class HashGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char [][] board = new char[3][3];
        Board.initBoard(board);

        System.out.println("*** Welcome to Tic Tac Toe Game ***\n\n"
                + "Do you wanna to hear the rules? (y/n)");
        String rules = input.nextLine();
        if (rules.equalsIgnoreCase("y"))
           Game.helpGame();
        System.out.println("\nLet's play!! ");

        Players player1 = new Players();
        player1.name = Game.getName(1);
        player1.simb = 'O';

        Players player2 = new Players();
        player2.name = Game.getName(2);
        player2.simb = 'X';

        Game.playGame(board, player1,player2);
    }


//    public static void main(String[] args) {

//        System.out.println("*** Bem-vindos ao Jogo da Velha ***\n");
//
//        char simbP1 = 'X';
//        char simbP2 = 'O';
//        int pointP1 = 0;
//        int pointP2 = 0;
//        int over = 0;
//        char win;
//        helpGame();
//        String nameP1 = getPlayer(1, simbP1);
//        String nameP2 = getPlayer(2, simbP2);
//        char [][] tab = new char[3][3];
//        tab = initTab(tab);
//        while(over == 0) {
//            tab = getShot(tab, nameP1, simbP1);
//            win = winGame(tab);
//            tab = getShot(tab, nameP2, simbP2);
//            win = winGame(tab);
//            switch (win)
//            {
//                case 'X':   over = 1;
//                            System.out.printf("Fim de jogo.\nParabéns, %s!!!", nameP1);
//                            pointP1++;
//                            break;
//                case 'O':   over = 1;
//                            System.out.printf("Fim de jogo.\nParabéns, %s!!!", nameP2);
//                            pointP2++;
//                            break;
//                case '-':   over = 1;
//                            System.out.printf("Fim de jogo. Jogo empatado.");
//                            break;
//                default:    over = 0;
//            }
//        }
//    }
//    private static String getPlayer(int i, char simb) {
//        Scanner input = new Scanner(System.in);
//        System.out.printf("\nDigite o nome do %dº jogador (%c): ", i, simb);
//        return input.nextLine();
//    }
//    private static char [][] initTab(char [][] tab) {
//        for (int i = 0; i < 3; i++)
//            for (int j = 0; j < 3; j++)
//                tab[i][j] = ' ';
//        return tab;
//    }
//
//    private static char [][] getShot(char [][] tab, String name, char simb) {
//        Scanner input = new Scanner(System.in);
//        System.out.printf("\n%s é sua vez de jogar (%c):", name, simb);
//        String shot = input.nextLine();
//        int row = shot.charAt(0) - '0';
//        int column = shot.charAt(1) - '0';
//        if (row > 2 || column > 2 || tab[row][column] != ' ') {
//            System.err.println("Jogada inválida!! Tente novamente");
//            return getShot(tab, name, simb);
//        }
//        tab[row][column] = simb;
//        showTab(tab);
//        return (tab);
//    }
//    private static void showTab (char [][] tab){
//        System.out.println("    0    1    2 ");
//        System.out.printf("0  %c  |  %c  |  %c  \n", tab[0][0], tab[0][1], tab[0][2]);
//        System.out.println("  ---------------");
//        System.out.printf("1  %c  |  %c  |  %c  \n", tab[1][0], tab[1][1], tab[1][2]);
//        System.out.println("  ---------------");
//        System.out.printf("2  %c  |  %c  |  %c  \n", tab[2][0], tab[2][1], tab[2][2]);
//    }
//    private static char winGame(char [][] tab){
//        int count = 0;
//        char win = ' ';
//
//        if (tab[0][0] != ' ' && tab[0][0] == tab[0][1] && tab[0][0] == tab[0][2])
//            win = tab[0][0];
//        else if (tab[1][0] != ' ' && tab[1][0] == tab[1][1] && tab[1][0] == tab[1][2])
//            win = tab[1][0];
//        else if (tab[2][0] != ' ' && tab[2][0] == tab[2][1] && tab[2][0] == tab[2][2])
//            win = tab[2][0];
//        else if (tab[0][0] != ' ' && tab[0][0] == tab[1][0] && tab[0][0] == tab[2][0])
//            win = tab[0][0];
//        else if (tab[0][1] != ' ' && tab[0][1] == tab[1][1] && tab[0][1] == tab[2][1])
//            win = tab[0][1];
//        else if (tab[0][2] != ' ' && tab[0][2] == tab[1][2] && tab[0][2] == tab[2][2])
//            win = tab[0][2];
//        else if (tab[0][0] != ' ' && tab[0][0] == tab[1][1] && tab[0][0] == tab[2][2])
//            win = tab[0][0];
//        else if (tab[0][2] != ' ' && tab[0][2] == tab[1][1] && tab[0][2] == tab[2][0])
//            win = tab[0][2];
//        else {
//            for (int i = 0; i < 3; i++)
//                for (int j = 0; j < 3; j++)
//                    if (tab[i][j] != ' ')
//                        count++;
//             if (count == 9)
//                 win = '-';
//        }
//        return win;
//    }
}