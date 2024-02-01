package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Somma extends Application {
	
	TextField tNumero = new TextField();
	   Label eRisultati = new Label();

	   int pos;
	   
	   public void start(Stage finestra) {
		   
		   Button bAlloca = new Button("Alloca");
		   
		   
		   GridPane griglia = new GridPane();

	
		   griglia.setPadding(new Insets(10, 10, 10, 10));
		   griglia.setHgap(10); 
		   griglia.setVgap(10);
		   griglia.add(tNumero, 0, 0);
		   griglia.add(eRisultati, 0, 3);
		   griglia.add(bAlloca, 1, 1);
		   
		   Scene scena = new Scene(griglia, 200, 200);
		   
		   finestra.setTitle("nuoto");
		   finestra.setScene(scena);
		   finestra.show();
		   
		   bAlloca.setOnAction(e -> alloca());
		   
			
	   }

	   public void alloca() {
		   
		   int somma = 0;
		   
		   String t = tNumero.getText();
		   
		   String[] parti = t.split("");
		   
		  int numeri[];
	      numeri = new int[parti.length];
	      
	      for(int i = 0; i <parti.length; i++) {
	    	  
	    	  numeri[i] = Integer.parseInt(parti[i]);
	    	  
	    	somma = somma + numeri[i];
	    	
	    	  
	      }
	      eRisultati.setText("" +somma);
	   }
	   
	   public static void main(String[] args) {
			launch(args);
		}

	}

