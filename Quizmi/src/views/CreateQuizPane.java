package views;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import models.LineSize;

public class CreateQuizPane extends VBox{
	
	public GridPane gp;
	
	public Label quizTitleText;
	public Label startText;
	public Label endText;
	public Label questionText;
	public Label answerText;
	
	public MenuBar  menuBar;
	public Menu		backMenuItem;
	public Menu		saveMenuItem;
	public Menu		changeSizeMenu;
	public MenuItem	smallSizeMenuItem;
	public MenuItem	mediumSizeMenuItem;
	public MenuItem	largeSizeMenuItem;
	
	public Button addButton;
	public Button removeButton;
	
	public VBox 		leftButtonVBox;
	public GridPane 	topGridPane;
	public GridPane 	bottomGridPane;
	public VBox			rightInnerVBox;
	public ScrollPane	rightScrollPane;
	public HBox 		bodyHbox;
	
	public TextArea startOfQTextArea;
	public TextArea endOfQTextArea;
	
	public TextField titleTextField;
	
	public ArrayList<TextArea> questions;
	public ArrayList<TextArea> answers;
	
	public int numQA;
	private LineSize lineSize;
	
	
	public CreateQuizPane(){
		
		lineSize = LineSize.MEDIUM_SIZE;
		
		numQA = 0;
		
		questions 	= new ArrayList<>();
		answers		= new ArrayList<>();
		
		initializeLabels();
		initializeButtons();
		
		initializeLeftButtonBox();
		initializeTopGridPane();
		initializeBottomGridPane();
		initializeRightScrollPane();
		initializeBodyHBox();
		
		initializeTopMenu();
		initializeThis();
	}


	private void initializeLabels(){
		quizTitleText	= new Label("Title:");
		startText 		= new Label("Start Text:");
		endText 		= new Label("End Text:");
		questionText 	= new Label("Question");
		answerText 		= new Label("Answer");
		
		quizTitleText.setFont	(Font.font ("Verdana", 20));
		startText.setFont		(Font.font ("Verdana", 20));
		endText.setFont			(Font.font ("Verdana", 20));
		questionText.setFont	(Font.font ("Verdana", 20));
		answerText.setFont		(Font.font ("Verdana", 20));
		
		final double fontMinWidth1 = 150;
		
		quizTitleText.setMinWidth(fontMinWidth1); //doesn't allow text to shrink
		startText.setMinWidth(fontMinWidth1);
		endText.setMinWidth(fontMinWidth1);
	}
	
	private void initializeButtons() {
		addButton 		= new Button("+");
		removeButton 	= new Button("-");
		
		final double buttonWidth 	= 30;
		final double buttonHeight	= 30;
		
		addButton.setPrefWidth(buttonWidth);
		removeButton.setPrefWidth(buttonWidth);
		
		addButton.setMinWidth(buttonWidth);
		removeButton.setMinWidth(buttonWidth);
		
		addButton.setPrefHeight(buttonHeight);
		removeButton.setPrefHeight(buttonHeight);
		
		addButton.setStyle		("-fx-base: #a8f7b1;");
		removeButton.setStyle	("-fx-base: #f78585;");
	}
	
	private void initializeLeftButtonBox() {
		
		leftButtonVBox = new VBox();
		leftButtonVBox.getChildren().addAll(addButton, removeButton);
		
		leftButtonVBox.setPadding(new Insets(10));
		leftButtonVBox.setSpacing(10);
		
		leftButtonVBox.setStyle("-fx-background-color: #dbdbdb;");
	}
	
	private void initializeBodyHBox() {
		bodyHbox = new HBox();
		bodyHbox.getChildren().addAll(leftButtonVBox, rightScrollPane);
		bodyHbox.setHgrow(rightScrollPane, Priority.ALWAYS);
	}

