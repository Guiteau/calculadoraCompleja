package dad.javafx.controller;

import dad.javafx.model.Complejo;
import dad.javafx.view.Vista;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.util.converter.NumberStringConverter;

public class ControllerCalculadora {

	private Complejo modeloArriba = new Complejo();
	private Complejo modeloAbajo = new Complejo();
	private Vista vista = new Vista();

	public ControllerCalculadora() {

		// BINDEOS

		Bindings.bindBidirectional(vista.getCampoRealArriba().textProperty(), modeloArriba.parteRealProperty(),
				new NumberStringConverter());

		Bindings.bindBidirectional(vista.getCampoRealAbajo().textProperty(), modeloAbajo.parteRealProperty(),
				new NumberStringConverter());
		
		Bindings.bindBidirectional(vista.getCampoImaginarioArriba().textProperty(),
				modeloArriba.parteImaginariaProperty(), new NumberStringConverter());

		Bindings.bindBidirectional(vista.getCampoImaginarioAbajo().textProperty(),
				modeloAbajo.parteImaginariaProperty(), new NumberStringConverter());

		// LISTENER

		vista.getComboSimbolos().valueProperty().addListener((observable, oldValue, newValue) -> tipoOperacion());

	}

	private Object tipoOperacion() {

		DoubleBinding resultadoReal;
		DoubleBinding resultadoImaginario;
		DoubleProperty finalReal = new SimpleDoubleProperty();
		DoubleProperty finalImaginario = new SimpleDoubleProperty();

		switch (vista.getComboSimbolos().getValue()) {
		case "+": {

			resultadoReal = (modeloArriba.parteRealProperty().add(modeloAbajo.parteRealProperty()));

			finalReal.bind(resultadoReal);

			resultadoImaginario = (modeloArriba.parteImaginariaProperty().add(modeloAbajo.parteImaginariaProperty()));

			finalImaginario.bind(resultadoImaginario);

			vista.getCampoResultadoReal().textProperty().bind(finalReal.asString("%.0f\n"));

			vista.getCampoResultadoImaginario().textProperty().bind(finalImaginario.asString("%.0f\n"));

			break;
		}
		case "-": {

			resultadoReal = (modeloArriba.parteRealProperty().subtract(modeloAbajo.parteRealProperty()));

			finalReal.bind(resultadoReal);

			resultadoImaginario = (modeloArriba.parteImaginariaProperty()
					.subtract(modeloAbajo.parteImaginariaProperty()));

			finalImaginario.bind(resultadoImaginario);

			vista.getCampoResultadoReal().textProperty().bind(finalReal.asString("%.0f\n"));

			vista.getCampoResultadoImaginario().textProperty().bind(finalImaginario.asString("%.0f\n"));

			break;
		}
		case "*": {

			resultadoReal = (modeloArriba.parteRealProperty().multiply(modeloAbajo.parteRealProperty()));

			finalReal.bind(resultadoReal);

			resultadoImaginario = (modeloArriba.parteImaginariaProperty()
					.multiply(modeloAbajo.parteImaginariaProperty()));

			finalImaginario.bind(resultadoImaginario);

			vista.getCampoResultadoReal().textProperty().bind(finalReal.asString("%.0f\n"));

			vista.getCampoResultadoImaginario().textProperty().bind(finalImaginario.asString("%.0f\n"));

			break;
		}
		case "/": {

			resultadoReal = (modeloArriba.parteRealProperty().divide(modeloAbajo.parteRealProperty()));

			finalReal.bind(resultadoReal);

			resultadoImaginario = (modeloArriba.parteImaginariaProperty()
					.divide(modeloAbajo.parteImaginariaProperty()));

			finalImaginario.bind(resultadoImaginario);

			vista.getCampoResultadoReal().textProperty().bind(finalReal.asString("%.2f\n"));

			vista.getCampoResultadoImaginario().textProperty().bind(finalImaginario.asString("%.2f\n"));

			break;
		}
		default:
			throw new IllegalArgumentException(
					"Unexpected value: " + vista.getComboSimbolos().getSelectionModel().selectedIndexProperty());
		}

		return null;
	}

	public Complejo getModeloArriba() {
		return modeloArriba;
	}

	public Complejo getModeloAbajo() {
		return modeloAbajo;
	}

	public Vista getVista() {
		return vista;
	}

}
