package controllers;

import java.util.ArrayList;

import fileControllers.QuizExporter;
import fileControllers.QuizImporter;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import models.Quiz;
import quizmeMain.LaunchWindow;

public class MainController {
	
	private ControllerPlugin plugin;
	
	private ControllerPlugin homePageController = new QuizmiHomePageController(this);
	private ControllerPlugin quizController = new QuizController(this);
	private ControllerPlugin createController = new CreateQuizController(this);
	
	public ArrayList<Quiz> quizzes;
	public QuizImporter quizImporter;
	public QuizExporter quizExporter;
	
	
	public MainController(){
		
		quizzes = new ArrayList<>();
		quizImporter = new QuizImporter();
		quizExporter = new QuizExporter();
		
		importQuizzes();
		
		try {
			setWindow("home");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void setWindow(String pluginName) throws ClassNotFoundException{
		
		switch(pluginName){
		case "home": 
			plugin = homePageController;
			replacePane(homePageController.getPane());
			break;
		case "quiz": 
			plugin = quizController;
			replacePane(quizController.getPane());
			break;
		case "create": 
			plugin = createController;
			replacePane(createController.getPane());
			break;
		default:
			System.out.println( pluginName + ": is not a supported plugin type");
			throw new ClassNotFoundException();
		}
	}
	
	private void replacePane(Pane newPane){
		LaunchWindow.BASE_PANE.getChildren().addAll(newPane);
		LaunchWindow.BASE_PANE.setAlignment(newPane, Pos.CENTER);
	}
	
	public void importQuizzes(){
		quizImporter.importQuizzes();
	}
	
	public void exportQuizzes(ArrayList<Quiz> quizzes){
		quizExporter.exportQuizzes(quizzes);
	}
	
}