	private void initializeTopGridPane() {
		topGridPane = new GridPane();
		
		topGridPane.setHgap(10);
		topGridPane.setVgap(10);
		topGridPane.setPadding(new Insets(20));
		
		titleTextField		= new TextField();
		startOfQTextArea	= new TextArea();
		endOfQTextArea 		= new TextArea();
		
		titleTextField.setFont		(Font.font("Verdana", 14));
		startOfQTextArea.setFont	(Font.font("Verdana", 14));
		endOfQTextArea.setFont		(Font.font("Verdana", 14));
		
		startOfQTextArea.setPrefRowCount(2);
		endOfQTextArea.setPrefRowCount(2);
		
		topGridPane.add(quizTitleText, 		0, 0);
		topGridPane.add(titleTextField,		1, 0);
		topGridPane.add(startText, 			0, 1);
		topGridPane.add(startOfQTextArea, 	1, 1);
		topGridPane.add(endText, 			0, 2);
		topGridPane.add(endOfQTextArea, 	1, 2);
	}

	private void initializeBottomGridPane() {
		
		bottomGridPane = new GridPane();
		
		bottomGridPane.setPadding(new Insets(20));
		bottomGridPane.setHgap(10);
		bottomGridPane.setVgap(10);
		
		bottomGridPane.add(questionText, 	0, 0);
		bottomGridPane.add(answerText, 		1, 0);
		
		addQA(); //add 4 q/a areas
		addQA();
		addQA();
		addQA();
		
		ColumnConstraints column1 = new ColumnConstraints(300);
	    ColumnConstraints column2 = new ColumnConstraints(300);
	    column1.setHgrow(Priority.ALWAYS);
	    column2.setHgrow(Priority.ALWAYS);
	    bottomGridPane.getColumnConstraints().addAll(column1, column2);
		
	}
	

	private void initializeRightScrollPane() {
		
		rightInnerVBox = new VBox();
		rightInnerVBox.getChildren().addAll(topGridPane, bottomGridPane);
		
		rightScrollPane = new ScrollPane();
		rightScrollPane.setContent(rightInnerVBox);
		
		rightScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
		rightScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
		
		rightScrollPane.setFitToWidth(true);
		
	}

	
	private void initializeTopMenu(){
		menuBar 			= new MenuBar();
		backMenuItem 		= new Menu("Back");
		saveMenuItem 		= new Menu("Save");
		changeSizeMenu 		= new Menu("Input Size");
		smallSizeMenuItem 	= new MenuItem("Small");
		mediumSizeMenuItem	= new MenuItem("Medium");
		largeSizeMenuItem	= new MenuItem("Large");
		
		changeSizeMenu.getItems().addAll(smallSizeMenuItem, mediumSizeMenuItem, largeSizeMenuItem);
		menuBar.getMenus().addAll(backMenuItem, saveMenuItem, changeSizeMenu);
	}
	
	private void initializeThis(){
		this.getChildren().addAll(menuBar, bodyHbox);
		this.setVgrow(bodyHbox, Priority.ALWAYS);
	}
	
	public void addQA(){
		TextArea questionArea 	= new TextArea();
		TextArea answerArea		= new TextArea();
		
		questionArea.setPrefRowCount(lineSize.numLines()); //sets the number of lines in the text area that is being added
		answerArea	.setPrefRowCount(lineSize.numLines());
		
		questionArea.setFont(Font.font ("Verdana", 14));
		answerArea.setFont	(Font.font ("Verdana", 14));
		
		questionArea.setWrapText(true);
		answerArea	.setWrapText(true);
		
		questions.add	(questionArea);
		answers.add		(answerArea);
		
		++numQA; //add one to the number of questions and answers
		bottomGridPane.add(questionArea, 	0, numQA);
		bottomGridPane.add(answerArea, 		1, numQA);
	}
	
	public void removeQA(){
		bottomGridPane.getChildren().remove(questions.get(questions.size()-1)); //gets last element from questions and removes it from the gridpane
		bottomGridPane.getChildren().remove(answers.get(answers.size()-1)); //gets last element from answers and removes it from the gridpane
		
		questions.remove(questions.size()-1); //removes last index from both lists
		answers.remove	(answers.size()-1);
		
		numQA--; //decrement number of QA
	}
	
	public void changeInputSize(LineSize newLineSize){
		
		if(newLineSize == lineSize){
			System.out.println("Same size");
			return;
		}
		
		lineSize = newLineSize;
		
		for(TextArea area: questions){
			area.setPrefRowCount(newLineSize.numLines());
		}
		for(TextArea area: answers){
			area.setPrefRowCount(newLineSize.numLines());
		}
	}

}
