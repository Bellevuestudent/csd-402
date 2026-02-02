/*
 * Name: Patrice Moracchini
 * Course: CSD-402
 * Module: 3.3
 * Assignment: Nested For Loops Pattern
 * Date: 2026-01-25
 * Description: This program prints a centered pyramid pattern of powers of two,
 *              with each row ending in an '@' symbol aligned vertically.
 *              It demonstrates the use of nested loops,  and method returns
 */

public class moracchini_mod3_csd402 { // Class name matches file name

    public static void main(String[] args) { // Main method

        final int ROWS = 7; // Total number of rows in the pyramid

        // The last row determines where the '@' should line up. 
        int targetAtColumn = rowIndent(ROWS - 1, ROWS) + rowNumbersLength(ROWS - 1) + 1; // +1 space before '@'

        for (int row = 0; row < ROWS; row++) {      // Loop through each row

            int indent = rowIndent(row, ROWS);      // Calculate leading spaces for current row
            printSpaces(indent);                    // Print leading spaces for centering

            // Increasing side: 1, 2, 4, ..., 2^row
            for (int i = 0; i <= row; i++) {        // Print powers of two, separated by spaces
                if (i > 0) {                        // Avoid leading space before the first number
                    System.out.print(" ");       // Print space between numbers
                }
                System.out.print(powerOfTwo(i));    // Print 2^i
            }

            // Decreasing side: 2^(row-1), ..., 2, 1
            for (int i = row - 1; i >= 0; i--) {    // Print powers of two in decreasing order
                System.out.print(" ");           // Print space before the number
                System.out.print(powerOfTwo(i));   // Print 2^i
            }

            // Aligning '@' symbol
            int currentLen = indent + rowNumbersLength(row); // Current length of printed content
            int spacesToAt = targetAtColumn - currentLen;    // Calculate spaces needed to align '@'
            printSpaces(spacesToAt);                         // Print spaces to align '@'

            // Required '@' at the end of each line
            System.out.println("@"); 
        }
    }

    // Returns the number of leading spaces for a given row.
    private static int rowIndent(int row, int totalRows) {  // Calculate indentation
        return 2 * (totalRows - 1 - row);                   // 2 spaces per level of indentation
    }

    // Returns the total length of numbers and spaces in a given row.
    // Example row 3: "1 2 4 8 4 2 1"
    private static int rowNumbersLength(int row) {  // Calculate length of numbers in the row
        int numbersCount = 2 * row + 1;             // Total numbers in the row
        int digitsSum = 0;                          // Sum of digits in the numbers    

        // Increasing side digits
        for (int i = 0; i <= row; i++) {            // Count digits for increasing side
            digitsSum += digits(powerOfTwo(i));     // Add digits of 2^i
        }

        // Decreasing side digits
        for (int i = row - 1; i >= 0; i--) {        // Count digits for decreasing side
            digitsSum += digits(powerOfTwo(i));     // Add digits of 2^i
        }

        // Single spaces between numbers
        int spacesBetweenNumbers = numbersCount - 1;    // Spaces between numbers
        return digitsSum + spacesBetweenNumbers;        // Total length = digits + spaces
    }

    // Returns the number of digits in a given integer value.
    private static int digits(int value) {
        int count = 0;                          // Initialize digit count   
        do {                                    // Count digits using division   
            count++;                            // Increment count for each digit
            value /= 10;                        // Remove last digit 
        } while (value != 0);                   // Continue until all digits are counted
        return count;                           // Return total digit count
    }

    // Prints a specified number of spaces.
    private static void printSpaces(int count) {  
        for (int i = 0; i < count; i++) {           
            System.out.print(" ");               
        }
    }

    // Returns 2 raised to the power of exp.
    private static int powerOfTwo(int exp) {     // Calculate 2^exp
        int result = 1;                          // Initialize result    
        for (int i = 0; i < exp; i++) {          // Loop exp times
            result *= 2;                         // Multiply result by 2 each iteration
        }
        return result;      
    }
}