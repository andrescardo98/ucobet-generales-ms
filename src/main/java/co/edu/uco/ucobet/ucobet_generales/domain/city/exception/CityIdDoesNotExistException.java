package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;

public class CityIdDoesNotExistException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;
	
	private CityIdDoesNotExistException(final String userMessage) {
		super(userMessage, userMessage, new Exception());
	}
	
	public static final CityIdDoesNotExistException create() {
		var userMessage = MessageCatalog.getMessageContent(MessageCode.M0000000006);
		return new CityIdDoesNotExistException(userMessage);
	}

}
