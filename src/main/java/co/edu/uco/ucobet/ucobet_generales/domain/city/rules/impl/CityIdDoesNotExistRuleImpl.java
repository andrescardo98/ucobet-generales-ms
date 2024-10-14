package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import java.util.UUID;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityIdDoesExistException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityIdDoesNotExistRule;

public class CityIdDoesNotExistRuleImpl implements CityIdDoesNotExistRule{
	
	private CityRepository cityRepository;
	
	public CityIdDoesNotExistRuleImpl(final CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public void validate(UUID data) {
		if(!cityRepository.existsById(data)) {
			throw CityIdDoesExistException.create();
		}
		
	}
	
	

}
