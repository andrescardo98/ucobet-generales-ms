package co.edu.uco.ucobet.ucobet_generales.application.secondaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.entity.CityEntity;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;

@Mapper
public interface CityEntityMapper {
	
	CityEntityMapper INSTANCE = Mappers.getMapper(CityEntityMapper.class );
	
	CityEntity toEntity(CityDomain cityDomain);
	
	CityDomain toDomain(CityEntity cityEntity);
	
	List<CityEntity> toEntityList(List<CityDomain> domainList);
	
	List<CityDomain> toDomainList(List<CityEntity> entityList);
	

}
