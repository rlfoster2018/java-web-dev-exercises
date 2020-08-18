package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        double miles;
        double gallon;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter miles travelled: ");
        miles = input.nextDouble();
        input.close();

        input = new Scanner(System.in);
        System.out.println("Enter gallons used in the travelling: ");
        gallon = input.nextDouble();
        input.close();

        mpg = miles / gallon;
        System.out.println("Your miles per gallon (mpg) is: " + mpg + ". May want to shift down on hills...");
    }
}
