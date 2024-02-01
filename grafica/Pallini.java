package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Pallini extends Application {

	public void start(Stage finestra) {

		Pane quadro = new Pane();



		for(int y=20; y<=100; y+=20) {
			for(int x=20; x<=100; x+=20) {
				Circle pallini = new Circle(10);
				pallini.setCenterX(x);
				pallini.setCenterY(y);
				pallini.setFill(Color.BLUE);	
				quadro.getChildren().add(pallini);
			}
		}



		Scene scena = new Scene(quadro, 200, 200);

		finestra.setTitle("Pallini");
		finestra.setScene(scena);
		finestra.show();



	}

	public static void main(String[] args) {
		launch(args);
	}

}
