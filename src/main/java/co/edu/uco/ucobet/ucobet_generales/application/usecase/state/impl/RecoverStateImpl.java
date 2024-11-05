package co.edu.uco.ucobet.ucobet_generales.application.usecase.state.impl;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.mapper.StateEntityMapper;
import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.StateRepository;
import co.edu.uco.ucobet.ucobet_generales.application.usecase.state.RecoverState;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecoverStateImpl implements RecoverState {
    private StateRepository stateRepository;

    public RecoverStateImpl(final StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public List<StateDomain> execute(StateDomain domain) {
        var stateEntity = StateEntityMapper.INSTANCE.domainToEntity(domain);
        var resultadosEntity = stateRepository.findByFilter(stateEntity);

        return StateEntityMapper.INSTANCE.entityToDomainCollection(resultadosEntity);
    }
}
