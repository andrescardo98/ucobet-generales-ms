package co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CountryDTO;
import co.edu.uco.ucobet.ucobet_generales.domain.country.CountryDomain;

public interface CountryDTOMapper {
	CountryDTOMapper INSTANCE = Mappers.getMapper(CountryDTOMapper.class);
	
	CountryDTO toDto(CountryDomain domain);
	
	CountryDomain toDomain(CountryDTO dto);
	
	List<CountryDTO> toDTOList(List<CountryDomain> domainList);
	
	List<CountryDomain> toDomainList(List<CountryDTO> DTOList);

}
