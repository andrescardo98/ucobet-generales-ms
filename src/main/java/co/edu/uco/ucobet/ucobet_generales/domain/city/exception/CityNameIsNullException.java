package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityNameIsNullException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	public CityNameIsNullException(String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityNameIsNullException create() {
		var userMessage = "El nombre de la ciudad es nulo, por favor ingresa un valor válido.";
		return new CityNameIsNullException(userMessage);
	}
	

}
