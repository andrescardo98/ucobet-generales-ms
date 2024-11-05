package co.edu.uco.ucobet.ucobet_generales.domain.state.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;

public class StateIdIsNullException extends RuleUcobetException{
	
	private static final long serialVersionUID = 1L;
	
	public StateIdIsNullException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final StateIdIsNullException create() {
		var userMessage = MessageCatalog.getMessageContent(MessageCode.M0000000017);
		return new StateIdIsNullException(userMessage);
	}

}
