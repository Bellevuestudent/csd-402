/*
 * Name: Patrice Moracchini
 * CSD 402
 * Module 6.2
 * Assignment: Fan Class
 *
 * This program defines a Fan class with speed, on/off state, radius, and color.
 * The main method tests the Fan class by creating two Fan objects and printing
 * their states before and after changes.
 */

// Main class to test the Fan class.
public class Moracchini_Mod_6_2_CSD402 {
   
    // Main method, entry point of the program.
    public static void main(String[] args) {

        // Test code: create two Fan objects and display results.
        // Fan 1: default constructor.
        Fan fan1 = new Fan();           // Create fan1 using the default constructor.
        System.out.println("Fan 1 (default settings):");      // Print a label for fan1.
        System.out.println(fan1);           // Print fan1 (calls toString()).

        // Use setters to change fan1 properties
        fan1.setOn(true);                // Turn the fan ON.
        fan1.setSpeed(Fan.MEDIUM);          // Set speed to MEDIUM.
        fan1.setRadius(8.0);         // Set radius to 8.0.
        fan1.setColor("blue");        // Set color to blue.

        System.out.println("\nFan 1 (after changes):");      // Print a label for the updated fan1.
        System.out.println(fan1);                                  // Print updated fan1 (calls toString()).

        // Fan 2: argument constructor.
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "yellow");  // Create fan2 using the argument constructor.
        System.out.println("\nFan 2 (custom settings):");   // Print a label for fan2.
        System.out.println(fan2);       // Print fan2 (calls toString()).

        // Turn fan2 OFF and display again.
        fan2.setOn(false);              // Turn the fan OFF.
        System.out.println("\nFan 2 (after turning off):"); // Print a label for the updated fan2.
        System.out.println(fan2);           // Print updated fan2 (calls toString()).
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
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
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
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
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

    // toString method, returns a string representation of the fan's state.
    public String toString() {
        if (on == true) {
            return "Fan is ON: speed=" + speed + ", radius=" + radius + ", color=" + color;
        } else {
            return "Fan is OFF: radius=" + radius + ", color=" + color;
        }
    }
}