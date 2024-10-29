package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityIdIsNullException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityIdIsNotNullRule;

@Service
public final class CityIdIsNotNullRuleImpl implements CityIdIsNotNullRule {
	
	@Override
	public void validate(final UUID data) {
		if(ObjectHelper.isNull(data)) {
			throw CityIdIsNullException.create();
		}
		
	}

}
