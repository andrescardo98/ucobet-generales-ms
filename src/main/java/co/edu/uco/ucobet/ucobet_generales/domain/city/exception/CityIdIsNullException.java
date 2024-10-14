package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityIdIsNullException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	private CityIdIsNullException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityIdIsNullException create() {
		var userMessage = "El ID de la ciudad es nulo. Debe ingresar un valor válido.";
		return new CityIdIsNullException(userMessage);
	}

}
