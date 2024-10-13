package co.edu.uco.ucobet.ucobet_generales.domain.state.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.domain.DomainRule;
import co.edu.uco.ucobet.ucobet_generales.domain.country.CountryDomain;

@Service
public interface StateNameForCountryDoesNotExistRule extends DomainRule<CountryDomain> {

}
