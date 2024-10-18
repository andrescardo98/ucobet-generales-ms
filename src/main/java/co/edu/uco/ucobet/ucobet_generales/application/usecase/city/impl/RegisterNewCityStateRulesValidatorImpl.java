package co.edu.uco.ucobet.ucobet_generales.application.usecase.city.impl;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCityStateRulesValidator;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdDoesExistRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdIsNotDefaultValueRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdIsNotNullRule;

public final class RegisterNewCityStateRulesValidatorImpl implements RegisterNewCityStateRulesValidator {

	private StateIdDoesExistRule stateDoesExistRule;
	private StateIdIsNotNullRule stateIdIsNotNullRule;
	private StateIdIsNotDefaultValueRule stateIdIsNotDefaultValueRule;
	
	
	
	public RegisterNewCityStateRulesValidatorImpl(StateIdDoesExistRule stateDoesExistRule,
			StateIdIsNotNullRule stateIdIsNotNullRule, StateIdIsNotDefaultValueRule stateIdIsNotDefaultValueRule) {
		super();
		this.stateDoesExistRule = stateDoesExistRule;
		this.stateIdIsNotNullRule = stateIdIsNotNullRule;
		this.stateIdIsNotDefaultValueRule = stateIdIsNotDefaultValueRule;
	}

	@Override
	public void validate(final CityDomain data) {
		stateIdIsNotNullRule.validate(data.getState().getId());
		stateIdIsNotDefaultValueRule.validate(data.getState().getId());
		stateDoesExistRule.validate(data.getState().getId());
	}
}
