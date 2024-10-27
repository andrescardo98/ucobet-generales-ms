package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityStateDoesNotExistException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityStateDoesExistRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

public class CityStateDoesExistRuleImpl implements CityStateDoesExistRule{
	
	private CityRepository cityRepository;
	
	public CityStateDoesExistRuleImpl(final CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public void validate(StateDomain data) {
		if (!cityRepository.existsById(data.getId())) {
			throw CityStateDoesNotExistException.create();
		}
		
	}

}
