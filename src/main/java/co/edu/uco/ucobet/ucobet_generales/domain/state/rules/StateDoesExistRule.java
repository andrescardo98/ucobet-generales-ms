package co.edu.uco.ucobet.ucobet_generales.domain.state.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.domain.DomainRule;

@Service
public interface StateDoesExistRule extends DomainRule<UUID> {

}
