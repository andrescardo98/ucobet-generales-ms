package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityNameLengthIsNotValidException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	public CityNameLengthIsNotValidException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityNameLengthIsNotValidException create() {
		var userMessage = "La longitud del nombre de la ciudad supera la cantidad de caracteres permitidos, "
				+ "ingrese un nombre de más de 50 caracteres.";
		return new CityNameLengthIsNotValidException(userMessage);
	}

}
