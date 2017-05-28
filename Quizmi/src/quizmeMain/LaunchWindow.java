package quizmeMain;

import controllers.MainController;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LaunchWindow extends Application{
	
	public static StackPane BASE_PANE;
	public static Scene SCENE;
	
	public static void main(String[] args) {
		//MainController mc = new MainController(args);
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		BASE_PANE = new StackPane();
		stage.setTitle("Quizmi!");
		SCENE = new Scene(BASE_PANE, 700, 650);
		stage.setScene(SCENE);
		stage.show();
		new MainController();
	}

}
