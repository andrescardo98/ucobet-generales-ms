package co.edu.uco.ucobet.ucobet_generales.application.usecase.city.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCityStateRulesValidator;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdDoesExistRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdIsNotDefaultValueRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdIsNotNullRule;

@Service
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
	public void validate(final UUID id) {
		stateIdIsNotNullRule.validate(id);
		stateIdIsNotDefaultValueRule.validate(id);
		stateDoesExistRule.validate(id);
	}
}
