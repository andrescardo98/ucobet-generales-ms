package co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

public class CityDTO {
	
	private String name;
	private StateDomain state;
	
	
	public CityDTO(final String name, final StateDomain state) {
		super();
		this.name = name;
		this.state = state;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = TextHelper.getDefault(name);
	}
	public StateDomain getState() {
		return state;
	}
	public void setState(StateDomain state) {
		this.state = state;
	}
	
	

}
