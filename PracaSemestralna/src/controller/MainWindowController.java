package controller;


import java.io.IOException;

import controller.Main;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Cell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainWindowController {

	private Main main;
	private Stage primaryStage;
	@FXML Button przycisk;
	@FXML TextField txtUserName;
	@FXML TextField txtPassword;
	@FXML Label wyjasnienie;
	
	
	public void setMain(Main main, Stage primaryStage)
	{
		this.main = main;
		this.primaryStage = primaryStage;
	}
	

	@FXML public void closeMainWindow(){
		primaryStage.close();
		
	}	
	@FXML public void GridClicked(MouseEvent evt){
		
		
		
		
//		int num;
//		double x, y; 
//		int col, row;
//		
//		x = evt.getX();
//		y = evt.getY();
//		
//		col = (int) (x/40.0);
//		row = (int) (y/30.0);
//		
//		num = 3*row+col+1;
		
		System.out.println("wybrana cyfra: ");
		
		
	}
	@FXML public void ButtonClicked() {
		//if (txtUserName.getText().matches("user") && txtPassword.getText().matches("pass"))
		{
			try {
				
				FXMLLoader loader=
					    new FXMLLoader(
						  Main.class.getResource("/view/WyborWindowView.fxml"));
					    AnchorPane wyborPane=loader.load();
					    
					    Stage wyborWindowStage = new Stage();
					    wyborWindowStage.setTitle("Wstêp");
					    wyborWindowStage.initModality(Modality.WINDOW_MODAL);
					    wyborWindowStage.initOwner(primaryStage);
					    
					    wyborWindowStage.setMinWidth(500.0);
					    wyborWindowStage.setMinHeight(500.0);
					    Scene scene=new Scene(wyborPane);
					    wyborWindowStage.setScene(scene);
					    WyborWindowController wyborWindowController=
					    		loader.getController();
					    wyborWindowController.setWyborWindowStage(wyborWindowStage);
					    
					    
					    wyborWindowStage.showAndWait();
				
				} catch (IOException e) {
				  e.printStackTrace();	
				}
		}
	}
	@FXML public void gridClicked(MouseEvent evt){
		int num;
		double x, y; 
		int col, row;
		
		x = evt.getX();
		y = evt.getY();
		
		col = (int) (x/40.0);
		row = (int) (y/30.0);
		
		num = 3*row+col+1;
		
		System.out.println("wybrana cyfra: "+num);
		
		
	}}
	

