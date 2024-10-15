package co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.StateDTO;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

public interface StateDTOMapper {
	StateDTOMapper INSTANCE = Mappers.getMapper(StateDTOMapper.class);
	
	StateDTO toDto(StateDomain domain);
	
	StateDomain toDomain(StateDTO dto);
	
	List<StateDTO> toDTOList(List<StateDomain> domainList);
	
	List<StateDomain> toDomainList(List<StateDTO> DTOList);

}
