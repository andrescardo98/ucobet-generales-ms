package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameForStateDoesNotExistRule;

@Service
public class CityNameForStateDoesNotExistRuleImpl implements CityNameForStateDoesNotExistRule {

	private CityRepository cityRepository;

	public CityNameForStateDoesNotExistRuleImpl(final CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public void validate(CityDomain data) {
	}

}
