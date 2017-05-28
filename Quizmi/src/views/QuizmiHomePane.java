package views;

import java.util.List;

import com.sun.prism.paint.Color;

import javafx.embed.swing.JFXPanel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import models.Quiz;
import quizmeMain.LaunchWindow;

public class QuizmiHomePane extends StackPane{
	
	final JFXPanel fxPanel = new JFXPanel();
	
	public GridPane gp;
	public Button updateButton;
	public Button newQuizButton;
	public Button quizButton;
	public Button deleteButton;
	public ComboBox<Quiz> quizDropDown;
	
	
	public QuizmiHomePane(){
		initializeButtons();
		initializeGridPane();
		initializeThis();
	}
	
	private void initializeButtons(){
		
		quizDropDown = new ComboBox<>();
		
		updateButton = new Button("Update");
		newQuizButton = new Button("New");
		quizButton = new Button("Quiz Me!");
		deleteButton = new Button("Delete");
		
		quizDropDown.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		updateButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		newQuizButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		quizButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		deleteButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		deleteButton.setStyle("-fx-base: #edc2c2;");
		
	}
	
	public void updateDropDown(List<Quiz> quizzes){
		for(Quiz q: quizzes){
			quizDropDown.getItems().add(q);
		}
	}
	
	private void initializeGridPane(){
		gp = new GridPane();
		gp.add(quizDropDown, 0, 0);
		gp.add(updateButton, 0, 1);
		gp.add(newQuizButton, 0, 2);
		gp.add(deleteButton, 0, 3);
		gp.add(quizButton, 1, 0);
		gp.setPadding(new Insets(20,20,20,20));
		gp.setHgap(15);
		gp.setVgap(10);
		
		gp.setAlignment(Pos.TOP_CENTER);
		
		ColumnConstraints column1 = new ColumnConstraints(150);
	    ColumnConstraints column2 = new ColumnConstraints(150);
	    column1.setHgrow(Priority.ALWAYS);
	    column2.setHgrow(Priority.ALWAYS);
	    gp.getColumnConstraints().addAll(column1, column2);
	    
	    gp.setStyle("-fx-background-color: #b1d1e0;");
	}
	
	private void initializeThis(){
		//this.setPadding(new Insets(20,20,20,20));
		this.setStyle("-fx-background-color: #b1d1e0;");
		this.getChildren().addAll(gp);
	}

}
