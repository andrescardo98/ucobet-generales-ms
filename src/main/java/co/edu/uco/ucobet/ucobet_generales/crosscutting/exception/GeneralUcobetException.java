package co.edu.uco.ucobet.ucobet_generales.crosscutting.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.enums.Layer;

public class GeneralUcobetException extends UcobetException{
	
	private static final long serialVersionUID = 1L;

	public GeneralUcobetException(String userMessage, String technicalMessage, Exception rootException) {
		super(userMessage, technicalMessage, rootException, Layer.GENERAL);
	}
	
	public static final GeneralUcobetException create(String userMessage, String technicalMessage, Exception rootException) {
		return new GeneralUcobetException(userMessage, technicalMessage, rootException);
	}
	
	public static final GeneralUcobetException create(final String userMessage) {
		return new GeneralUcobetException(userMessage, userMessage, new Exception());
	}
	
	public static final GeneralUcobetException create(final String userMessage, final String technicalMessage) {
		return new GeneralUcobetException(userMessage, technicalMessage, new Exception());
	}

}
