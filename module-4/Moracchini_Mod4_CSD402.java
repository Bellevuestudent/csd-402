/*
 * Patrice Moracchini
 * CSD 402
 * Module 4.2
 *
 * This program shows method overloading by implementing multiple
 * average methods that calculate the average of arrays of different
 * data types: short, int, long, and double.
 * Each method computes the average and returns the result. 
 */
import java.util.Arrays;

public class Moracchini_Mod4_CSD402 {

    // Overloaded average methods: same method name, different parameter types.
    // short, int, long, double.
    // For this assignment, the test program only uses valid arrays (non-null, length > 0).

    public static short average(short[] array) {
        if (array.length == 0) return 0; // prevents dividing by zero
        long sum = 0; // safer than short for accumulation
        for (short value : array) {
            sum += value;
        }
        //Integer division (no decimals).
        return (short) (sum / array.length); // Cast back to short (integer division truncates decimals).
    }

    public static int average(int[] array) {
        if (array.length == 0) return 0; // prevents dividing by zero
        long sum = 0; // safer than int for accumulation
        for (int value : array) {
            sum += value;
        }
        // Integer division (no decimals).
        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        if (array.length == 0) return 0L; // prevents dividing by zero
        long sum = 0; // long is sufficient for summing longs
        for (long value : array) {
            sum += value;
        }
        // Integer division (no decimals).
        return (sum / array.length);
    }

    public static double average(double[] array) {
        if (array.length == 0) return 0.0; // prevents dividing by zero
        double sum = 0.0; // use double for floating-point sum to preserve decimals
        for (double value : array) {
            sum += value;
        }
        // floating-point division
        return (sum / array.length);
    }

    // Test program

    public static void main(String[] args) {

        // Each array is a different size for testing.
        short[] shortArray = {12, 18, 25};                      // size 3
        int[] intArray = {5, 10, 15, 20, 25};                   // size 5
        long[] longArray = {10000000000L, 15000000000L, 9000000000L, 11000000000L}; // size 4
        double[] doubleArray = {1.5, 2.25, 3.75, 4.0, 5.5, 6.0}; // size 6

        System.out.println("=== Module 4: Overloaded Average Methods ===\n");
        // Calculate and display averages for each array type
        displayResult("short[]", shortArray, average(shortArray)); 
        displayResult("int[]", intArray, average(intArray));        
        displayResult("long[]", longArray, average(longArray));
        displayResult("double[]", doubleArray, average(doubleArray));
    }

    // Display methods for easy-to-read output.

    private static void displayResult(String label, short[] array, short avg) {
        System.out.println(label + " (size " + array.length + ")"); // display size
        System.out.println("Elements: " + Arrays.toString(array)); // display elements
        System.out.println("Average : " + avg); // display average
        System.out.println(); // blank line for readability
    }

    private static void displayResult(String label, int[] array, int avg) {
        System.out.println(label + " (size " + array.length + ")");
        System.out.println("Elements: " + Arrays.toString(array));
        System.out.println("Average : " + avg);
        System.out.println();
    }

    private static void displayResult(String label, long[] array, long avg) {
        System.out.println(label + " (size " + array.length + ")");
        System.out.println("Elements: " + Arrays.toString(array));
        System.out.println("Average : " + avg);
        System.out.println();
    }

    private static void displayResult(String label, double[] array, double avg) {
        System.out.println(label + " (size " + array.length + ")");
        System.out.println("Elements: " + Arrays.toString(array));
        System.out.printf("Average : %.4f%n%n", avg);
    }

}