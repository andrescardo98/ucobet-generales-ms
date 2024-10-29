package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.StateRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityStateDoesNotExistException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityStateDoesExistRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

@Service
public class CityStateDoesExistRuleImpl implements CityStateDoesExistRule {

	private final StateRepository stateRepository;

    public CityStateDoesExistRuleImpl(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

	@Override
	public void validate(StateDomain data) {
		if(stateRepository.existsById(data.getId())) {
			throw CityStateDoesNotExistException.create();
		}
		
	}
}