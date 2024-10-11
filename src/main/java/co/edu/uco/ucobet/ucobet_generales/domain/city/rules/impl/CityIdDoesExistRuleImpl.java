package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import java.util.UUID;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityIdDoesNotExistException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityIdDoesExistRule;

public class CityIdDoesExistRuleImpl implements CityIdDoesExistRule{
	
	private CityRepository cityRepository;
	
	public CityIdDoesExistRuleImpl(final CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public void validate(final UUID data) {
		if(!cityRepository.existsById(data)) {
			throw CityIdDoesNotExistException.create();
		}
	}

}
