package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public final class CityIdDoesExistException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;

	public CityIdDoesExistException(String userMessage) {
		super(userMessage, userMessage, new Exception());

	}
	
	public static final CityIdDoesExistException create() {
		var userMessage = "Ya existe una ciudad con el id ingresado...";
		return new CityIdDoesExistException(userMessage);
	}

}
