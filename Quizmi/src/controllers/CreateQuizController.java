package controllers;

import javafx.scene.layout.Pane;
import views.CreateQuizPane;

public class CreateQuizController extends ControllerPlugin{
	
	CreateQuizPane createQuizPane; 
	
	public CreateQuizController(MainController controller){
		super(controller);
		createQuizPane = new CreateQuizPane();
		updatePane();
	}

	@Override
	public Pane getPane() {
		return createQuizPane;
	}
	
	private void updatePane(){
		
	}
}
