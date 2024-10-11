package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import java.util.UUID;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityIdIsNotNullRule;

public class CityIdIsNotNullRuleImpl implements CityIdIsNotNullRule{

	@Override
	public void validate(final UUID data) {
		if (ObjectHelper.isNull(data)) {
			//throw Exception
		}
		
	}
	
	

}
