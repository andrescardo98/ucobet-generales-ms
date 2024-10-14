package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityIdDoesExistException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	public CityIdDoesExistException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityIdDoesExistException create() {
		var userMessage = "La ciudad con el id indicado existe";
		return new CityIdDoesExistException(userMessage);
	}

}
