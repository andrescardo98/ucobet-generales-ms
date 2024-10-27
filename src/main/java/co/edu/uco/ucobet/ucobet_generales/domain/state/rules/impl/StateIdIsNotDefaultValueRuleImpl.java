package co.edu.uco.ucobet.ucobet_generales.domain.state.rules.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.state.exception.StateIdIsDefaultValueException;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateIdIsNotDefaultValueRule;

@Service
public class StateIdIsNotDefaultValueRuleImpl implements StateIdIsNotDefaultValueRule{

	@Override
	public void validate(UUID data) {
		if (UUIDHelper.isDefault(data)) {
			throw StateIdIsDefaultValueException.create();
		}
		
	}

}
