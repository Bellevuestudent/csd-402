/*
 * Patrice Moracchini
 * CSD 402
 * Assignment 9.2
 * Program 1: ArrayList of Strings, for-each loop, auto-boxing, and auto-unboxing
 * This program creates an ArrayList of Strings, populates it with 10 movie titles,
 * and uses a for-each loop to display the contents. 
 * It then prompts the user to enter an element number (1-10) to display again, demonstrating auto-boxing and auto-unboxing with the user's input. 
 * The program includes exception handling for out-of-bounds access.
 */


import java.util.ArrayList;     // Importing ArrayList class for dynamic array functionality
import java.util.List;      // Importing List interface for type declaration of the ArrayList
import java.util.Scanner;   // Importing Scanner class for user input
// Main class definition named as required
public class Program1_ArrayListStrings {

    public static void main(String[] args) {        // Create an ArrayList of Strings and populate it with 10 movie titles
        List<String> items = new ArrayList<>();
        items.add("Clue");
        items.add("The Matrix");
        items.add("Dark Waters");
        items.add("Dolores Claiborne");
        items.add("Close Encounters Of the Third Kind");
        items.add("Minority Report");
        items.add("Bugonia");
        items.add("The Help");
        items.add("Back to the Future");
        items.add("Prey");
        // Use a for-each loop to display the contents of the ArrayList
        System.out.println("ArrayList contents (for-each loop):");
        for (String s : items) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Which element number would you like to see again? (Enter 1 to " + items.size() + ")");
        // Prompt the user to enter an element number (1-10) to display again, demonstrating auto-boxing and auto-unboxing with the user's input
        String userText;
        try (Scanner input = new Scanner(System.in)) {
            userText = input.nextLine(); // user's String input
        }
        // Exception handling for out-of-bounds access and non-integer input
        try {
            // Convert the user's String to an int, then demonstrate auto-boxing and auto-unboxing
            int choicePrimitive = Integer.parseInt(userText.trim());
            Integer choiceBoxed = choicePrimitive; // auto-boxing: int -> Integer
            int choice = choiceBoxed;              // auto-unboxing: Integer -> int

            int index = choice - 1; // user enters 1..size, list uses 0..size-1
            System.out.println("You selected: " + items.get(index));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("An Exception has been thrown: Out of Bounds");
        // Handle the case where the user input is not a valid integer and  avoid crashing the program.
        } catch (NumberFormatException ex) {
            
            System.out.println("An Exception has been thrown: Out of Bounds");
        }
    }
}