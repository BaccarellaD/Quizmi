package controllers;

import javafx.scene.layout.Pane;
import models.LineSize;
import views.CreateQuizPane;

public class CreateQuizController extends ControllerPlugin{
	
	CreateQuizPane createQuizPane; 
	
	public CreateQuizController(MainController controller){
		super(controller);
		createQuizPane = new CreateQuizPane();
		setUpButtons();
		setUpMenus();
		updatePane();
	}

	@Override
	public Pane getPane() {
		return createQuizPane;
	}
	

	private void setUpButtons() {
		createQuizPane.addButton.setOnAction(e ->{
			createQuizPane.addQA();
		});
		
		createQuizPane.removeButton.setOnAction(e ->{
			createQuizPane.removeQA();
		});
		
	}
	
	private void setUpMenus(){
		createQuizPane.smallSizeMenuItem.setOnAction(e ->{
			createQuizPane.changeInputSize(LineSize.SMALL_SIZE);
		});
		createQuizPane.mediumSizeMenuItem.setOnAction(e ->{
			createQuizPane.changeInputSize(LineSize.MEDIUM_SIZE);
		});
		createQuizPane.largeSizeMenuItem.setOnAction(e ->{
			createQuizPane.changeInputSize(LineSize.LARGE_SIZE);
		});
	}

	
	private void updatePane(){
		
	}
}
