package it.edu.iisgubbio.laboratorio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AnouarJayed1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calcolatore");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        Label label1 = new Label("N:");
        grid.add(label1, 0, 0);
        TextField nField = new TextField();
        grid.add(nField, 1, 0);

        Label label2 = new Label("M:");
        grid.add(label2, 0, 1);
        TextField mField = new TextField();
        grid.add(mField, 1, 1);

        Button sommaButton = new Button("Calcola Somma");
        sommaButton.setOnAction(e -> calcolaSomma(Integer.parseInt(nField.getText()), Integer.parseInt(mField.getText())));
        grid.add(sommaButton, 0, 2);

        Button primiButton = new Button("Conteggio Numeri Primi");
        primiButton.setOnAction(e -> contaNumeriPrimi(Integer.parseInt(nField.getText()), Integer.parseInt(mField.getText())));
        grid.add(primiButton, 1, 2);

        Button disposizioniButton = new Button("Calcola Disposizioni");
        disposizioniButton.setOnAction(e -> calcolaDisposizioni(Integer.parseInt(nField.getText()), Integer.parseInt(mField.getText())));
        grid.add(disposizioniButton, 2, 2);

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void calcolaSomma(int n, int m) {
        // Implementa il calcolo della somma e mostra il risultato
        int somma = 0;
        for (int i = n; i <= m; i++) {
            somma += i;
        }
        mostraRisultato("Somma: " + somma);
    }

    private void contaNumeriPrimi(int n, int m) {
        // Implementa il conteggio dei numeri primi e mostra il risultato
        int conteggio = 0;
        for (int i = n; i <= m; i++) {
            if (isPrimo(i)) {
                conteggio++;
            }
        }
        mostraRisultato("Numeri primi: " + conteggio);
    }

    private void calcolaDisposizioni(int n, int m) {
        // Implementa il calcolo delle disposizioni e mostra il risultato
        int disposizioni = factorial(n) / factorial(n - m);
        mostraRisultato("Disposizioni: " + disposizioni);
    }

    private void mostraRisultato(String risultato) {
        // Implementa la visualizzazione del risultato (puoi usare una finestra di dialogo o un'etichetta nel tuo layout)
        System.out.println(risultato);
    }

    private boolean isPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}


