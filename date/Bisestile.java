package it.edu.iisgubbio.date;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Bisestile extends Application {
	
	TextField tAnno = new TextField();
	Label eBisestile = new Label();
	
	public void start(Stage finestra) {
		
		tAnno.setPromptText("Scrivi l'anno corrente");
		Button bBisestile = new Button("bisestile");
		Label eAnno = new Label("anno");
		
		
		GridPane griglia = new GridPane();
		
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(5); 
		griglia.setVgap(5);
		
		griglia.add(eAnno, 0, 0);
		griglia.add(tAnno, 1, 0);
		griglia.add(bBisestile, 0, 1);
		griglia.add(eBisestile, 0, 1);
		
		
		Scene scena = new Scene(griglia);
		
	    finestra.setTitle("Bisestile");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    bBisestile.setOnAction(e -> calcola());
		
	}
	
	public void calcola() {
		
		int iAnno = Integer.parseInt(tAnno.getText());
		
		if (iAnno%4 == 0) {
			
			eBisestile.setText("Sì");
		}
		
	}
		
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
