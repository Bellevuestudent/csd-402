/*
 * Name: Patrice Moracchini
 * Course: CSD 402
 * Module: 1
 * Assignment: Energy to Heat Water (Java/JavaFX Setup)
 * Date: 2026-01-26
 *
 * Description:
 * This program calculates the energy required to heat a given amount of water
 * from an initial temperature to a final temperature.
 */

import java.util.Scanner; // Import the Scanner class for user input

public class MoracchiniMod1CSD402 {  // Main class

    public static void main(String[] args) {  // Main method
        Scanner input = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter the amount of water in kilograms: "); // Prompt for water mass
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): "); // Prompt for initial temperature
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): "); // Prompt for final temperature
        double finalTemperature = input.nextDouble();

        double q = waterMass * (finalTemperature - initialTemperature) * 4184;  // Calculate energy needed

        System.out.println();
        System.out.println("Energy needed (Q) in Joules: " + q);   // Display the result

        input.close();
    }
}