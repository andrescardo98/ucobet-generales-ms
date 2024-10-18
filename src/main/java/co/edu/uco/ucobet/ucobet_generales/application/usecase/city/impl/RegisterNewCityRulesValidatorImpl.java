package co.edu.uco.ucobet.ucobet_generales.application.usecase.city.impl;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCityRulesValidator;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;

public final class RegisterNewCityRulesValidatorImpl implements RegisterNewCityRulesValidator {

	private RegisterNewCityIdRulesValidatorImpl registerNewCityIdRulesValidatorImpl;
	private RegisterNewCityNameRulesValidatorImpl registerNewCityNameRulesValidatorImpl;
	private RegisterNewCityStateRulesValidatorImpl registerNewCityStateRulesValidatorImpl ;
	
	
	public RegisterNewCityRulesValidatorImpl(RegisterNewCityIdRulesValidatorImpl registerNewCityIdRulesValidatorImpl,
			RegisterNewCityNameRulesValidatorImpl registerNewCityNameRulesValidatorImpl,
			RegisterNewCityStateRulesValidatorImpl registerNewCityStateRulesValidatorImpl) {
		super();
		this.registerNewCityIdRulesValidatorImpl = registerNewCityIdRulesValidatorImpl;
		this.registerNewCityNameRulesValidatorImpl = registerNewCityNameRulesValidatorImpl;
		this.registerNewCityStateRulesValidatorImpl = registerNewCityStateRulesValidatorImpl;
	}

	@Override
	public void validate(final CityDomain data) {
		registerNewCityIdRulesValidatorImpl.validate(data);
		registerNewCityNameRulesValidatorImpl.validate(data);
		registerNewCityStateRulesValidatorImpl.validate(data);
	}


}
