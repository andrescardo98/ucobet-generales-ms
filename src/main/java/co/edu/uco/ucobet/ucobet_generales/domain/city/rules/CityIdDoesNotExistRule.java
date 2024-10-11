package co.edu.uco.ucobet.ucobet_generales.domain.city.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.domain.DomainRule;

@Service
public interface CityIdDoesNotExistRule extends DomainRule<UUID> {

}
