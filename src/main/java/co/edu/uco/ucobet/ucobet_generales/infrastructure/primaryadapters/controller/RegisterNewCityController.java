package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RecoverCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.UcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;
import co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.response.CityResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/general/api/v1/cities")
public class RegisterNewCityController {

    private RegisterNewCityInteractor registerNewCityInteractor;
    private RecoverCityInteractor recoverCityInteractor;

    public RegisterNewCityController(final RegisterNewCityInteractor registerNewCityInteractor) {
        this.registerNewCityInteractor = registerNewCityInteractor;
    }

    @PostMapping
    public ResponseEntity<CityResponse> crear(@RequestBody RegisterNewCityDTO dto){
        var httpStatusCode = HttpStatus.CREATED;
        var cityResponse = new CityResponse();

        try {
            registerNewCityInteractor.execute(dto);
            cityResponse.getMensajes().add(MessageCatalog.getMessageContent(MessageCode.M0000000018));

        }catch (final UcobetException exception){
            httpStatusCode = HttpStatus.BAD_REQUEST;
            cityResponse.getMensajes().add(exception.getUserMessage());

        }catch (final Exception exception){
            httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
            var userMessage = MessageCatalog.getMessageContent(MessageCode.M0000000019);
            cityResponse.getMensajes().add(userMessage);
        }

        return new ResponseEntity<>(cityResponse, httpStatusCode);
    }

    @GetMapping
    public RegisterNewCityDTO executeDummy(){
        return RegisterNewCityDTO.create("Rionegro", UUIDHelper.generate());
    }
}
