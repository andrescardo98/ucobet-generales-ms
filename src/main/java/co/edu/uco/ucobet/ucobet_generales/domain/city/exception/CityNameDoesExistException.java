package co.edu.uco.ucobet.ucobet_generales.domain.city.exception;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.RuleUcobetException;

public class CityNameDoesExistException extends RuleUcobetException {

    private static final long serialVersionUID = 1L;

    public CityNameDoesExistException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final CityNameDoesExistException create() {
        var userMessage = "Ya existe una ciudad con el nombre ingresado";
        return new CityNameDoesExistException(userMessage);
    }


}