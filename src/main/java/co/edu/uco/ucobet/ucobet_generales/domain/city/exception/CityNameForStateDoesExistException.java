package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityNameForStateDoesExistException extends RuleUcobetException {
	
	private static final long serialVersionUID = 1L;

	public CityNameForStateDoesExistException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
		// TODO Auto-generated constructor stub
	}
	
	public static final CityNameForStateDoesExistException create() {
		var userMessage = "El nombre de la ciudad para el estado ya existe";
		return new CityNameForStateDoesExistException(userMessage);
	}

}
