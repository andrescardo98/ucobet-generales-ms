package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityNameFormatIsNotValidException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
		
	public CityNameFormatIsNotValidException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityNameFormatIsNotValidException create() {
		var userMessage = "El formato del nombre de la ciudad no es válido.";
		return new CityNameFormatIsNotValidException(userMessage);
	}

}
