// Patrice Moracchini
// CSD 402 Module 2.2- Rock-Paper-Scissors
// This program allows the user to play Rock-Paper-Scissors against the computer. 
// It includes switch statements, boolean expressions, and string manipulation.

import java.util.Scanner; // Import Scanner for user input

public class RockPaperScissors {

    // Mapping the numeric choices to rock, paper, scissors
    private static String choiceToWord(int choice) {
        String word;

        switch (choice) {
            case 1 -> word = "ROCK";
            case 2 -> word = "PAPER";
            case 3 -> word = "SCISSORS";
            default -> word = "UNKNOWN";
        }

        return word;
    }

    // Determine the result of the game
    private static String determineResult(int user, int computer) {

        // Check for tie first
        boolean tie = (user == computer);
        if (tie) {
            return "Tie!";
        }

        // Determine winner using switch statement
        String message;

        switch (user) {
            case 1 -> message = (computer == 3)
                    ? "You win! Rock beats Scissors."
                    : "Computer wins! Paper beats Rock.";

            case 2 -> message = (computer == 1)
                    ? "You win! Paper beats Rock."
                    : "Computer wins! Scissors beats Paper.";

            case 3 -> message = (computer == 2)
                    ? "You win! Scissors beats Paper."
                    : "Computer wins! Rock beats Scissors.";

            default -> message = "Unexpected error: invalid choice values.";
        }

        return message;
    }

    //  Run game of Rock-Paper-Scissors
    private static void runGame(Scanner input) {

        System.out.println("\nRock-Paper-Scissors Game");
        System.out.println("  1 = Rock");
        System.out.println("  2 = Paper");
        System.out.println("  3 = Scissors");
        System.out.print("Enter your choice (1-3): ");

        // Input validation (hasNextInt)
        if (!input.hasNextInt()) {
            System.out.println("Invalid input. You must enter 1, 2, or 3.");
            input.nextLine(); // clear the bad input line
        } else {
            int userChoice = input.nextInt();
            input.nextLine(); // clear the newline character

            // Check if input is in range (1-3) boolean expression
            boolean inRange = (userChoice >= 1 && userChoice <= 3);
            if (!inRange) {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            } else {
                // Generate computer's choice (Math.random)
                int computerChoice = (int) (Math.random() * 3) + 1;

                // Convert choices to words (string manipulation)
                String userWord = choiceToWord(userChoice).trim().toUpperCase();
                String computerWord = choiceToWord(computerChoice).trim().toUpperCase();

                // Display selections
                System.out.println("\n--- Selections ---");
                System.out.println("The computer selected: " + computerWord + " (" + computerChoice + ")");
                System.out.println("You selected:      " + userWord + " (" + userChoice + ")");

                // Determine and display result, using method determineResult
                System.out.println("\n--- Result ---");
                System.out.println(determineResult(userChoice, computerChoice));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initial game run
        runGame(input);

        // Ask to play again
        System.out.print("\nPlay again? (Y/N): ");
        String againInput = input.nextLine().trim();

        // Handle empty input
        char playAgain;
        if (againInput.length() == 0) {
            playAgain = 'N';
        } else {
            playAgain = Character.toUpperCase(againInput.charAt(0));
        }

        // If user wants to replay, play one more round
        if (playAgain == 'Y') {
            runGame(input);
        }

        // Exit message, close scanner
        System.out.println("\nThanks for playing!");
        input.close();
    }
}