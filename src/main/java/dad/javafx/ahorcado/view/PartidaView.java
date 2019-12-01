package dad.javafx.ahorcado.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PartidaView extends Tab{
	
	private GridPane grid;
	private ImageView imagen;
	private Label punto, puntos, acierto, aciertos;
	private Label palabra;
	private Label letrasUs;
	private TextField introLetra;
	private Button letra,resolver;
	private HBox puntosHBox,aciertosHBox,resolverHBox;
	private VBox resultado;
	
	public PartidaView() {
		super("Partida");
		imagen= new ImageView();
		punto= new Label("Puntos: ");
		puntos= new Label();
		acierto= new Label("Aciertos: ");
		aciertos= new Label();
		palabra= new Label();
		letrasUs= new Label();
		introLetra = new TextField();
		letra= new Button("Letras");
		resolver= new Button("Resolver");
		
		puntosHBox = new HBox(punto, puntos);
		aciertosHBox = new HBox(acierto, aciertos);
		resolverHBox = new HBox(introLetra, letra,resolver);
		resultado = new VBox(puntosHBox,aciertosHBox);
		
		grid = new GridPane();
		grid.setPadding(new Insets(5));
		grid.setHgap(5);
		grid.setVgap(5);
		
		
		grid.setPadding(new Insets(5));
		grid.addRow(0, imagen,resultado);
		grid.addRow(1, palabra);
		grid.addRow(2, letrasUs);
		grid.addRow(3,resolverHBox);
		
		GridPane.setColumnSpan(imagen, 3);
		GridPane.setColumnSpan(resultado, 2);
		GridPane.setRowSpan(imagen, 3);
		GridPane.setRowSpan(resultado, 3);
		GridPane.setColumnSpan(introLetra, 3);
		
		this.setContent(grid);
	}	
	
	
	
}
