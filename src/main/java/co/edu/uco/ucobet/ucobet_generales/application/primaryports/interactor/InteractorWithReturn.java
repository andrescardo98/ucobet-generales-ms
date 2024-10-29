package co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor;

import org.springframework.stereotype.Service;

@Service
public interface InteractorWithReturn <T, R>{
	R execute(T data);

}
