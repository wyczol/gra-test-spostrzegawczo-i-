package controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Ranking;

public class WynikWindowController {

	private final ObservableList<Ranking> personList = FXCollections.observableArrayList();
	
	private Stage wynikWindowStage;
	
	//private txtUserName.getClassMainWindowController;

@FXML private TableView<Ranking> tableView;
	
	@FXML private TableColumn<Ranking, Integer> rankingColumn;
	@FXML private TableColumn<Ranking, String> nickColumn;
	@FXML private TableColumn<Ranking, Integer> wynikColumn;
	@FXML private TableColumn<Ranking, Integer> liczbaTestowColumn;
	@FXML private TableColumn<Ranking, Integer> timeColumn;
	@FXML private TableColumn<Ranking, Integer> bledyColumn;
	@FXML private TableColumn<Ranking, Integer> dataTestuColumn;
	
	
	
	public void setWynikWindowStage(Stage wynikWindowStage){
		this.wynikWindowStage = wynikWindowStage;
		tableView.setItems(personList);
	}
	

	
	
	@FXML private void initialize() {
	
		rankingColumn.setCellValueFactory(
				new PropertyValueFactory<Ranking,Integer>("nrWRankingu"));
		nickColumn.setCellValueFactory(
				new PropertyValueFactory<Ranking,String>("nick"));
		wynikColumn.setCellValueFactory(
				new PropertyValueFactory<Ranking,Integer>("result"));
		liczbaTestowColumn.setCellValueFactory(
				new PropertyValueFactory<Ranking,Integer>("liczbaTestow"));
		timeColumn.setCellValueFactory(
				new PropertyValueFactory<Ranking,Integer>("time"));
		bledyColumn.setCellValueFactory(
				new PropertyValueFactory<Ranking,Integer>("liczbaBledow"));
		dataTestuColumn.setCellValueFactory(
				new PropertyValueFactory<Ranking,Integer>("data"));
		
	//	personList.add(new Ranking(txtUserName.getClass.getText(), )))
				
//				tableView.getSelectionModel().selectedItemProperty().addListener(
//						
//						(ov, oldVal, newVal) -> {
//							System.out.println(newVal.getFirstName() + " , " + newVal.getLastName());
//							fieldImie.setText(newVal.getFirstName());
//							fieldNazwisko.setText(newVal.getLastName());
//							fieldNrPokoju.setText(newVal.getRoomNumber());
//							fieldRozp.setText(newVal.getGodzRozpTxt());
//							fieldZak.setText(newVal.getGodzZakTxt());
						}
						
						
					//	);			
}
	
	
	
	

