package dad.buscarremplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Buscaryreemplazar extends Application {

	private Label buscarLabel;
	private Label reemplazarLabel;
	private TextField buscarText;
	private TextField reemplazarText;
	private Button buscaButton,reemplazaButton,reemplazatodoButton,cierraButton,ayudaButton;
	
	private CheckBox gridCheck,gridCheck1,gridCheck2,gridCheck3;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarLabel = new Label("Buscar: ");
		reemplazarLabel = new Label("Reemplazar con: ");
		buscarText = new TextField();
		GridPane.setColumnSpan(buscarText,45);
		reemplazarText = new TextField();
		GridPane.setColumnSpan(reemplazarText,45);
		
		gridCheck = new CheckBox("Mayúsculas y minúsculas");
		gridCheck1 = new CheckBox("Expresión regular");
		gridCheck2 = new CheckBox("Buscar hacia atrás");
		gridCheck3 = new CheckBox("Resaltar resutados");
		
		buscaButton = new Button("Buscar");
		buscaButton.setMinWidth(110);
		reemplazaButton = new Button("Reemplazar");
		reemplazaButton.setMinWidth(110);
		reemplazatodoButton = new Button("Reemplazar todo");
		reemplazatodoButton.setMinWidth(110);
		cierraButton = new Button("Cerrar");
		cierraButton.setMinWidth(110);
		ayudaButton = new Button("Ayudar");
		ayudaButton.setMinWidth(110);
		
		GridPane formPane = new GridPane();
		formPane.add(buscarLabel, 0, 0);
		formPane.add(buscarText, 1, 0, 2, 1);
		formPane.add(reemplazarLabel, 0, 1);
		formPane.add(reemplazarText, 1, 1, 2, 1);
		formPane.add(gridCheck, 1, 2);
		formPane.add(gridCheck1, 2, 2);
		formPane.add(gridCheck2, 1, 3);
		formPane.add(gridCheck3, 2, 3);
		formPane.add(buscaButton, 3, 0);
		formPane.add(reemplazaButton, 3, 1);
		formPane.add(reemplazatodoButton, 3, 2);
		formPane.add(cierraButton, 3, 3);
		formPane.add(ayudaButton, 3, 4);
		formPane.setHgap(5);
		formPane.setVgap(5);
	
		BorderPane root = new BorderPane();
		root.setCenter(formPane);
		root.setPadding(new Insets(5));
		
		Scene scene = new Scene(root, 480, 250);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
