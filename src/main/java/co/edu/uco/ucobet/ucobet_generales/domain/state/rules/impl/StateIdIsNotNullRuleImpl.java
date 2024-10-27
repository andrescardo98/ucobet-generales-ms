package co.edu.uco.ucobet.ucobet_generales.domain.state.rules.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.state.exception.StateIdIsNullException;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdIsNotNullRule;

@Service
public class StateIdIsNotNullRuleImpl implements StateIdIsNotNullRule{

	@Override
	public void validate(UUID data) {
		if (UUIDHelper.isDefault(data)) {
			throw StateIdIsNullException.create();
		}
		
	}

}
