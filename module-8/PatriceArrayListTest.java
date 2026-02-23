/*
 * Patrice Moracchini
 * CSD 402
 * Assignment 8.2
 * 
 * This program accepts integer input from the user and stores values
 * in an ArrayList until 0 is entered (0 is included). The list is sent
 * to the max method, which returns the largest value or 0 if the list
 * is empty.
 */

import java.util.ArrayList;         // Importing ArrayList class for dynamic array functionality
import java.util.Scanner;           // Importing Scanner class for user input

public class PatriceArrayListTest {  // Main class definition named as required

    // Required method signature
    public static Integer max(ArrayList list) { // Method that receives the list and returns the largest value in the list. If the list is empty, the method should return 0.                                  

        if (list == null || list.size() == 0) {     // Check if the list is null or empty, and return 0 if true.
            return 0;                               
        }

        Integer largest = (Integer) list.get(0);    // Initialize largest with the first element of the list, assuming it's an Integer.

        for (Object obj : list) {                   //  This loop checks each element in the list, 
                                                    // comparing it to the current largest value. If a larger value is found, it updates largest.
            Integer value = (Integer) obj;
            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }

    // Testing code
    public static void main(String[] args) {        // Main method to execute the program

        Scanner input = new Scanner(System.in); // accepts the user input.
        ArrayList<Integer> numbers = new ArrayList<>();    // Creates an ArrayList to store the integers entered by the user. The list will be passed to the max method, which will find and return the largest value.
        

        System.out.println("Enter integers (enter 0 to stop):"); // Prompting the user for input

        while (true) {              // Loop to continuously read user input until 0 is entered
            int value = input.nextInt();        // Read an integer from the user.
            numbers.add(value);                 // Add the value to the ArrayList.
                                                
            if (value == 0) {           // Check if the entered value is 0, which indicates the end of input.
                break;
            }
        }

        Integer result = max(numbers);      // Call the max method with the list of numbers to find the largest value. 

        System.out.println("Largest value: " + result);     // Output the largest value found in the list using the max method.

        input.close();             // Close the Scanner to prevent resource leaks.
    }
}
