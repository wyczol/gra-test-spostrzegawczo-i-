package controller;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class IntroductionWindowController {
	private Stage introductionWindowStage;
	
	private int totalCountGood;
	private int totalCountBad;

	
	private static final Integer STARTTIME = 0;
	private Timeline timeline;
	private IntegerProperty timeSeconds = new SimpleIntegerProperty(STARTTIME);
	
	
	
	@FXML Label labelCzas, labelBledy, labelWynik, czas;
	
	
	
	@FXML TextField t1;
	@FXML TextField t2;
	@FXML TextField t3;
	@FXML TextField t4;
	@FXML TextField t5;
	@FXML TextField t6;
	@FXML TextField t7;
	@FXML TextField t8;
	@FXML TextField t9;
	
	@FXML Button zakonczButton;
	@FXML Button nastepnyButton;
	
	@FXML Label x1,x2,x3,x4,x5,x6, x7,x8, x9;
	@FXML Label y1,y2,y3,y4,y5,y6, y7,y8, y9;
	
	public void setIntroductionWindowStage(Stage introductionWindowStage){
		this.introductionWindowStage = introductionWindowStage;
		
		czas.textProperty().bind(timeSeconds.asString());
		timeSeconds.set(STARTTIME);
		timeline = new Timeline();
		timeline.getKeyFrames().add(
				new KeyFrame(Duration.seconds(STARTTIME+360),
				new KeyValue(timeSeconds, 360)));
				timeline.play();
		
	}
	
//	public void showX(double x, double y) {
//		label1.setVisible(true);
//		
//		label1.setLayoutX(x);
//		label1.setLayoutY(y);
//	}
//	@FXML public void paneMouseClicked(MouseEvent evt){
//	
//		showX(evt.getX(),evt.getY());
//		}
	
	@FXML public void zakoncz() {
		Platform.exit();
		
	}
	@FXML public void nastepny(MouseEvent evt) {
		
		compareFields();
		clearT();
		generateNextTest();
	}
		
		
	
	
	
	
		private void clearT(){
			
		t1.clear();
		t2.clear();
		t3.clear();
		t4.clear();
		t5.clear();
		t6.clear();
		t7.clear();
		t8.clear();
		t9.clear();
		
	}
		

		
		private void compareFields() {
			int countGood = 0;
			int countBad = 0;
			
			String s = t1.getText();
			String s1= t1.getText().toUpperCase();
			
			if (x1.getText().equals(y1.getText()) && x1.getText().equals("X")) {
				if(x1.getText().toUpperCase().equals("X")) {
					countGood++;
			}
				else countBad++;
 	
	}
			else{
				if(t1.getText().toUpperCase().equals("X")){
					countBad++;
				}
			}

			if (x2.getText().equals(y2.getText()) && x2.getText().equals("X")) {
				if(t2.getText().toUpperCase().equals(  "X")){
					countGood++;
				}
				else{
					countBad++;
				}
			}
			else{
				if(t2.getText().toUpperCase().equals(  "X")){
					countBad++;
				}
			}

			if (x3.getText().equals(y3.getText()) && x3.getText().equals("X")) {
				if(t3.getText().toUpperCase().equals(  "X")){
					countGood++;
				}
				else{
					countBad++;
				}
			}
			else{
				if(t3.getText().toUpperCase().equals(  "X")){
					countBad++;
				}
			}

			if (x4.getText().equals(y4.getText()) && x4.getText().equals("X")) {
				if(t4.getText().toUpperCase().equals(  "X")){
					countGood++;
				}
				else{
					countBad++;
				}
			}
			else{
				if(t4.getText().toUpperCase().equals(  "X")){
					countBad++;
				}
			}

			if (x5.getText().equals(y5.getText()) && x5.getText().equals("X")) {
				if(t5.getText().toUpperCase().equals(  "X")){
					countGood++;
				}
				else{
					countBad++;
				}
			}
			else{
				if(t5.getText().toUpperCase().equals(  "X")){
					countBad++;
				}
			}

			if (x6.getText().equals(y6.getText()) && x6.getText().equals("X")) {
				if(t6.getText().toUpperCase().equals(  "X")){
					countGood++;
				}
				else{
					countBad++;
				}
			}
			else{
				if(t6.getText().toUpperCase().equals(  "X")){
					countBad++;
				}
			}

			if (x7.getText().equals(y7.getText()) && x7.getText().equals("X")) {
				if(t7.getText().toUpperCase().equals(  "X")){
					countGood++;
				}
				else{
					countBad++;
				}
			}
			else{
				if(t7.getText().toUpperCase().equals(  "X")){
					countBad++;
				}
			}

			if (x8.getText().equals(y8.getText()) && x8.getText().equals("X")) {
				if(t8.getText().toUpperCase().equals(  "X")){
					countGood++;
				}
				else{
					countBad++;
				}
			}
			else{
				if(t8.getText().toUpperCase().equals(  "X")){
					countBad++;
				}
			}

			if (x9.getText().equals(y9.getText()) && x9.getText().equals("X")) {
				if(t9.getText().toUpperCase().equals(  "X")){
					countGood++;
				}
				else{
					countBad++;
				}
			}
			else{
				if(t9.getText().toUpperCase().equals(  "X")){
					countBad++;
				}
			}

			totalCountGood += countGood;
			totalCountBad  += countBad;
			labelWynik.setText("Wynik: "+ totalCountGood );
			labelBledy.setText("Bledy: "+ totalCountBad);
		}


			private void generateNextTest(){
			Random r = new Random();
			boolean b;

			b = r.nextBoolean();
			if(b==true) {
				x1.setText("X");
				y4.setText("X");
			}
			else {
				x1.setText("");
				y4.setText("");
			}

			b = r.nextBoolean();
			if(b==true) {
				x2.setText("X");
				y5.setText("X");
			}
			else {
				x2.setText("");
				y5.setText("");
			}

			b = r.nextBoolean();
			if(b==true) {
				x3.setText("X");
				y6.setText("X");
			}
			else {
				x3.setText("");
				y6.setText("");
			}

			b = r.nextBoolean();
			if(b==true) {
				x4.setText("X");
				y7.setText("X");
			}
			else {
				x4.setText("");
				y7.setText("");
			}

			b = r.nextBoolean();
			if(b==true) {
				x5.setText("X");
				y8.setText("X");
			}
			else {
				x5.setText("");
				y8.setText("");
			}

			b = r.nextBoolean();
			if(b==true) {
				x6.setText("X");
				y9.setText("X");
			}
			else {
				x6.setText("");
				y9.setText("");
			}
			b = r.nextBoolean();
			if(b==true) {
				x7.setText("X");
				y1.setText("X");
			}
			else {
				x7.setText("");
				y1.setText("");
			}

			b = r.nextBoolean();
			if(b==true) {
				x8.setText("X");
				y2.setText("X");
			}
			else {
				x8.setText("");
				y2.setText("");
			}

			b = r.nextBoolean();
			if(b==true) {
				x9.setText("X");
				y3.setText("X");
			}
			else {
				x9.setText("");
				y3.setText("");
			}
		}

			


}

	