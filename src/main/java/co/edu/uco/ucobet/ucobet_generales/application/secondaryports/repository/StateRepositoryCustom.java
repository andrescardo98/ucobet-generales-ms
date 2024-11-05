package co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.entity.StateEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepositoryCustom {
    List<StateEntity> findByFilter(StateEntity filter);
}
