package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityNameIsEmptyException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	public CityNameIsEmptyException(String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityNameIsEmptyException create() {
		var userMessage = "El nombre de la ciudad está vacío, por favor ingrese un valor válido.";
		return new CityNameIsEmptyException(userMessage);
	}
	

}
