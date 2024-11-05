package co.edu.uco.ucobet.ucobet_generales.application.usecase.city.impl;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.mapper.CityEntityMapper;
import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.CityRepository;
import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RecoverCity;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecoverCityImpl implements RecoverCity {

    private CityRepository cityRepository;

    public RecoverCityImpl(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<CityDomain> execute(CityDomain domain) {
        var cityEntity = CityEntityMapper.INSTANCE.domainToEntity(domain);
        var resultadosEntity = cityRepository.findByFilter(cityEntity);
        return CityEntityMapper.INSTANCE.entityToDomainCollection(resultadosEntity);
    }
}
