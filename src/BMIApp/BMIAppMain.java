package BMIApp;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class BMIAppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/BMI.fxml"));
		
		Scene scene = new Scene(root, 950, 470);
		
		scene.getStylesheets().add("/fxml/style/BMI.css");
		
		primaryStage.setScene(scene);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
