package Java_B3.Modulo_01.Ex02_Q03;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        System.out.println("\n*** Welcome to the Temperature Conversion Program ***\n");

        float celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature (in celsius) you want to convert:");
        celsius = input.nextFloat();
        System.out.println("\nThe values obtained are:");
        System.out.printf("%.2f ºC ---> %.2f ºF\n\n" , celsius, (float) (celsius * 9.0 / 5 + 32));


    }
}
