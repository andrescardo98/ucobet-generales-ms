package co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper;

import java.util.List;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RecoverStateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

@Mapper

public interface StateDTOMapper {

	StateDTOMapper INSTANCE = Mappers.getMapper(StateDTOMapper.class);

	StateDomain dtoToDomain(RecoverStateDTO dto);

	RecoverStateDTO domainToDto(StateDomain domain);

	List<RecoverStateDTO> domainToDtoCollection(List<StateDomain> domainCollection);

	List<StateDomain> dtoToDomainCollection(List<RecoverStateDTO> entityCollection);

}