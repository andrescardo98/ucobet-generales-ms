package co.edu.uco.ucobet.ucobet_generales.application.usecase.city.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCityNameRulesValidator;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameForStateDoesNotExistRule;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameFormatIsValidRule;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameIsNotEmptyRule;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameIsNotNullRule;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameLengthIsValidRule;

@Service
public final class RegisterNewCityNameRulesValidatorImpl implements RegisterNewCityNameRulesValidator {

	private CityNameLengthIsValidRule cityNameLengthIsValidRule;
	private CityNameFormatIsValidRule cityNameFormatIsValidRule;
	private CityNameIsNotEmptyRule cityNameIsNotEmptyRule;
	private CityNameIsNotNullRule cityNameIsNotNullRule;
	private CityNameForStateDoesNotExistRule cityNameForStateDoesNotExistRule;

	public RegisterNewCityNameRulesValidatorImpl(final CityNameLengthIsValidRule cityNameLengthIsValidRule,
			final CityNameFormatIsValidRule cityNameFormatIsValidRule,
			final CityNameIsNotEmptyRule cityNameIsNotEmptyRule, final CityNameIsNotNullRule cityNameIsNotNullRule,
			final CityNameForStateDoesNotExistRule cityNameForStateDoesNotExistRule) {
		super();
		this.cityNameLengthIsValidRule = cityNameLengthIsValidRule;
		this.cityNameFormatIsValidRule = cityNameFormatIsValidRule;
		this.cityNameIsNotEmptyRule = cityNameIsNotEmptyRule;
		this.cityNameIsNotNullRule = cityNameIsNotNullRule;
		this.cityNameForStateDoesNotExistRule = cityNameForStateDoesNotExistRule;
	}

	@Override
	public void validate(CityDomain data) {
		cityNameIsNotNullRule.validate(data.getName());
		cityNameIsNotEmptyRule.validate(data.getName());
		cityNameLengthIsValidRule.validate(data.getName());
		cityNameFormatIsValidRule.validate(data.getName());
		cityNameForStateDoesNotExistRule.validate(data);
	}

}
