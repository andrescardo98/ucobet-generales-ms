package co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor;

public interface InteractorWithReturn<T, R> {

	R excecute(T data);
}
