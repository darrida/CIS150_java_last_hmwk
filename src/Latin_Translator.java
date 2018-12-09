import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Latin_Translator extends Application {
	
	// Field for the Label control.
	private TextField kiloTextField;
	private Label resultLabel;
	
	public static void main(String[] args) {
		// Launch application
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		// Create Label control.
		Label promptLabel = new Label("Enter distance in kilometers:");
		
		// Create a TextField for input.
		kiloTextField = new TextField();
		
		// Create a Button control.
		Button myButton = new Button("Convert");
		
		// Register the vent handler.
		myButton.setOnAction(new ButtonClickHandler());
		
		// Create an empty Label to display the result.
		resultLabel = new Label();
		
		// Put the myLabel and the kiloTextField in an HBox
		HBox hbox = new HBox(10, promptLabel, kiloTextField);
		
		// Put the Label and Button in a VBox with 10 pixels of spacing.
		VBox vbox = new VBox(10, hbox, myButton, resultLabel);
		
		// Set HBox's alignment to center.
		vbox.setAlignment(Pos.CENTER);
		
		// Set the VBox's padding to 10 pixels
		vbox.setPadding(new Insets(10));
		
		// Create Scene with the HBox as it's root note.
		Scene scene = new Scene(vbox);
		
		// Add Scene to the Stage.
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Kilometer Converter");
		
		primaryStage.show();
	}
	
	
	
	class ButtonClickHandler implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) {
			
			// Get the kilometers
			double kilometers = Double.parseDouble(kiloTextField.getText());
			
			double miles = kilometers * 0.6214;
			
			resultLabel.setText(String.format("%,.2f miles", miles));
		}
	}
}


/*
 * Look at the following list of Latin words and their meanings:
 * sinister = left
 * dexter = right
 * medium = center
 * 
 * Create a JavaFX application that translates the Latin words to English.
 * The form should have three Buttons, one for each Latin word.
 * When the user clicks a Button, the application should display the
 * English translation in a Label.
 */