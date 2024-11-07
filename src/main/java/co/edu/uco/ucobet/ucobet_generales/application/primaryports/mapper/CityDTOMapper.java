package co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CityDTO;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;

@Mapper
public interface CityDTOMapper {

	CityDTOMapper INSTANCE = Mappers.getMapper(CityDTOMapper.class);

	CityDomain dtoToDomain(CityDTO dto);

	CityDTO domainToDto(CityDomain domain);

	List<CityDTO> domainToDtoCollection(List<CityDomain> domainCollection);

	List<CityDomain> dtoToDomainCollection(List<CityDTO> entityCollection);

}
