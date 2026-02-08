/*
 * Name: Patrice Moracchini
 * CSD 402
 * Module 5.2
 * Date: 2026-02-07
 *
 * This program defines methods to locate the largest and smallest values in 2D arrays of integers and doubles.
 * It demonstrates the use of nested loops to traverse the arrays and find the required values, 
 * returning their locations as row and column indices. 
 * The main method initializes sample 2D arrays, calls the locating methods, and prints the results.
 */

public class Moracchini_Mod_5_2_CSD402 {

    public static void main(String[] args) {

        int[][] intArray = {
                {3, 5, 2},
                {9, 1, 4}
        };
        // largest = 9 at [1,0]
        // smallest = 1 at [1,1]

        double[][] doubleArray = {
                {2.5, 7.1, 3.3},
                {6.0, 1.2, 4.4}
        };
        // largest = 7.1 at [0,1]
        // smallest = 1.2 at [1,1]

        int[] largestIntLoc = locateLargest(intArray);          // Returns {row, col} of the largest int in intArray.
        int[] smallestIntLoc = locateSmallest(intArray);        // Returns {row, col} of the smallest int in intArray.

        int[] largestDoubleLoc = locateLargest(doubleArray);    // Returns {row, col} of the largest double in doubleArray.
        int[] smallestDoubleLoc = locateSmallest(doubleArray);  // Returns {row, col} of the smallest double in doubleArray.

        System.out.println("intArray largest at:  [" + largestIntLoc[0] + ", " + largestIntLoc[1] + "]"         
                + " value=" + intArray[largestIntLoc[0]][largestIntLoc[1]]);     // Print the largest int value using the location returned by locateLargest.
        System.out.println("intArray smallest at: [" + smallestIntLoc[0] + ", " + smallestIntLoc[1] + "]"
                + " value=" + intArray[smallestIntLoc[0]][smallestIntLoc[1]]);  // Print the smallest int value using the location returned by locateSmallest.

        System.out.println("doubleArray largest at:  [" + largestDoubleLoc[0] + ", " + largestDoubleLoc[1] + "]"
                + " value=" + doubleArray[largestDoubleLoc[0]][largestDoubleLoc[1]]);   // Print the largest double value using the location returned by locateLargest.
        System.out.println("doubleArray smallest at: [" + smallestDoubleLoc[0] + ", " + smallestDoubleLoc[1] + "]"
                + " value=" + doubleArray[smallestDoubleLoc[0]][smallestDoubleLoc[1]]);  // Print the smallest double value using the location returned by locateSmallest.
    }

    // Required Methods: Locate Largest Methods
    // Returns {row, col} of the largest double in arrayParam
    public static int[] locateLargest(double[][] arrayParam) {  // Method to find the location of the largest double.

        int maxRow = 0;                             // Initialize maxRow to 0 (first row index).
        int maxCol = 0;                             // Initialize maxCol to 0 (first column index).
        double max = arrayParam[0][0];              // Initialize max to the first element of the array (top-left corner).

        for (int r = 0; r < arrayParam.length; r++) {          // Loop through each row of the array.
            for (int c = 0; c < arrayParam[r].length; c++) {    // Loop through each column of the current row.
                if (arrayParam[r][c] > max) {      // If the current element is greater than the current max, update max and its location.
                    max = arrayParam[r][c];
                    maxRow = r;
                    maxCol = c;
                }
            }
        }

        return new int[] { maxRow, maxCol };        // Return the location of the largest double as an array {row, col}.
    }

    // Returns {row, col} of the largest int in arrayParam
    public static int[] locateLargest(int[][] arrayParam) {         // Method to find the location of the largest int.

        int maxRow = 0;
        int maxCol = 0;
        int max = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > max) {
                    max = arrayParam[r][c];
                    maxRow = r;
                    maxCol = c;
                }
            }
        }

        return new int[] { maxRow, maxCol };
    }

    // Required Methods: Locate Smallest Methods
    // Returns {row, col} of the smallest double in arrayParam
    public static int[] locateSmallest(double[][] arrayParam) {         // Method to find the location of the smallest double.

        int minRow = 0;
        int minCol = 0;
        double min = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < min) {
                    min = arrayParam[r][c];
                    minRow = r;
                    minCol = c;
                }
            }
        }

        return new int[] { minRow, minCol };
    }

    // Returns {row, col} of the smallest int in arrayParam
    public static int[] locateSmallest(int[][] arrayParam) {        // Method to find the location of the smallest int.

        int minRow = 0;
        int minCol = 0;
        int min = arrayParam[0][0];

        for (int r = 0; r < arrayParam.length; r++) {
            for (int c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < min) {
                    min = arrayParam[r][c];
                    minRow = r;
                    minCol = c;
                }
            }
        }

        return new int[] { minRow, minCol };
    }
}