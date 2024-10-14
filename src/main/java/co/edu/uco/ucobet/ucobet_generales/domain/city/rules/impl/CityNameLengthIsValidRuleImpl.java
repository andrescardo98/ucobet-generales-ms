package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityNameLengthIsNotValidException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameLengthIsValidRule;

public class CityNameLengthIsValidRuleImpl implements CityNameLengthIsValidRule{

	@Override
	public void validate(String data) {
		if (!TextHelper.maximumLengthValid(data, 50)) {
			throw CityNameLengthIsNotValidException.create();
		}
		
	}

}
