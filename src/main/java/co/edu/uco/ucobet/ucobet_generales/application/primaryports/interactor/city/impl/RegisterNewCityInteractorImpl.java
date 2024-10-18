package co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.impl;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.application.usecase.city.RegisterNewCity;
import co.edu.uco.ucobet.ucobet_generales.domain.city.CityDomain;

public class RegisterNewCityInteractorImpl implements RegisterNewCityInteractor {

	private RegisterNewCity registerNewCity;
	
	public RegisterNewCityInteractorImpl(final RegisterNewCity registerNewCity) {
		super();
		this.registerNewCity = registerNewCity;
	}

	@Override
	public void execute(final RegisterNewCityDTO data) {
		//DataMapper -> DTO -> Domain
		final var CityDomain = new CityDomain(null, null, null);
		
		registerNewCity.execute(CityDomain);
	}

}
