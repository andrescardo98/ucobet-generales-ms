package co.edu.uco.ucobet.ucobet_generales.domain.state.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class StateIdIsNullException extends RuleUcobetException{
	
	private static final long serialVersionUID = 1L;
	
	public StateIdIsNullException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final StateIdIsNullException create() {
		var userMessage = "El ID del estado es nulo. Debe ingresar un valor válido.";
		return new StateIdIsNullException(userMessage);
	}

}
