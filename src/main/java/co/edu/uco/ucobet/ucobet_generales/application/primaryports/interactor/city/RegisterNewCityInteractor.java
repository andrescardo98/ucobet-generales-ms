package co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.InteractorWithoutReturn;
import jakarta.transaction.Transactional;

@Service
@Transactional //Solo se usa para bases de datos SQL
public interface RegisterNewCityInteractor extends InteractorWithoutReturn<RegisterNewCityDTO> {

}
