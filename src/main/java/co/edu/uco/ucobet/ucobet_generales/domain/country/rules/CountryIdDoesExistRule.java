package co.edu.uco.ucobet.ucobet_generales.domain.country.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.domain.DomainRule;

@Service
public interface CountryIdDoesExistRule extends DomainRule<UUID>{

}
