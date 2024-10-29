package co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor;

import org.springframework.stereotype.Service;

@Service
public interface InteractorWithoutReturn <T>{
	void execute(T data);

}
