package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Timer extends Application {

    Label testo;
    int n = 100;
    Timeline timeline;

    public void start(Stage primaryStage) throws Exception {
        testo = new Label("finestra timer");
        GridPane griglia = new GridPane();
        griglia.add(testo, 0, 0);

        Button startButton = new Button("Start");
        Button pauseButton = new Button("Pause");

        startButton.setOnAction(e -> startTimer());
        pauseButton.setOnAction(e -> pauseTimer());

        griglia.add(startButton, 0, 1);
        griglia.add(pauseButton, 1, 1);

        Scene scene = new Scene(griglia, 300, 150);
        primaryStage.setTitle("Timer!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), x -> aggiornaTimer()));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    private void startTimer() {
        
        timeline.play();
    }

    private void pauseTimer() {
        
            timeline.pause();
        }

    private void aggiornaTimer() {
        testo.setText("" + (n--));
                    
        }


    public static void main(String args[]) {
        launch();
    }
}

