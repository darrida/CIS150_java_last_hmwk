import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Latin_Translator extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		Button centerButton = new Button("Medium");
		Button leftButton = new Button("Sinister");
		Button rightButton = new Button("Dexter");
		
		Label centerResult = new Label();
		Label leftResult = new Label();
		Label rightResult = new Label();
		Label buttonTitle = new Label("LATIN");
		Label resultsTitle = new Label("ENGLISH");
		
		centerButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				centerResult.setText("'Center'");
			}
		});
		
		leftButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				leftResult.setText("'Left'");
			}
		});
		
		rightButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				rightResult.setText("'Right'");
			}
		});
		
		centerButton.setMaxWidth(100);
		leftButton.setMaxWidth(100);
		rightButton.setMaxWidth(100);
		centerResult.setMaxWidth(100);
		leftResult.setMaxWidth(100);
		rightResult.setMaxWidth(100);
		
		GridPane gridpane = new GridPane();

		gridpane.setVgap(10);
		gridpane.setHgap(65);
		gridpane.setPadding(new Insets(10));
		gridpane.setAlignment(Pos.BASELINE_CENTER);
		
		gridpane.add(buttonTitle, 0, 0);
		gridpane.add(resultsTitle, 1, 0);
		gridpane.add(leftButton, 0, 1);
		gridpane.add(leftResult, 1, 1);
		gridpane.add(centerButton, 0, 2);
		gridpane.add(centerResult, 1, 2);
		gridpane.add(rightButton, 0, 3);
		gridpane.add(rightResult, 1, 3);

		Scene scene = new Scene(gridpane, 300, 180);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Translator");
		primaryStage.show();
	}
}
