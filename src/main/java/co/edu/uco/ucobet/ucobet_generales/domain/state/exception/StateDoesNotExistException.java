package co.edu.uco.ucobet.ucobet_generales.domain.state.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class StateDoesNotExistException extends RuleUcobetException {
	
	private static final long serialVersionUID = 1L;

	public StateDoesNotExistException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final StateDoesNotExistException create() {
		var userMessage = "El valor del estado no puede ser el valor por defecto";
		return new StateDoesNotExistException(userMessage);
	}
	

}
