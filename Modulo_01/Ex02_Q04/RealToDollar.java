package Java_B3.Modulo_01.Ex02_Q04;

import java.util.Scanner;
import java.math.*;

public class RealToDollar {
    public static void main(String[] args) {

        System.out.println("\n*** Welcome to the Currency Conversion Program ***\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dollar quote of the day:\nUS$");
        BigDecimal dollar = input.nextBigDecimal();

        System.out.print("\nEnter the value (in Real) you want to convert:\nR$");
        BigDecimal real = input.nextBigDecimal();

        System.out.printf("\n---> The value in dollars obtain is: \nUS$%.2f\n\n", real.divide(dollar, 2, RoundingMode.HALF_UP));


    }

}
