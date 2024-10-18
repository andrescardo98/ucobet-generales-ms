package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.rest.city;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RegisterNewCityInteractor;

@RestController
@RequestMapping("/general/api/v1/cities")
public class RegisterNewCityController {
	
	private RegisterNewCityInteractor registerNewCityInteractor;
	
	public RegisterNewCityController(final RegisterNewCityInteractor registerNewCityInteractor) {
		super();
		this.registerNewCityInteractor = registerNewCityInteractor;
	}

	@PostMapping
	public RegisterNewCityDTO execute(@RequestBody RegisterNewCityDTO dto) {
		registerNewCityInteractor.execute(dto);
		
		//Cuidado aquí: Recuerde definir el servicio siguiendo buenas prácticas y asegurando que se retornen los mensajes 
		//y codigos HHTPS adecuados, garantizando que la estrategia REST está orientada a la buena práctica.
		
		return dto;
	}

}
