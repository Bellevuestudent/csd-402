// Patrice Moracchini
// CSD 402
// Assignment 10.2
// Third program that creates a subclass of Division called DomesticDivision.

public class DomesticDivision extends Division {    // Subclass of Division representing a domestic division
    private String state;                           // Instance variable for state 
    // Constructor to initialize division name, account number, and state
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);     // Call the constructor of the superclass Division to initialize division name and account number
        this.state = state;
    }
    // Override the display method to show information specific to the domestic division
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
        System.out.println();
    }
}