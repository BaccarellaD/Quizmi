package views;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class CreateQuizPane extends Pane{
	
	public GridPane gp;
	
	public Label startText;
	public Label endText;
	public Label questionText;
	public Label answerText;
	
	public CreateQuizPane(){
		initializeLabels();
	}
	
	private void initializeLabels(){
		startText = new Label("Start Text");
		endText = new Label("End Text");
		questionText = new Label("Question");
		answerText = new Label("Answer");
	}

}
