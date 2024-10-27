package co.edu.uco.ucobet.ucobet_generales.crosscutting.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.enums.Layer;

public class DtoUcobetException extends UcobetException{
	
	private static final long serialVersionUID = 1L;

	public DtoUcobetException(String userMessage, String technicalMessage, Exception rootException) {
		super(userMessage, technicalMessage, rootException, Layer.DTO);
	}
	
	public static final DtoUcobetException create(String userMessage, String technicalMessage, Exception rootException) {
		return new DtoUcobetException(userMessage, technicalMessage, rootException);
	}
	
	public static final DtoUcobetException create(final String userMessage) {
		return new DtoUcobetException(userMessage, userMessage, new Exception());
	}
	
	public static final DtoUcobetException create(final String userMessage, final String technicalMessage) {
		return new DtoUcobetException(userMessage, technicalMessage, new Exception());
	}

}
