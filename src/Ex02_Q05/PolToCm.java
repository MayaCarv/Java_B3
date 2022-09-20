package Ex02_Q05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PolToCm {
    public static void main (String[] args){

        System.out.println("\n*** Welcome to the Measurement Conversion Program ***\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the measurement (in inches) you want to convert:");
        float inch = input.nextFloat();

        System.out.println("\nThe values obtained are:");
        System.out.printf("%.2f\" ---> %.2fcm\n\n" , inch, inch * 2.54);
    }
}
