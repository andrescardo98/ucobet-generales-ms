package co.edu.uco.ucobet.ucobet_generales.application.secondaryports.entity;

import java.util.UUID;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "City")
public final class CityEntity{
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	private StateEntity state;
	
	public CityEntity() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
		setState(StateEntity.create());
	}
	
	public CityEntity(UUID id, String name, StateEntity state) {
		setId(id);
		setName(name);
		setState(state);
	}
	
	static final CityEntity create() {
		return new CityEntity();
	}
	
	public static final CityEntity create(final UUID id, final String name, final StateEntity state) {
		return new CityEntity(id, name, state);
	}
	
	public static final CityEntity create(final UUID id) {
		return new CityEntity(id, TextHelper.EMPTY, StateEntity.create());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateEntity getState() {
		return state;
	}

	public void setState(StateEntity state) {
		this.state = state;
	}
	
	
	}
