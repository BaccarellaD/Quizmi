package controllers;

import java.util.ArrayList;

import javafx.scene.layout.Pane;
import models.Quiz;
import views.QuizmiHomePane;

public class QuizmiHomePageController extends ControllerPlugin{
	
	private QuizmiHomePane quizmiHomePane;

	public QuizmiHomePageController(MainController controller) {
		super(controller);
		quizmiHomePane = new QuizmiHomePane();
		updatePane();
	}

	@Override
	public Pane getPane() {
		return quizmiHomePane;
	}
	
	public void updatePane(){
		
	}

}
