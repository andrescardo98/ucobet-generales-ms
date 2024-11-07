package co.edu.uco.ucobet.ucobet_generales.application.usecase.city.impl;

import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.*;
import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCityNameRulesValidator;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;

@Service
public final class RegisterNewCityNameRulesValidatorImpl implements RegisterNewCityNameRulesValidator {

	private CityNameLengthIsValidRule cityNameLengthIsValidRule;
	private CityNameFormatIsValidRule cityNameFormatIsValidRule;
	private CityNameIsNotEmptyRule cityNameIsNotEmptyRule;
	private CityNameIsNotNullRule cityNameIsNotNullRule;
	private CityNameDoesNotExistRule cityNameDoesNotExistRule;
	private CityNameForStateDoesNotExistRule cityNameForStateDoesNotExistRule;

	public RegisterNewCityNameRulesValidatorImpl(final CityNameLengthIsValidRule cityNameLengthIsValidRule,
												 final CityNameFormatIsValidRule cityNameFormatIsValidRule,
												 final CityNameIsNotEmptyRule cityNameIsNotEmptyRule, final CityNameIsNotNullRule cityNameIsNotNullRule,
												 final CityNameDoesNotExistRule cityNameDoesNotExistRule,
												 final CityNameForStateDoesNotExistRule cityNameForStateDoesNotExistRule) {
		super();
		this.cityNameLengthIsValidRule = cityNameLengthIsValidRule;
		this.cityNameFormatIsValidRule = cityNameFormatIsValidRule;
		this.cityNameIsNotEmptyRule = cityNameIsNotEmptyRule;
		this.cityNameIsNotNullRule = cityNameIsNotNullRule;
		this.cityNameDoesNotExistRule = cityNameDoesNotExistRule;
		this.cityNameForStateDoesNotExistRule = cityNameForStateDoesNotExistRule;
	}

	@Override
	public void validate(CityDomain data) {
		cityNameIsNotNullRule.validate(data.getName());
		cityNameIsNotEmptyRule.validate(data.getName());
		cityNameLengthIsValidRule.validate(data.getName());
		cityNameFormatIsValidRule.validate(data.getName());
		cityNameForStateDoesNotExistRule.validate(data);
		cityNameDoesNotExistRule.validate(data.getName());
	}

}