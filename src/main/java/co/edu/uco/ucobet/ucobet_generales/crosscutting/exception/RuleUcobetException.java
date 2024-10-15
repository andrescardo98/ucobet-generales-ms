package co.edu.uco.ucobet.ucobet_generales.crosscutting.exception;

import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.enums.Layer;

public class RuleUcobetException extends UcobetException{
	
	private static final long serialVersionUID = 1L;

	public RuleUcobetException(String userMessage, String technicalMessage, Exception rootException) {
		super(userMessage, technicalMessage, rootException, Layer.RULE);
	}
	
	public static final RuleUcobetException create(String userMessage, String technicalMessage, Exception rootException) {
		return new RuleUcobetException(userMessage, technicalMessage, rootException);
	}
	
	public static final RuleUcobetException create(final String userMessage) {
		return new RuleUcobetException(userMessage, userMessage, new Exception());
	}
	
	public static final RuleUcobetException create(final String userMessage, final String technicalMessage) {
		return new RuleUcobetException(userMessage, technicalMessage, new Exception());
	}

}
