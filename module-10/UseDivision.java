// Patrice Moracchini
// CSD 402
// Assignment 10.2
// Fourth program that creates a class called UseDivision to test the Division, InternationalDivision, and DomesticDivision classes.

public class UseDivision {
    // Main method to create division objects and display their information
    public static void main(String[] args) {
        // Create instances of InternationalDivision with sample data
        InternationalDivision intl1 = new InternationalDivision("European Sales", 1001, "France", "French");
        InternationalDivision intl2 = new InternationalDivision("Asia Operations", 1002, "Japan", "Japanese");
        // Create instances of DomesticDivision with sample data
        DomesticDivision dom1 = new DomesticDivision("East Coast Marketing", 2001, "New York");
        DomesticDivision dom2 = new DomesticDivision("Central Coast Support", 2002, "Texas");
        // Display information for each division using the display method
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}