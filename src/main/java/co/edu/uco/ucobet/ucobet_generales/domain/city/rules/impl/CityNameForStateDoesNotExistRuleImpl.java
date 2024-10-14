package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityNameForStateDoesExistException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityStateDoesExistRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

public class CityNameForStateDoesNotExistRuleImpl implements CityStateDoesExistRule{

	@Override
	public void validate(final StateDomain data) {
		if (!TextHelper.contieneSoloLetrasDigitosEspacios(data.getName())) {
			throw CityNameForStateDoesExistException.create();
		}
		
	}

}
