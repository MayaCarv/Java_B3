package Java_B3.Modulo_01.Ex02_Q02;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {

        System.out.println("\n*** Welcome to the Multiplication Table Program ***\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer between 1 and 10:");
        int num = input.nextInt();

        System.out.printf("\nThe multiplication table of %d is:\n", num);
        System.out.printf("%d x %d = %d\n", num, 0, 0);
        System.out.printf("%d x %d = %d\n", num, 1, num);
        System.out.printf("%d x %d = %d\n", num, 2, num * 2);
        System.out.printf("%d x %d = %d\n", num, 3, num * 3);
        System.out.printf("%d x %d = %d\n", num, 4, num * 4);
        System.out.printf("%d x %d = %d\n", num, 5, num * 5);
        System.out.printf("%d x %d = %d\n", num, 6, num * 6);
        System.out.printf("%d x %d = %d\n", num, 7, num * 7);
        System.out.printf("%d x %d = %d\n", num, 8, num * 8);
        System.out.printf("%d x %d = %d\n", num, 9, num * 9);
        System.out.printf("%d x %d = %d\n\n", num, 10, num * 10);
    }
}
