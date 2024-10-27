package co.edu.uco.ucobet.ucobet_generales.domain;

import java.util.UUID;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;

public class Domain {
	
	private UUID id;
	private String idAsString;


	protected Domain (final UUID id) {
		setId(id);
	}

	public final UUID getId() {
		return UUIDHelper.isDefault(id) ? UUIDHelper.convertToUUID(idAsString):id;
	}

	private final void setId(UUID id) {
		this.id = id;
	}
	
	
	public String getIdAsString() {
		return idAsString;
	}

	public void setIdAsString(String idAsString) {
		this.idAsString = idAsString;
	}
	
	public void generateId() {
		this.id = UUIDHelper.generate();
	}

}
