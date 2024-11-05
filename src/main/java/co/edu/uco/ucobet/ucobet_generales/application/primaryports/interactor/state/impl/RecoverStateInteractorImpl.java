package co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.state.impl;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RecoverStateDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.state.RecoverStateInteractor;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper.StateDTOMapper;
import co.edu.uco.ucobet.ucobet_generales.application.usecase.state.RecoverState;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RecoverStateInteractorImpl implements RecoverStateInteractor {

	private RecoverState recoverState;

	public RecoverStateInteractorImpl(RecoverState recoverState) {
		this.recoverState = recoverState;
	}

	@Override
	public List<RecoverStateDTO> execute(RecoverStateDTO data) {
		var stateDomain = StateDTOMapper.INSTANCE.dtoToDomain(data);
		var result = recoverState.execute(stateDomain);

		return StateDTOMapper.INSTANCE.domainToDtoCollection(result);
	}
}
