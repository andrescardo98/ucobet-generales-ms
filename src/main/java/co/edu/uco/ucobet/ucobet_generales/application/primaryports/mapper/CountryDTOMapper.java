package co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CountryDTO;
import co.edu.uco.ucobet.ucobet_generales.domain.country.CountryDomain;

@Mapper

public interface CountryDTOMapper {

	CountryDTOMapper INSTANCE = Mappers.getMapper(CountryDTOMapper.class);

	CountryDomain dtoToDomain(CountryDTO dto);

	CountryDTO domainToDto(CountryDomain domain);

	List<CountryDTO> domainToDtoCollection(List<CountryDomain> domainCollection);

	List<CountryDomain> dtoToDomainCollection(List<CountryDTO> entityCollection);

}
