package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Bounds;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Rimbalzo extends Application {
	 Random random = new Random();
    Circle pallino = new Circle(10);
    Rectangle paddleSinistro = new Rectangle(10, 60);
    Rectangle paddleDestro = new Rectangle(10, 60);
    int x = 150;
    int y = 0;
    int player1Score = 0;
    int player2Score = 0;
    boolean destra = true;
    boolean giu = true;
    double paddleSinistroY = 50;
    double paddleDestroY = 50;
    Label primoplayer=new Label();
    Label secondoplayer=new Label("punti");

    public void start(Stage finestra){
        Pane quadro = new Pane();
        quadro.getChildren().addAll(pallino, paddleSinistro, paddleDestro);
        
        GridPane griglia = new GridPane();
        
        griglia.add(quadro, 0, 0);
        griglia.add(primoplayer, 1,1);
        griglia.add(secondoplayer, 1,2);

        paddleSinistro.setLayoutX(0);
        paddleSinistro.setLayoutY(paddleSinistroY);
        paddleDestro.setLayoutX(290);
        paddleDestro.setLayoutY(paddleDestroY);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(15),
                event -> aggiornaTimer()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        Scene scene = new Scene(griglia, 300, 200);
        
        finestra.setTitle("Ping Pong");
        finestra.setScene(scene);
        finestra.show();


        scene.setOnKeyPressed(event -> tasto(event.getCode()));
    }

    public void aggiornaTimer() {
    	
        if (destra) {
            x++;
        }else {
        	x--;
        }
        if (giu) {
            y++;
        }

        if (y == 200) {
            giu = false;
        }
        
   
        if (!giu) {
            y--;
        }
        if (x == 0) {
        	
            destra = true;
        }
        if (y == 0) {
        	
            giu = true;
        }
        if (x == 0) {
        	player1Score++;
        	primoplayer.setText("punti"+player1Score);
        	
            destra = true;
        } else if (x == 300) {
        	player2Score++;
        	secondoplayer.setText("punti"+player2Score);
        	
            destra = false;
        }
 
    
       
        

  
            pallino.setCenterX(x);
            pallino.setCenterY(y);
            paddleSinistro.setLayoutY(paddleSinistroY);
            paddleDestro.setLayoutY(paddleDestroY);
            
            Bounds b1 = pallino.getBoundsInParent();
            Bounds b2 = paddleDestro.getBoundsInParent();
            if(b1.intersects(b2)) {
            	
            	destra = false;
            	
            }
            Bounds b3 = pallino.getBoundsInParent();
            Bounds b4 = paddleSinistro.getBoundsInParent();
            if(b3.intersects(b4)) {
            	
            	destra = true;
            	
            }

        }
 
    private void tasto(KeyCode code) {
        if (code == KeyCode.W && paddleSinistroY > 0) {
            paddleSinistroY -= 5;
        } else if (code == KeyCode.S && paddleSinistroY < 140) {
            paddleSinistroY += 5;
        } else if (code == KeyCode.UP && paddleDestroY > 0) {
            paddleDestroY -= 5;
        } else if (code == KeyCode.DOWN && paddleDestroY < 140) {
            paddleDestroY += 5;
        }
    }


    public static void main(String args[]) {
        launch();
    }
}
