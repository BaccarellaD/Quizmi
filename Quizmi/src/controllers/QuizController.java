package controllers;

import javafx.scene.layout.Pane;
import views.QuizPane;

public class QuizController extends ControllerPlugin{
	
	QuizPane quizPane;

	public QuizController(MainController controller) {
		super(controller);
		quizPane = new QuizPane();
		updatePane();
	}

	@Override
	public Pane getPane() {
		return quizPane;
	}
	
	private void updatePane(){
		
	}

}
