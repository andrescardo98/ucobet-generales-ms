package co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.ucobet_generales.domain.state.StateDomain;

import java.util.UUID;

public class CityDTO {
	private UUID id;
	private String name;

	public CityDTO() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}

	public CityDTO(UUID id, String name) {
		setId(id);
		setName(name);
	}

	public static CityDTO create () {
		return new CityDTO();

	}
	public static CityDTO create(UUID id, String name) {
		return new CityDTO(id, name);

	}
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = TextHelper.applyTrim(name);
	}

}
