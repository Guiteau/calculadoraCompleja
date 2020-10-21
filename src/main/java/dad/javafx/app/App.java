package dad.javafx.app;

import dad.javafx.controller.ControllerCalculadora;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private ControllerCalculadora controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		controller = new ControllerCalculadora();
		
		Scene escena = new Scene(controller.getVista(), 320, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Calculadora Compleja");
		primaryStage.show(); 

	}

	public static void main(String[] args) {
		launch(args);
	}

}
