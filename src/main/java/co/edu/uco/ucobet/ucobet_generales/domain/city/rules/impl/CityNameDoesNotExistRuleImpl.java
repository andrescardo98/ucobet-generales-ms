package co.edu.uco.ucobet.ucobet_generales.domain.city.rules.impl;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityNameDoesExistException;
import co.edu.uco.ucobet.ucobet_generales.domain.city.rules.CityNameDoesNotExistRule;
import org.springframework.stereotype.Service;

@Service
public class CityNameDoesNotExistRuleImpl implements CityNameDoesNotExistRule {

    private CityRepository cityRepository;

    public CityNameDoesNotExistRuleImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void validate(String data) {
        if (cityRepository.existsByName(data)){
            throw CityNameDoesExistException.create();
        }
    }

}

