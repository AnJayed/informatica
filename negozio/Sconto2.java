package it.edu.iisgubbio.negozio;

	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;

	public class Sconto2 extends Application {

	    Label ePrezzopanino = new Label("Prezzo panino");
	    Label eNumeropanini = new Label("Numero panini");
	    Label eSconto = new Label("Sconto");
	    Label ePrezzoscontato = new Label();
	    TextField tPrezzopanino = new TextField();
	    TextField tNumeropanini = new TextField();
	    TextField tSconto = new TextField();

	    public void start(Stage finestra) {
	    	tPrezzopanino.setPromptText("Scrivi il prezzo del panino");
	    	tNumeropanini.setPromptText("Quanti panini vuoi magnà?");
	        Button bCalcolatot = new Button("Calcola Totale");

	        GridPane griglia = new GridPane();

	        griglia.setPadding(new Insets(10, 10, 10, 10));
	        griglia.setHgap(15);
	        griglia.setVgap(15);

	        griglia.add(ePrezzopanino, 0, 0);
	        griglia.add(eNumeropanini, 0, 1);
	        griglia.add(eSconto, 0, 2);
	        griglia.add(tPrezzopanino, 1, 0);
	        griglia.add(tNumeropanini, 1, 1);
	        griglia.add(tSconto, 1, 2);
	        griglia.add(bCalcolatot, 0, 3, 2, 1);
	        griglia.add(ePrezzoscontato, 1, 4);

	        bCalcolatot.setMaxWidth(300);

	        griglia.setGridLinesVisible(false);

	        Scene scena = new Scene(griglia);

	        finestra.setScene(scena);
	        finestra.setTitle("Sconto");
	        finestra.show();

	        bCalcolatot.setOnAction(e -> calcoli());
	    }

	    public void calcoli() {
	            double prezzoPanino = Double.parseDouble(tPrezzopanino.getText());
	            int numeroPanini = Integer.parseInt(tNumeropanini.getText());
	            double sconto = Double.parseDouble(tSconto.getText());

	            double totale = prezzoPanino * numeroPanini;

	            double prezzoScontato = totale - (totale * sconto / 100);

	            ePrezzoscontato.setText("Prezzo Scontato: " + prezzoScontato);
	        
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}
