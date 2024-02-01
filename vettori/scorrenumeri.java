package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class scorrenumeri extends Application {
	
	TextField tNumero = new TextField();
	   Label eRisultati = new Label();

	   int pos;
	   
	   public void start(Stage finestra) {
		   
		   Button bStampa = new Button("Stampa");
		   
		   
		   GridPane griglia = new GridPane();

	
		   griglia.setPadding(new Insets(10, 10, 10, 10));
		   griglia.setHgap(10); 
		   griglia.setVgap(10);
		   griglia.add(tNumero, 0, 0);
		   griglia.add(eRisultati, 0, 3);
		   griglia.add(bStampa, 0, 1);
		   
		   Scene scena = new Scene(griglia, 200, 200);
		   
		   finestra.setTitle("scorre");
		   finestra.setScene(scena);
		   finestra.show();
		   
		   bStampa.setOnAction(e -> stampa());
		   
			
	   }

	   public void stampa() {
		   
		 
	    	  
	      }
	      
	   
	   public static void main(String[] args) {
			launch(args);
		}

	}

