package controllers;

import controllers.MainController;
import javafx.scene.layout.Pane;

public abstract class ControllerPlugin {
	
	protected MainController mc;
	
	public ControllerPlugin(MainController controller){
		this.mc = controller;
	}
	
	public abstract Pane getPane();

}
