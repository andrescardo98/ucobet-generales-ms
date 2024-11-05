package co.edu.uco.ucobet.ucobet_generales.domain.state.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;

public class StateIdIsDefaultValueException extends RuleUcobetException {
	
	private static final long serialVersionUID = 1L;

	public StateIdIsDefaultValueException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final StateIdIsDefaultValueException create() {
		var userMessage = MessageCatalog.getMessageContent(MessageCode.M0000000016);
		return new StateIdIsDefaultValueException(userMessage);
	}
	

}
