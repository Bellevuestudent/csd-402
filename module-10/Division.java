 //Patrice Moracchini
 //CSD 402
 // Assignment 10.2
 // First program that creates an abstract class called Division.

public abstract class Division {
    private String divisionName;                // Instance variable for division name
    private int accountNumber;                  // Instance variable for account number 

    public Division(String divisionName, int accountNumber) {      // Constructor to initialize division name and account number
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {                              // Getter method for division name
        return divisionName;
    }

    public int getAccountNumber() {                               // Getter method for account number
        return accountNumber;
    }

    public abstract void display();                        // Abstract method to be implemented by subclasses to display division information
}