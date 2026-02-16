/*
 * Patrice Moracchini
 * CSD 402
 * Module 6.2
 * Assignment: Fan Class
 *
 * This program defines a Fan class with speed, on/off state, radius, and color.
 * The main method tests the Fan class by creating two Fan objects and printing
 * their states before and after changes. Additionally, it demonstrates the use of a collection of Fan objects.
 *
 */


// Main class to test the Fan class.
public class Moracchini_Mod_7_2_CSD402 {
    // Helper method to display an array of fans.
    public static void displayFans(Fan[] fans) {
        for (int i = 0; i < fans.length; i++) {
            displayFan(fans[i]);
        }
    }
    // Helper method to display a single fan's description.
    public static void displayFan(Fan fan) {
        System.out.println(fan.getDescription());
    }

    // Main method, entry point of the program.
    public static void main(String[] args) {

        // Test code: create two Fan objects and display results.
        Fan[] fans = new Fan[3];

        // Fan 1: default constructor.
        Fan fan1 = new Fan();           // Create fan1 using the default constructor.
        System.out.println("Fan 1 (default settings):");      // Print a label for fan1.
        displayFan(fan1);           // Print fan1 (without toString()).

        // Use setters to change fan1 properties

        fan1.setOn(true);                // Turn the fan ON.
        fan1.setSpeed(Fan.MEDIUM);          // Set speed to MEDIUM.
        fan1.setRadius(8.0);         // Set radius to 8.0.
        fan1.setColor("blue");        // Set color to blue.

        System.out.println("\nFan 1 (after changes):");      // Print a label for the updated fan1.
        displayFan(fan1);                                  // Print updated fan1 (without toString()).

        // Fan 2: argument constructor.
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "yellow");  // Create fan2 using the argument constructor.
        System.out.println("\nFan 2 (custom settings):");   // Print a label for fan2.
        displayFan(fan2);       // Print fan2 (without toString()).

        // Turn fan2 OFF and display again.
        fan2.setOn(false);              // Turn the fan OFF.
        System.out.println("\nFan 2 (after turning off):"); // Print a label for the updated fan2.
        displayFan(fan2);           // Print updated fan2 (without toString()).

        Fan fan3 = new Fan(Fan.SLOW, true, 7.5, "red"); // Create a third fan with custom settings.

        fans[0] = fan1; //  Add fan1 to the fans array.
        fans[1] = fan2; //  Add fan1 and fan2 to the fans array.
        fans[2] = fan3; //  Add fan3 to the fans array.

        System.out.println("\nAll fans in the collection:"); // Print a label for the collection of fans.
        displayFans(fans); // Display all fans in the collection using the helper method.
    }
}

/*
 * Fan class definition.
 */
class Fan {

    // Constants, representing the speed settings of the fan.
    public static final int STOPPED = 0;
    public static final int SLOW    = 1;
    public static final int MEDIUM  = 2;
    public static final int FAST    = 3;

    // Fields, representing the state of the fan.
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (defaults)
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Argument constructor, allowing initialization of all properties.
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters, allowing access to the fan's properties.
    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // Setters, allowing modification of the fan's properties.
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Returns a string representation of the fan's state.
    public String getDescription() {
        if (this.on == true) {
            return "Fan is ON: speed=" + this.speed + ", radius=" + this.radius + ", color=" + this.color;
        } else {
            return "Fan is OFF: radius=" + this.radius + ", color=" + this.color;
        }
    }
}