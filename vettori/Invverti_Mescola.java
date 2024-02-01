package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Invverti_Mescola extends Application {
	
	TextField tNumeri = new TextField();
	Button bInverti = new Button("inverti");
	Button bMescola = new Button("mescola");
	TextField tBoh = new TextField();
	int numeri[];
	
	public void start(Stage finestra) {
		
		GridPane griglia = new GridPane();
		
		griglia.add(tNumeri,  0,  0, 2, 1);
	    griglia.add(bInverti,  1, 1);	
	    griglia.add(bMescola, 0, 1);
	    griglia.add(tBoh,  0,3,2,1);
	    
	    griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(22); 
		griglia.setVgap(10);
		
		Scene scene = new Scene(griglia,370,300);
	    
	    finestra.setTitle("Somma"); 
		finestra.setScene(scene);
		finestra.show();
		
		bInverti.setOnAction(e -> inverti());
		bMescola.setOnAction(e -> mescola());

		
	}
	public void inverti() {
		
		String t = tNumeri.getText();
		parti
		
	}
	
	public void mescola() {
		
	}
	
	
	
	public static void main(String args[]){
		launch();
	}

}
