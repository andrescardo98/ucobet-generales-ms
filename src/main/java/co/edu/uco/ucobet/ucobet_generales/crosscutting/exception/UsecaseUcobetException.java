package co.edu.uco.ucobet.ucobet_generales.crosscutting.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.enums.Layer;

public class UsecaseUcobetException extends UcobetException{
	
	private static final long serialVersionUID = 1L;

	public UsecaseUcobetException(String userMessage, String technicalMessage, Exception rootException) {
		super(userMessage, technicalMessage, rootException, Layer.USECASE);
	}
	
	public static final UsecaseUcobetException create(String userMessage, String technicalMessage, Exception rootException) {
		return new UsecaseUcobetException(userMessage, technicalMessage, rootException);
	}
	
	public static final UsecaseUcobetException create(final String userMessage) {
		return new UsecaseUcobetException(userMessage, userMessage, new Exception());
	}
	
	public static final UsecaseUcobetException create(final String userMessage, final String technicalMessage) {
		return new UsecaseUcobetException(userMessage, technicalMessage, new Exception());
	}

}
