/*
 * Name: Patrice Moracchini
 * Course: CSD 402
 * Assignment 11.3 
 * redo of assignment 1.3: Energy to Heat Water 
 * This program calculates the energy required to heat a given amount of water
 * from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class Moracchini_Mod11_3_CSD402 {

    public static double calculateEnergy(double mass, double initialTemp, double finalTemp) {
        return mass * (finalTemp - initialTemp) * 4184;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemperature = input.nextDouble();

        double q = calculateEnergy(waterMass, initialTemperature, finalTemperature);

        System.out.println();
        System.out.println("Energy needed (Q) in Joules: " + q);

        input.close();
    }
}