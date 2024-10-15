package co.edu.uco.ucobet.ucobet_generales.application.secondaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.entity.CountryEntity;
import co.edu.uco.ucobet.ucobet_generales.domain.country.CountryDomain;

@Mapper
public interface CountryEntityMapper {
	
	CountryEntityMapper INSTANCE = Mappers.getMapper(CountryEntityMapper.class );
	
	CountryEntity toEntity(CountryDomain cityDomain);
	
	CountryDomain toDomain(CountryEntity cityEntity);
	
	List<CountryEntity> toEntityList(List<CountryDomain> domainList);
	
	List<CountryDomain> toDomainList(List<CountryEntity> entityList);
	

}
