package dad.javafx.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Complejo {
	
	DoubleProperty parteReal = new SimpleDoubleProperty();
	DoubleProperty parteImaginaria = new SimpleDoubleProperty();
	
	
	public final DoubleProperty parteRealProperty() {
		return this.parteReal;
	}
	
	public final double getParteReal() {
		return this.parteRealProperty().get();
	}
	
	public final void setParteReal(final double parteReal) {
		this.parteRealProperty().set(parteReal);
	}
	
	public final DoubleProperty parteImaginariaProperty() {
		return this.parteImaginaria;
	}
	
	public final double getParteImaginaria() {
		return this.parteImaginariaProperty().get();
	}
	
	public final void setParteImaginaria(final double parteImaginaria) {
		this.parteImaginariaProperty().set(parteImaginaria);
	}
	
	


	

}
