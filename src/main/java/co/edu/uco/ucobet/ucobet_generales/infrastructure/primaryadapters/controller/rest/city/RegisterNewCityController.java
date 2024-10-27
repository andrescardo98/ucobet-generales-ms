package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.rest.city;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.UcobetException;
import co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.response.CityResponse;

@RestController
@RequestMapping("/general/api/v1/cities")
public class RegisterNewCityController {
	
	private RegisterNewCityInteractor registerNewCityInteractor;
	
	public RegisterNewCityController(final RegisterNewCityInteractor registerNewCityInteractor) {
		super();
		this.registerNewCityInteractor = registerNewCityInteractor;
	}

	@PostMapping
	public ResponseEntity<CityResponse> create(@RequestBody RegisterNewCityDTO dto) {
		
		CityResponse response = new CityResponse();
		var httpCode = HttpStatus.CREATED;
		
		try {
			registerNewCityInteractor.execute(dto);
			response.getMensajes().add("La ciudad ha sido registrada exitosamente");
			
		} catch (final UcobetException exception) {
			httpCode = HttpStatus.BAD_REQUEST;
			response.getMensajes().add(exception.getUserMessage());
		} catch (final Exception exception) {
			httpCode = HttpStatus.INTERNAL_SERVER_ERROR;
			var userMessage = "Se ha presentado un problema tratando de registrar la nueva ciudad";
			response.getMensajes().add(userMessage);
		}
	
		return new ResponseEntity<>(response, httpCode);
	}

}
