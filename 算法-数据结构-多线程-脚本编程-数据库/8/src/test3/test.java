package test3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class test extends Application
{
	public void start(Stage primaryStage)
	{
		Scene scene=new Scene(new Button("helloword"),200,400);
		primaryStage.setTitle("pubaojain");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage stage=new Stage();
		stage.setTitle("xubo");
		stage.setScene(new Scene(new Button("nihao"),300,100));
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}

