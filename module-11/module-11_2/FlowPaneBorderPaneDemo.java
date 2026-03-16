//Patrice Moracchini
// Module 11.2
// This program demonstrates the use of FlowPane and BorderPane layouts in JavaFX.

// import necessary JavaFX classes
import javafx.application.Application;      // Base class for JavaFX applications
import javafx.geometry.Insets;              // Class for defining padding and spacing       
import javafx.scene.Scene;                  // Class for the scene graph
import javafx.scene.control.Button;         // Class for creating buttons
import javafx.scene.control.Label;          //  Class for creating labels
import javafx.scene.layout.BorderPane;      // Class for BorderPane layout
import javafx.scene.layout.FlowPane;        // Class for FlowPane layout
import javafx.stage.Stage;                  // Class for the main application window

// Main class that extends Application to create a JavaFX application
public class FlowPaneBorderPaneDemo extends Application {       

    @Override               // Override the start method to set up the user interface
    public void start(Stage stage) {    // Start the JavaFX application window

        // FlowPane example
        FlowPane flowPane = new FlowPane();        
        flowPane.setHgap(10);                   // setter for horizontal gap
        flowPane.setVgap(10);                   // setter for vertical gap
        flowPane.setPadding(new Insets(10));    // setter for padding

        flowPane.getChildren().addAll(         // using getChildren() method to add buttons to the FlowPane         
            new Button("Two"),                  // buttons added to demonstrate wrapping when space is limited
            new Button("Three"),
            new Button("Four"),
            new Button("Five"),
            new Button("Six"),
            new Button("Seven"),
            new Button("Eight")
        );

        // BorderPane example
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));       // setter for padding

        borderPane.setTop(new Label("Top"));        // place a label in the top region of the BorderPane
        borderPane.setLeft(new Label("Left"));      // place a label in the left region of the BorderPane
        borderPane.setCenter(flowPane);             // shows that FlowPane is also a node that can be added to the BorderPane
        borderPane.setBottom(new Label("Bottom"));  // no label in the right region to demonstrate that it can be left empty

        // Create a scene with the BorderPane as the root node and set its size
        Scene scene = new Scene(borderPane, 300, 200);  


        // Set the title of the stage, add the scene to the stage, and display the stage
        stage.setTitle("Simple FlowPane and BorderPane");
        stage.setScene(scene);
        stage.show();
    }
        // Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args);  
    }
}