package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityIsBeingUsedException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	public CityIsBeingUsedException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityIsBeingUsedException create() {
		var userMessage = "La ciudad con el id indicado está siendo usada.";
		return new CityIsBeingUsedException(userMessage);
	}

}
