package co.edu.uco.ucobet.ucobet_generales.domain;

public interface DomainRule<T> {
	
	void validate(T data);

}
