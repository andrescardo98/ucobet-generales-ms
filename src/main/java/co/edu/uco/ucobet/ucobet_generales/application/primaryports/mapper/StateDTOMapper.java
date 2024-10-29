package co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.StateDTO;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

@Mapper

public interface StateDTOMapper {

	StateDTOMapper INSTANCE = Mappers.getMapper(StateDTOMapper.class);

	StateDomain dtoToDomain(StateDTO dto);

	StateDTO domainToDto(StateDomain domain);

	List<StateDTO> domainToDtoCollection(List<StateDomain> domainCollection);

	List<StateDomain> dtoToDomainCollection(List<StateDTO> entityCollection);

}