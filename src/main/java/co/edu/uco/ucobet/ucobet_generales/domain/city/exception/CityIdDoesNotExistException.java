package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityIdDoesNotExistException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	private CityIdDoesNotExistException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityIdDoesNotExistException create() {
		var userMessage = "No existe la ciudad con el id indicado";
		return new CityIdDoesNotExistException(userMessage);
	}

}
