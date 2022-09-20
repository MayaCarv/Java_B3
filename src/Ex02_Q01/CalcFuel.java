package Ex02_Q01;

import java.util.Scanner;

public class CalcFuel {
    public static final int SPEND = 12;
    public static void main(String[] args) {
        System.out.println("\n*** Welcome to the Fuel Spent Calculator ***\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time spent (in hours) on your trip:\n--->For example: for 1:30h of travel, enter 1,5\n");
        float time = input.nextFloat();

        System.out.println("\nEnter the average speed (in km/h) of your trip:");
        float speed = input.nextFloat();

        float dist = time * speed;
        float liters = dist / SPEND;

        System.out.println("\n*** The results obtained are: ***");
        System.out.println("\nThe average speed of your trip was: " + speed + "km/h");
        System.out.println("The time spent on your trip was: " + time + "h");
        System.out.println("The distance traveled on your trip was: " + dist + "km/h");
        System.out.printf("\nThe number of liters of fuel spent on your trip was: %.2fL\n\n", liters);

        input.close();
    }
}
