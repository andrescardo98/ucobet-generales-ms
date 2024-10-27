package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityNameFormatIsNotValidException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameFormatIsValidRule;

public class CityNameFormatIsValidRuleImpl implements CityNameFormatIsValidRule{

	@Override
	public void validate(String data) {
		if(!TextHelper.contieneSoloLetrasDigitosEspacios(data)) {
			throw CityNameFormatIsNotValidException.create();
		}
		
	}

}
