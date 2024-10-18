package co.edu.uco.ucobet.ucobet_generales.application.usecase;

public interface UseCaseWithoutReturn<D> {

	void execute(D domain);
}
