package co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper;

import java.util.UUID;

import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

public interface RegisterNewCityMapper {
	
	RegisterNewCityMapper INSTANCE = Mappers.getMapper(RegisterNewCityMapper.class);
	
	@Mapping(source = "cityName", target = "name")
	@Mapping(source = "stateId", target = "state", qualifiedByName = "mapToStateDomain")
	CityDomain toDomain(RegisterNewCityDTO dto);
	
	@Named("mapToStateDomain")
	default StateDomain mapToStateDomain(UUID stateId) {
		return new StateDomain(stateId, null, null);
	}

}
