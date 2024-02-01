package it.edu.iisgubbio.animazioni;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AvantiIndietro extends Application{
	Circle pallino;
	Button pStart = new Button("via");
	int n=0;
	Timeline timeline;
	Pane quadro = new Pane(); 
	boolean avanti;
	
	public void start(Stage finestra) throws Exception {
		GridPane griglia = new GridPane();
		griglia.add(pStart,  0,  0);
		griglia.add(quadro, 0, 1);

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(22); 
		griglia.setVgap(10);

		Scene scene = new Scene(griglia,300,200);

		finestra.setTitle("Timer!"); 
		finestra.setScene(scene);
		finestra.show();

		timeline = new Timeline(new KeyFrame(
				Duration.millis(20),
				x -> aggiornaTimer()));

		pallino = new Circle(10);
		quadro.getChildren().add(pallino);
		pallino.setCenterY(20);
		timeline.setCycleCount(Timeline.INDEFINITE);

		pStart.setOnAction(e -> muoviti());
	}
	private void muoviti(){
		timeline.play();
	}
	private void aggiornaTimer(){ 
		pallino.setCenterX(n);
		if (n==300) {	
			avanti=false;
			
			
		} 
		if (n==0) {
			avanti=true;	
		}
		if (avanti) {
			n++;
			
		} else {
			n--;
		}
	}

	public static void main(String args[]){
		launch();
	}
}