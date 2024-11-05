package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.response;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RecoverStateDTO;

import java.util.ArrayList;

public class StateResponse extends Response<RecoverStateDTO> {

	public StateResponse() {
		setMensajes(new ArrayList<>());
		
		setDato(new ArrayList<>());
		
	}

}
