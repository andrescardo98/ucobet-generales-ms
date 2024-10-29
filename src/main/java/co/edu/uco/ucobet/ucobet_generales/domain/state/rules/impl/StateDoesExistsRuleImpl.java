package co.edu.uco.ucobet.ucobet_generales.domain.state.rules.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.StateRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityStateDoesNotExistException;
import co.edu.uco.ucobet.ucobet_generales.domain.state.rules.StateDoesExistRule;

@Service
public class StateDoesExistsRuleImpl implements StateDoesExistRule {

	private final StateRepository stateRepository;
	
	public StateDoesExistsRuleImpl(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
	}
	
	
	@Override
	public void validate(UUID data) {
		if(!stateRepository.existsById(data)) {
			throw CityStateDoesNotExistException.create();
		}
		
	}

}
