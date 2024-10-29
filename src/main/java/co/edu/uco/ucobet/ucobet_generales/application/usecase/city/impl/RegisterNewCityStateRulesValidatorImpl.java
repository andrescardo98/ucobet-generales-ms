package co.edu.uco.ucobet.ucobet_generales.application.usecase.city.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCityStateRulesValidator;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateDoesExistRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdIsNotDefaultValueRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdIsNotNullRule;

@Service
public final class RegisterNewCityStateRulesValidatorImpl implements RegisterNewCityStateRulesValidator {

	private StateDoesExistRule stateDoesExistsRule;
	private StateIdIsNotDefaultValueRule stateIdIsNotDefaultValueRule;
	private StateIdIsNotNullRule stateIdIsNotNullRule;
	
	

	public RegisterNewCityStateRulesValidatorImpl(final StateDoesExistRule stateDoesExistsRule,
			 final StateIdIsNotDefaultValueRule stateIdIsNotDefaultValueRule, final StateIdIsNotNullRule stateIdIsNotNullRule) {
		super();
		this.stateDoesExistsRule = stateDoesExistsRule;
		this.stateIdIsNotDefaultValueRule = stateIdIsNotDefaultValueRule;
		this.stateIdIsNotNullRule = stateIdIsNotNullRule;
	}
	@Override
	public void validate(final UUID stateid) {
		validateState(stateid);
				
	}
	
	public void validateState(final UUID stateid) {
		stateDoesExistsRule.validate(stateid);
		stateIdIsNotDefaultValueRule.validate(stateid);
		stateIdIsNotNullRule.validate(stateid);
		
		
	}


}
