package co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.impl;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RecoverCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper.CityDTOMapper;
import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RecoverCity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RecoverCityInteractorImpl implements RecoverCityInteractor {

    public RecoverCity recoverCity;

    public RecoverCityInteractorImpl(RecoverCity recoverCity) {
        this.recoverCity = recoverCity;
    }

    @Override
    public List<CityDTO> execute(CityDTO data) {
        var cityDomain = CityDTOMapper.INSTANCE.dtoToDomain(data);
        var resultados = recoverCity.execute(cityDomain);
        return CityDTOMapper.INSTANCE.domainToDtoCollection(resultados);
    }
}
