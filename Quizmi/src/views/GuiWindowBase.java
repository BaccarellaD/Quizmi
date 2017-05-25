package views;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GuiWindowBase extends Scene{

	private static Pane pluginPane = new Pane();
	
	public GuiWindowBase(Parent root, double width, double height) {
		super(pluginPane, width, height);
		
	}
    
    public void changePane(Pane pane){
    	System.out.println("Changing pane");
    	pluginPane = pane;
    }

}
