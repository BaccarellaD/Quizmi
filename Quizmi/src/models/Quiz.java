package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Quiz implements Serializable{

	private String name;
	private ArrayList<QCouple> questionAnswers;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<QCouple> getQuestionAnswers() {
		return questionAnswers;
	}

	public void setQuestionAnswers(ArrayList<QCouple> questionAnswers) {
		this.questionAnswers = questionAnswers;
	}

	@Override
	public String toString(){
		return name;
	}
}
