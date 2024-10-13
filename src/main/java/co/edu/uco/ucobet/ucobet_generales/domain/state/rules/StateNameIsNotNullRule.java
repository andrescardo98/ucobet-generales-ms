package co.edu.uco.ucobet.ucobet_generales.domain.state.rules;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.domain.DomainRule;

@Service
public interface StateNameIsNotNullRule extends DomainRule<String> {

}
