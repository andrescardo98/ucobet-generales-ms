package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.response;

import java.util.ArrayList;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CityDTO;

public class CityResponse extends Response<CityDTO> {
	
	public CityResponse() {
		setMensajes(new ArrayList<>());
		
		setDato(new ArrayList<>());
		
	}

}
