package dad.javafx.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Vista extends HBox{
	
	VBox leftVbox, centerVbox;
	ComboBox<String> comboSimbolos;
	HBox upperHbox, centerHbox, bottomHbox;
	Label simboloSumaLabel1, simboloSumaLabel2, simboloSumaLabel3, simboloImaginarioLabel1, simboloImaginarioLabel2, simboloImaginarioLabel3;
	TextField campoRealArriba, campoRealAbajo, campoImaginarioArriba, campoImaginarioAbajo, campoResultadoReal, campoResultadoImaginario;
	ObservableList<String> simbolos;	
	
	public Vista() {
		
		super();
		
		simbolos = FXCollections.observableArrayList();	
		simbolos.addAll("+", "-", "*", "/");
		
		comboSimbolos = new ComboBox<String>(simbolos);
		comboSimbolos.getSelectionModel().select(0);
		comboSimbolos.setPrefWidth(55);		
		
		campoRealArriba = new TextField("0");
		campoRealArriba.setPrefWidth(50);
		campoRealArriba.setAlignment(Pos.CENTER);
		
		campoRealAbajo =  new TextField("0");
		campoRealAbajo.setPrefWidth(50);
		campoRealAbajo.setAlignment(Pos.CENTER);
		
		campoImaginarioArriba = new TextField("0");
		campoImaginarioArriba.setPrefWidth(50);
		campoImaginarioArriba.setAlignment(Pos.CENTER);
		
		campoImaginarioAbajo =  new TextField("0");
		campoImaginarioAbajo.setPrefWidth(50);
		campoImaginarioAbajo.setAlignment(Pos.CENTER);
		
		campoResultadoReal = new TextField();
		campoResultadoReal.setPrefWidth(50);
		campoResultadoReal.setPromptText("0");
		campoResultadoReal.setDisable(true);
		campoResultadoReal.setAlignment(Pos.CENTER);
		
		campoResultadoImaginario = new TextField();
		campoResultadoImaginario.setPrefWidth(50);
		campoResultadoImaginario.setPromptText("0");
		campoResultadoImaginario.setDisable(true);
		campoResultadoImaginario.setAlignment(Pos.CENTER);
		
		simboloSumaLabel1 = new Label(" + ");
		simboloSumaLabel2 = new Label(" + ");
		simboloSumaLabel3 = new Label(" + ");
		simboloImaginarioLabel1 = new Label("i");
		simboloImaginarioLabel2 = new Label("i");
		simboloImaginarioLabel3 = new Label("i");
		
		upperHbox = new HBox(campoRealArriba, simboloSumaLabel1, campoImaginarioArriba, simboloImaginarioLabel1);
		upperHbox.setPrefWidth(160);
		upperHbox.setSpacing(5);
		centerHbox = new HBox(campoRealAbajo, simboloSumaLabel2, campoImaginarioAbajo, simboloImaginarioLabel2);
		centerHbox.setPrefWidth(160);
		centerHbox.setSpacing(5);
		bottomHbox = new HBox(campoResultadoReal, simboloSumaLabel3, campoResultadoImaginario, simboloImaginarioLabel3);
		bottomHbox.setPrefWidth(160);
		bottomHbox.setSpacing(5);
		
		leftVbox = new VBox(comboSimbolos);
		leftVbox.setAlignment(Pos.CENTER_LEFT);
		
		centerVbox = new VBox(upperHbox, centerHbox, new Separator(), bottomHbox);
		centerVbox.setAlignment(Pos.CENTER);
		centerVbox.setSpacing(5);
		centerVbox.setPrefWidth(140);
		
		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(leftVbox, centerVbox); 
		
	}
	
	public ComboBox<String> getComboSimbolos() {
		return comboSimbolos;
	}

	public TextField getCampoRealArriba() {
		return campoRealArriba;
	}

	public TextField getCampoRealAbajo() {
		return campoRealAbajo;
	}

	public TextField getCampoImaginarioArriba() {
		return campoImaginarioArriba;
	}

	public TextField getCampoImaginarioAbajo() {
		return campoImaginarioAbajo;
	}

	public TextField getCampoResultadoReal() {
		return campoResultadoReal;
	}

	public TextField getCampoResultadoImaginario() {
		return campoResultadoImaginario;
	}

	public VBox getLeftVbox() {
		return leftVbox;
	}

	public VBox getCenterVbox() {
		return centerVbox;
	}

	public ComboBox<String> getListaSimbolos() {
		return comboSimbolos;
	}

	public HBox getUpperHbox() {
		return upperHbox;
	}

	public HBox getCenterHbox() {
		return centerHbox;
	}

	public HBox getBottomHbox() {
		return bottomHbox;
	}

}
