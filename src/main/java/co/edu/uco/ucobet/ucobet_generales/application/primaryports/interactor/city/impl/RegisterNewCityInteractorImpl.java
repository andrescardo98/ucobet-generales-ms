package co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.mapper.RegisterNewCityMapper;
import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCity;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class RegisterNewCityInteractorImpl implements RegisterNewCityInteractor {

	private RegisterNewCity registerNewCity;
	
	public RegisterNewCityInteractorImpl(final RegisterNewCity registerNewCity) {
		super();
		this.registerNewCity = registerNewCity;
	}

	@Override
	public void execute(final RegisterNewCityDTO data) {
		//DataMapper -> DTO -> Domain
		final var CityDomain = RegisterNewCityMapper.INSTANCE.toDomain(data);
		registerNewCity.execute(CityDomain);
	}

}
