package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.UcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.response.CityResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general/api/v1/cities")
public class RegisterNewCityController {

    private RegisterNewCityInteractor registerNewCityInteractor;

    public RegisterNewCityController(final RegisterNewCityInteractor registerNewCityInteractor) {
        this.registerNewCityInteractor = registerNewCityInteractor;
    }

    public ResponseEntity<CityResponse> crear(@RequestBody RegisterNewCityDTO dto){
        var httpStatusCode = HttpStatus.CREATED;
        var cityResponse = new CityResponse();

        try {
            registerNewCityInteractor.execute(dto);
            cityResponse.getMensajes().add("La ciudad fue registrada exitosamente");

        }catch (final UcobetException exception){
            httpStatusCode = HttpStatus.BAD_REQUEST;
            cityResponse.getMensajes().add(exception.getUserMessage());

        }catch (final Exception exception){
            httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
            var userMessage = "Se ha presentado un problema tratando de registrar la nueva ciudad";
            cityResponse.getMensajes().add(userMessage);
        }

        return new ResponseEntity<>(cityResponse, httpStatusCode);
    }

    public RegisterNewCityDTO executeDummy(){
        return RegisterNewCityDTO.create("Rionegro", UUIDHelper.generate());
    }
}
