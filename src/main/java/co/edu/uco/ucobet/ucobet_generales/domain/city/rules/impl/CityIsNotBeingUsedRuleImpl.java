package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import java.util.UUID;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityIsBeingUsedException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityIsNotBeingUsedRule;

public class CityIsNotBeingUsedRuleImpl implements CityIsNotBeingUsedRule {

	private CityRepository cityRepository;
	
	public CityIsNotBeingUsedRuleImpl(final CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}
	
	@Override
	public void validate(UUID data) {
		if (!cityRepository.existsById(data)) {
			throw CityIsBeingUsedException.create();
		}
		
	}

}
