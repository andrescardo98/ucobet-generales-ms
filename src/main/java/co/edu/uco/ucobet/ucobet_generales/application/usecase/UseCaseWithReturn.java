package co.edu.uco.ucobet.ucobet_generales.application.usecase;

public interface UseCaseWithReturn <D,R>{
	R execute(D domain);

}
