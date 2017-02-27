package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Test extends Application {

	ContextMenuExample contextMenu = new ContextMenuExample();

	@Override
	public void start(Stage primaryStage) {
		try {

			// Root
			BorderPane root = new BorderPane();
			root.setOnMouseClicked(cl -> contextMenu.show(primaryStage));

			// Scene
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// Stage
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
