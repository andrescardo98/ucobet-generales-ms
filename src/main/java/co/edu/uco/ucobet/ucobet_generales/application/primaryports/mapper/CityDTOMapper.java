package co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CityDTO;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;

public interface CityDTOMapper {
	CityDTOMapper INSTANCE = Mappers.getMapper(CityDTOMapper.class);
	
	CityDTO toDto(CityDomain domain);
	
	CityDomain toDomain(CityDTO dto);
	
	List<CityDTO> toDTOList(List<CityDomain> domainList);
	
	List<CityDomain> toDomainList(List<CityDTO> DTOList);

}
