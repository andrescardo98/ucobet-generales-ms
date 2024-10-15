package co.edu.uco.ucobet.ucobet_generales.application.secondaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.entity.StateEntity;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

@Mapper
public interface StateEntityMapper {
	
	StateEntityMapper INSTANCE = Mappers.getMapper(StateEntityMapper.class );
	
	StateEntity toEntity(StateDomain cityDomain);
	
	StateDomain toDomain(StateEntity cityEntity);
	
	List<StateEntity> toEntityList(List<StateDomain> domainList);
	
	List<StateDomain> toDomainList(List<StateEntity> entityList);
	

}
