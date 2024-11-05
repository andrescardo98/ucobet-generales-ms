package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RecoverStateDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.state.RecoverStateInteractor;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.UcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;
import co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.response.StateResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general/api/v1/states")
@CrossOrigin(origins = "http:localhost:4200")
public class RecoverStateController {

    private final RecoverStateInteractor recoverStateInteractor;

    public RecoverStateController(RecoverStateInteractor recoverStateInteractor) {
        this.recoverStateInteractor = recoverStateInteractor;
    }

    @GetMapping
    public ResponseEntity<StateResponse> consultar(){
        var httpStatusCode = HttpStatus.ACCEPTED;
        var stateResponse = new StateResponse();

        try {
            var stateDTO = RecoverStateDTO.create();
            stateResponse.setDato(recoverStateInteractor.execute(stateDTO));
            stateResponse.getMensajes().add(MessageCatalog.getMessageContent(MessageCode.M0000000020));

        } catch (final UcobetException exception){
            httpStatusCode = HttpStatus.BAD_REQUEST;
            stateResponse.getMensajes().add(MessageCatalog.getMessageContent(MessageCode.M0000000021));
            exception.printStackTrace();
        } catch (final Exception exception){
            httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
            var userMessage = MessageCatalog.getMessageContent(MessageCode.M0000000022);
            stateResponse.getMensajes().add(userMessage);
            exception.printStackTrace();

        }
        return new ResponseEntity<>(stateResponse, httpStatusCode);
    }
}
