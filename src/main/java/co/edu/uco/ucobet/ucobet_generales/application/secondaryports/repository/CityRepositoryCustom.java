package co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.entity.CityEntity;

@Repository

public interface CityRepositoryCustom {

	List<CityEntity> findByFilter(CityEntity filter);

	boolean isCityBeingUsed(UUID cityId);
	boolean existsByName(String name);

}