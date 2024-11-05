package co.edu.uco.ucobet.ucobet_generales.application.usecase.state;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.UseCaseWithReturn;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

import java.util.List;

public interface RecoverState extends UseCaseWithReturn<StateDomain, List<StateDomain>> {
}
