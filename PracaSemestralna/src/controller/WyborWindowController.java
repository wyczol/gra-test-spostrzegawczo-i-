package controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WyborWindowController {

	private Stage wyborWindowStage;

	public void setWyborWindowStage(Stage wyborWindowStage){
		this.wyborWindowStage = wyborWindowStage;
	}
	
	
	public void testyClicked() {
		try {
			 FXMLLoader loader=
					    new FXMLLoader(
						  Main.class.getResource("/view/IntroductionWindowView.fxml"));
					    AnchorPane introductionPane=loader.load();
					    
					    Stage introductionWindowStage = new Stage();
					    introductionWindowStage.setTitle("Wstêp");
					    introductionWindowStage.initModality(Modality.WINDOW_MODAL);
					    introductionWindowStage.initOwner(wyborWindowStage);
					    
					    introductionWindowStage.setMinWidth(500.0);
					    introductionWindowStage.setMinHeight(500.0);
					    Scene scene=new Scene(introductionPane);
					    introductionWindowStage.setScene(scene);
					    IntroductionWindowController introductionWindowController=
					    		loader.getController();
					    introductionWindowController.setIntroductionWindowStage(introductionWindowStage);
					    
					    
					    
					    
					    introductionWindowStage.showAndWait();
	
	} catch (IOException e) {
		  e.printStackTrace();}	
		}
		
	public void wynik() {
		try {
				 FXMLLoader loader=
						    new FXMLLoader(
							  Main.class.getResource("/view/WynikWindowView.fxml"));
						    AnchorPane wynikPane=loader.load();
						    
						    Stage wynikWindowStage = new Stage();
						    wynikWindowStage.setTitle("Wstêp");
						    wynikWindowStage.initModality(Modality.WINDOW_MODAL);
						    wynikWindowStage.initOwner(wyborWindowStage);
						    
						    wynikWindowStage.setMinWidth(500.0);
						    wynikWindowStage.setMinHeight(500.0);
						    Scene scene=new Scene(wynikPane);
						    wynikWindowStage.setScene(scene);
						    WynikWindowController wynikWindowController=
						    		loader.getController();
						    wynikWindowController.setWynikWindowStage(wynikWindowStage);
						    
						    
						    wynikWindowStage.showAndWait();
		
		} catch (IOException e) {
			  e.printStackTrace();	
			}
	
}
}

