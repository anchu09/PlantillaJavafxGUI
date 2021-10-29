package db.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
public class Main extends Application{
	
	
	@Override
	public void start(Stage primaryStage) {
		try {


			Pane root = (Pane)FXMLLoader.load(getClass().getResource("PrimeraPantallaView.fxml"));
			Scene scene = new Scene(root);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setIconified(false);
  
			primaryStage.setScene(scene);

			primaryStage.setResizable(false);
			primaryStage.getIcons().add(new Image("https://image.flaticon.com/icons/png/512/2833/2833315.png"));

			primaryStage.setTitle("Covidist");

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
