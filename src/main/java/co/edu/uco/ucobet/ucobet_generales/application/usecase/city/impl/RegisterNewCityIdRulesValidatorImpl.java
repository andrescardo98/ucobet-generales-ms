package co.edu.uco.ucobet.ucobet_generales.application.usecase.city.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCityIdRulesValidator;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityIdDoesExistException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityIdDoesNotExistRule;

@Service
public final class RegisterNewCityIdRulesValidatorImpl implements RegisterNewCityIdRulesValidator {

	private CityIdDoesNotExistRule cityIdDoesNotExistRule;

	public RegisterNewCityIdRulesValidatorImpl(final CityIdDoesNotExistRule cityIdDoesNotExistRule) {
		super();
		this.cityIdDoesNotExistRule = cityIdDoesNotExistRule;
	}


	@Override
	public void validate(CityDomain data) {
		data.generateId();
		try {
			cityIdDoesNotExistRule.validate(data.getId());
		} catch (final CityIdDoesExistException exception) {
			validate(data);
		}
	}

}