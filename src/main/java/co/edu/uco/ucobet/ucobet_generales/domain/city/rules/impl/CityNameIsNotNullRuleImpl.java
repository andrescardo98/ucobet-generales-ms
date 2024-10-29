package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityNameIsNullException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameIsNotNullRule;

@Service
public class CityNameIsNotNullRuleImpl implements CityNameIsNotNullRule{

	@Override
	public void validate(String data) {
		if (TextHelper.isNull(data)) {
			throw CityNameIsNullException.create();
		}

	}

}