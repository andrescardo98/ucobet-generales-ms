package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	
	private List<String> mensajes = new ArrayList<>();
	private List<T> dato;
	
	
	public List<String> getMensajes() {
		return mensajes;
	}
	public void setMensajes(List<String> mensajes) {
		this.mensajes = mensajes;
	}
	public List<T> getDato() {
		return dato;
	}
	public void setDato(List<T> dato) {
		this.dato = dato;
	}
	
	

}
