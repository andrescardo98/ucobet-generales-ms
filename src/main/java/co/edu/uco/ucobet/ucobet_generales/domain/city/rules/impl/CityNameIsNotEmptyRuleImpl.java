package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityNameIsEmptyException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameIsNotEmptyRule;

public class CityNameIsNotEmptyRuleImpl implements CityNameIsNotEmptyRule{

	@Override
	public void validate(String data) {
		if (TextHelper.isEmpty(data)) {
			throw CityNameIsEmptyException.create();
		}
	}

}
