package co.edu.uco.ucobet.ucobet_generales.domain.city.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.domain.DomainRule;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

@Service
public interface CityStateDoesExistRule extends DomainRule<StateDomain> {

}
