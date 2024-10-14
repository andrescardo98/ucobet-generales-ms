package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityStateDoesNotExistException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	public CityStateDoesNotExistException(String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityStateDoesNotExistException create() {
		var userMessage = "El estado indicado para la ciudad no existe.";
		return new CityStateDoesNotExistException(userMessage);
	}
	
	

}
