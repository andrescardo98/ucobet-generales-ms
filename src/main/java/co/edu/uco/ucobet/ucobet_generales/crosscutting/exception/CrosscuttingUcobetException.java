package co.edu.uco.ucobet.ucobet_generales.crosscutting.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.enums.Layer;

public class CrosscuttingUcobetException extends UcobetException{
	
	private static final long serialVersionUID = 1L;

	public CrosscuttingUcobetException(String userMessage, String technicalMessage, Exception rootException) {
		super(userMessage, technicalMessage, rootException, Layer.CROSSCUTTING);
	}
	
	public static final CrosscuttingUcobetException create(String userMessage, String technicalMessage, Exception rootException) {
		return new CrosscuttingUcobetException(userMessage, technicalMessage, rootException);
	}
	
	public static final CrosscuttingUcobetException create(final String userMessage) {
		return new CrosscuttingUcobetException(userMessage, userMessage, new Exception());
	}
	
	public static final CrosscuttingUcobetException create(final String userMessage, final String technicalMessage) {
		return new CrosscuttingUcobetException(userMessage, technicalMessage, new Exception());
	}

}
