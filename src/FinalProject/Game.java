package FinalProject;

import java.util.Scanner;

public class Game {
    public static void helpGame() {
        System.out.println("RULES");
        System.out.println("The game is played on a grid that's 3 squares by 3 squares.\n" +
                "The player 1 is O and the player 2 is the X. Players take turns putting their marks in empty squares.\n" +
                "The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner.\n" +
                "When all 9 squares are full, the game is over. If no player has 3 marks in a row, the game ends in a tie.\n");
        System.out.println("To play, enter a number for row and column. For example:\nPlayer: 02");
        System.out.println("\n  *** Board ***");
        System.out.println("    0    1    2 ");
        System.out.println("0     |     | X   ");
        System.out.println("  ---------------");
        System.out.println("1     |     |     ");
        System.out.println("  ---------------");
        System.out.println("2     |     |     ");
    }

    public static String getName(int i) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nEnter the name of the %dº player: ", i);
        return input.nextLine();
    }

    public static void playGame(char [][] board, Players player1, Players player2) {
        Board.showBoard(board);
        int over = 0;
        while (over == 0) {
            over = getShot(board, player1, over);
            if (over == 0)
                over = getShot(board, player2, over);
        }
        System.out.printf("Scoreboard: %s %d x %s %d",
                player1.name, player1.points, player2.name, player2.points);
        newGame(board, player1, player2);
    }

    public static int getShot(char [][] board, Players player, int over) {
        Scanner input = new Scanner(System.in);
        System.out.println(player.name + " it's your turn to play (" + player.simb + "): ");
        String shot = input.nextLine();
        if (shot.length() != 2) {
            System.err.println("Enter two numbers!! Try again...\n");
            getShot(board, player, over);
        } else {
            int row = shot.charAt(0) - '0';
            int column = shot.charAt(1) - '0';
            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.err.println("Invalid move!! Try again...\n");
                getShot(board, player, over);
            } else if (board[row][column] != ' ') {
                System.err.println("The square is already filled!! Try again...\n");
                getShot(board, player, over);
            } else {
                board[row][column] = player.simb;
                Board.showBoard(board);
                over = winGame(board, player, over);
                if (player.win == 1) {
                    System.out.printf("\n%s win!!\nEnd game.\n", player.name);
                    player.points++;
                }
            }
        }
        return over;
    }

    public static int winGame(char [][] board, Players player, int over){
        char win;

        win = verifyBoard(board);
        switch (win)
        {
            case 'O':
            case 'X':
                player.win = 1;
                over = 1;
                break;
            case '-':   System.out.println("\nEnd game. Tied game.");
                        over = 1;
                        break;
            default: break;
        }
        return over;
    }
    public static char verifyBoard(char [][] board) {
        int count = 0;

        for (int i = 0; i < 3; i++)
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2])
                return board[i][0];
        for (int i = 0; i < 3; i++)
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i])
                return board[0][i];
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2])
            return board[0][0];
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0])
            return board[0][2];
        else {
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    if (board[i][j] != ' ')
                        count++;
            if (count == 9)
                return '-';
        }
        return ' ';
    }
    public static void newGame(char [][] board, Players player1, Players player2) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\nPlay again? (y/n)");
        String again = input.nextLine();
        if (again.equalsIgnoreCase("y")) {
            Board.initBoard(board);
            player1.win = 0;
            player2.win = 0;
            Game.playGame(board, player1, player2);
        }
        System.exit(0);
    }
}
