package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FacciaTriste extends Application {

    public void start(Stage finestra) {

        Pane quadro = new Pane();

        Circle faccia = new Circle(100);
        faccia.setFill(Color.BLACK);
        faccia.setCenterX(100);
        faccia.setCenterY(100);

        Circle occhioDx = new Circle(10);
        Circle occhioSx = new Circle(10);
        occhioDx.setCenterX(50);
        occhioDx.setCenterY(50);
        occhioSx.setCenterX(150);
        occhioSx.setCenterY(50);
        occhioDx.setFill(Color.WHITE);
        occhioSx.setFill(Color.WHITE);

        Line boccaDx = new Line(140, 160, 100, 140);
        Line boccaSx = new Line(100,125,50,150);
        boccaDx.setStroke(Color.PINK); 
        boccaSx.setStroke(Color.PINK); 

        Scene scena = new Scene(quadro, 200, 200);

        finestra.setTitle("Faccia Triste");
        finestra.setScene(scena);
        finestra.show();

        quadro.getChildren().add(faccia);
        quadro.getChildren().add(occhioDx);
        quadro.getChildren().add(occhioSx);
        quadro.getChildren().add(boccaDx);
        quadro.getChildren().add(boccaSx);

    }

    public static void main(String[] args) {
        launch(args);
    }
}

