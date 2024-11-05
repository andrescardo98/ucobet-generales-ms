package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.Message;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;

public final class CityIdDoesExistException extends RuleUcobetException {

	private static final long serialVersionUID = 1L;

	public CityIdDoesExistException(String userMessage) {
		super(userMessage, userMessage, new Exception());

	}
	
	public static final CityIdDoesExistException create() {
		var userMessage = MessageCatalog.getMessageContent(MessageCode.M0000000005);
		return new CityIdDoesExistException(userMessage);
	}

}
