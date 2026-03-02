/*
 * Patrice Moracchini
 * CSD 402
 * Assignment 9.2
 * Program 2: Data file of random numbers, file I/O, and exception handling for file access
 * This program creates a file named data.file and writes 10 random integers (0..99)
 * separated by spaces) to the file. If the file already exists, it appends the new numbers to the end of the file. 
 * After writing, it reopens the file, reads its contents, and displays the numbers on the console.
 * The program includes exception handling for file access errors.
 */

import java.io.File;                // Importing File class for file handling
import java.io.FileWriter;          // Importing FileWriter class for writing to files
import java.io.IOException;         // Importing IOException class for handling input/output exceptions
import java.util.Random;            // Importing Random class for generating random numbers
import java.util.Scanner;           // Importing Scanner class for reading from file.

public class Program2_DataFileRandomNumbers {           // Main class definition named as required
       
    public static void main(String[] args) {                     
        File file = new File("data.file");    // Create a file object for data.file 
        Random random = new Random();                  // Create a Random object for generating random numbers

        // if the file already exists, it appends the new numbers to the end of the file.
        try (FileWriter writer = new FileWriter(file, true)) { // true = append mode
            // If the file already has content, add a leading space before appending new numbers
            if (file.exists() && file.length() > 0) {
                writer.write(" ");
            }
            
            for (int i = 0; i < 10; i++) {          // Generate a random integer (0..99) and write it to the file, separated by spaces
                int n = random.nextInt(100); 
                writer.write(Integer.toString(n));
                if (i < 9) {                       
                    writer.write(" ");
                }
            }
        } catch (IOException e) {               // Exception handling for file access errors
            System.out.println("File write error: " + e.getMessage());
            return;
        }

        // Reopen, read, and display file contents
        System.out.println("Contents of data.file:");
        try (Scanner fileScanner = new Scanner(file)) {             // Reopen the file and read its contents using Scanner
            while (fileScanner.hasNext()) {                         // Display the numbers on the console
                System.out.print(fileScanner.next() + " ");         // Print each number followed by a space
            }
            System.out.println();                                   // Print a newline after displaying all numbers
        } catch (IOException e) {                                   // Exception handling for file access errors
            System.out.println("File read error: " + e.getMessage());   // Handle the case where the file cannot be read and avoid crashing the program.
        }
    }
}