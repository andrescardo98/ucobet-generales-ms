package co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers;

public class TextHelper {
	
	public static final String EMPTY = "";
	public static final String PATTERN_ONLY_LETTERS_DIGITS_SPACES = "^[0-9A-Za-záéíóúñÑÁÉÍÓÚ ]+$";
	
	private TextHelper() {
		
	}
	
	public static boolean isNull(final String string) {
		return ObjectHelper.isNull(string);
	}
	
	public static String getDefault(final String string, final String defaultValue) {
		return ObjectHelper.getDefault(string, defaultValue);
	}
	
	public static String getDefault(final String string) {
		return getDefault(string, EMPTY);
	}
	
	public static boolean isEmpty(final String string) {
		return EMPTY.equals(getDefault(string));
	}

	public static boolean isEmptyApplyingTrim(final String string) {
		return isEmpty(applyTrim(string));
	}

	public static String applyTrim(final String string) {
		return getDefault(string).trim();
	}
	
	public static final boolean contieneSoloLetrasDigitosEspacios(final String valor) {
		return getDefault(valor).matches(PATTERN_ONLY_LETTERS_DIGITS_SPACES);
	}
	
	public static final boolean minimumLengthValid(final String valor, final int longitud) {
		return applyTrim(valor).length() >= longitud;
	}
	
	public static final boolean maximumLengthValid(final String valor, final int longitud) {
		return applyTrim(valor).length() <= longitud;
	}
	
	public static final boolean longitudValida(final String valor, final int longitudMinima, final int longitudMaxima) {
		return minimumLengthValid(valor, longitudMinima) && maximumLengthValid(valor, longitudMaxima);
	}

}
