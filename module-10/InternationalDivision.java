// Patrice Moracchini
// CSD 402
// Assignment 10.2
// Second program that creates a subclass of Division called InternationalDivision.

public class InternationalDivision extends Division {   // Subclass of Division representing an international division
    private String country;                             // Instance variable for country    
    private String languageSpoken;                      // Instance variable for language spoken   
    // Constructor to initialize division name, account number, country, and language spoken
    public InternationalDivision(String divisionName, int accountNumber, String country, String languageSpoken) {
        super(divisionName, accountNumber);        // Call the constructor of the superclass Division to initialize division name and account number
        this.country = country;
        this.languageSpoken = languageSpoken;
    }
    // Override the display method to show information specific to the international division
    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language Spoken: " + languageSpoken);
        System.out.println();
    }
}