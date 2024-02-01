package it.edu.iisgubbio.laboratorio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AnouarJayed2 extends Application {
	
	TextField tN = new TextField();
	TextField tM = new TextField();

	Label eSeqNum = new Label("");
	
	public void start(Stage finestra) {
		
		Label eN = new Label("N");
		
		Label eM = new Label("M"); 

		Button bCalcolaseq = new Button("Numeri Primi");

		GridPane griglia = new GridPane();

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);

		griglia.add(eN, 0, 0);
		griglia.add(eM, 0, 1);
		griglia.add(tN, 1, 0);
		griglia.add(tM, 1, 1);
		griglia.add(bCalcolaseq, 0, 2, 2, 1);
		griglia.add(eSeqNum, 0, 3, 2, 1);

		griglia.setGridLinesVisible(false);

		bCalcolaseq.setMaxWidth(600);

		tN.setPromptText("inserisci il numero");
		tM.setPromptText("inserisci il numero");

		Scene scena = new Scene(griglia);

		finestra.setTitle("Numeri Primi");
		finestra.setScene(scena);
		finestra.show();

		bCalcolaseq.setOnAction(e -> calcoli());
		
	}

		public void calcoli() {
			
			int numN = Integer.parseInt(tN.getText());
			int numM= Integer.parseInt(tM.getText());
			
			
		}
			
		
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
