package controllers;


import javafx.scene.layout.Pane;
import views.QuizmiHomePane;

public class QuizmiHomePageController extends ControllerPlugin{
	
	private QuizmiHomePane quizmiHomePane;

	public QuizmiHomePageController(MainController controller) {
		super(controller);
		quizmiHomePane = new QuizmiHomePane();
		//updatePane();
	}

	@Override
	public Pane getPane() {
		return quizmiHomePane;
	}
	
	public void updateComboBox(){
		quizmiHomePane.quizDropDown.getItems().clear(); //removes all children
		quizmiHomePane.quizDropDown.getItems().addAll(super.mc.quizzes); //adds all quizzes to combo-box
	}

}
