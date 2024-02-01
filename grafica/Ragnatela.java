package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Ragnatela extends Application {



	public void start(Stage finestra) {

		Pane quadro = new Pane();

			for(int y=0; y<200 ; y+=20) {
				Line linea = new Line(0,y+20,200-y,0);
				linea.setStroke(Color.BLUE);
				linea.setStrokeWidth(1);
				quadro.getChildren().add(linea);
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
