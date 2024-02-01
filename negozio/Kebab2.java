package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Kebab2 extends Application {
	ComboBox<String> cCarne = new ComboBox<>();
	ComboBox<String> cContorno = new ComboBox<>();
	ComboBox<String> cSalse = new ComboBox<>();
	
	 
		Label eTotale = new Label();
	public void start(Stage finestra) {

		Label eTotale = new Label();
		Label lCarne = new Label("carne");
		Label lContorno = new Label("contorno");
		Label lSalse = new Label("salse");
		 cCarne.getItems().add("pollo");
	     cCarne.getItems().add("maiale");
	     cCarne.getItems().add("vitello");
	     cCarne.getItems().add("tofu");
	     
	     cContorno.getItems().add("insalata");
	     cContorno.getItems().add("cipolla");
	     cContorno.getItems().add("pomodoro");
	     cContorno.getItems().add("carota");
	     
	     cSalse.getItems().add("mayonese");
	     cSalse.getItems().add("piccante");
	     cSalse.getItems().add("yougurt");
	     cSalse.getItems().add("tzatziki");
	     
	     cCarne.getSelectionModel().select(1);
	     cContorno.getSelectionModel().select(1);
	     cSalse.getSelectionModel().select(1);

		Button bTotale = new Button("totale");
		
		
		bTotale.setOnAction(e -> Calcola());
		
		GridPane griglia=new GridPane();
		
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		griglia.add(cCarne,0 ,0);
		griglia.add(cContorno,0 ,1);
		griglia.add(cSalse,0 ,2);
		griglia.add(bTotale,0 ,3);
		griglia.add(eTotale, 0, 4);
		griglia.add(cCarne, 0, 0);
		griglia.add(cContorno, 0, 4);
		griglia.add(cSalse, 0, 4);
		
		griglia.setGridLinesVisible(false);
		
		bTotale.setMaxWidth(300);
		
		cCarne.setMaxWidth(300);
		cContorno.setMaxWidth(300);
		cSalse.setMaxWidth(300);
		
		Scene scena=new Scene(griglia);
		
		finestra.setScene(scena);
		finestra.setTitle("Kebab2");
		finestra.show();
		
	}
    private void Calcola() {
    	
    	String carne = cCarne.getValue();
    	String t = cContorno.getValue();
    	String f = cSalse.getValue();
    	
    	double total;
    
    	    }

    	

    
        
     
    

	public static void main(String[] args) {
		launch(args);
		}
		 
	
	
}
