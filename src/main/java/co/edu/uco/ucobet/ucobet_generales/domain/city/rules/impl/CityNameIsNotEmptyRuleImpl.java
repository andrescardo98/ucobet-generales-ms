package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityNameIsEmptyException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameIsNotEmptyRule;

@Service
public class CityNameIsNotEmptyRuleImpl implements CityNameIsNotEmptyRule {

	@Override
	public void validate(String data) {
		if(data.isEmpty()) {
			throw CityNameIsEmptyException.create();
		}
		
	}

}
