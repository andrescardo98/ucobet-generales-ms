package co.edu.uco.ucobet.ucobet_generales.domain.country.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.domain.DomainRule;

@Service
public interface CountryNameIsNotNullRule extends DomainRule<String>{

}
