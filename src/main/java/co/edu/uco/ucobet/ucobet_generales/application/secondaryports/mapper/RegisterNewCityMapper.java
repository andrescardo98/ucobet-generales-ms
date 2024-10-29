package co.edu.uco.ucobet.ucobet_generales.application.secondaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.entity.RegisterNewCityEntity;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;

@Mapper
public interface RegisterNewCityMapper {

	RegisterNewCityMapper INSTANCE = Mappers.getMapper(RegisterNewCityMapper.class);

	CityDomain entityToDomain(RegisterNewCityEntity entity);

	RegisterNewCityEntity domainToEntity(CityDomain domain);

	List<RegisterNewCityEntity> domainToEntityCollection(List<CityDomain> domainCollection);

	List<CityDomain> entityToDomainCollection(List<RegisterNewCityEntity> entityCollection);

}
