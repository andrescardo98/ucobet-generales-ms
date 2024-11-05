package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller;

import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.CityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.dto.RegisterNewCityDTO;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RecoverCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.application.primaryports.interactor.city.RegisterNewCityInteractor;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.UcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;
import co.edu.uco.ucobet.ucobet_generales.domain.notification.EmailNotificationService;
import co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller.response.CityResponse;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/general/api/v1/cities")
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterNewCityController {

    private RegisterNewCityInteractor registerNewCityInteractor;
    private RecoverCityInteractor recoverCityInteractor;
    private EmailNotificationService emailNotificationService;

    public RegisterNewCityController(final RegisterNewCityInteractor registerNewCityInteractor,
                                     final RecoverCityInteractor recoverCityInteractor,
                                     final EmailNotificationService emailNotificationService) {
        this.registerNewCityInteractor = registerNewCityInteractor;
        this.recoverCityInteractor = recoverCityInteractor;
        this.emailNotificationService = emailNotificationService;
    }

    @PostMapping
    public ResponseEntity<CityResponse> crear(@RequestBody RegisterNewCityDTO dto){
        var httpStatusCode = HttpStatus.CREATED;
        var cityResponse = new CityResponse();

        try {
            registerNewCityInteractor.execute(dto);
            cityResponse.getMensajes().add(MessageCatalog.getMessageContent(MessageCode.M0000000018));
            emailNotificationService.sendCityCreationNotification(dto.getCityName());

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
    public ResponseEntity<CityResponse> consultar() {
        var httpStatusCode = HttpStatus.ACCEPTED;
        var cityResponse = new CityResponse();
        try {
            var cityDto = CityDTO.create();
            cityResponse.setDato(recoverCityInteractor.execute(cityDto));
            cityResponse.getMensajes().add("Ciudad consultada exitosamente");
        } catch (final UcobetException exception) {
            httpStatusCode = HttpStatus.BAD_REQUEST;
            cityResponse.getMensajes().add("ERROR");
            exception.printStackTrace();

        } catch (final Exception exception) {
            httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
            var mensajeUsusario = "ERROR EXCEPTION";
            cityResponse.getMensajes().add(mensajeUsusario);
            exception.printStackTrace();
        }
        return new ResponseEntity<>(cityResponse, httpStatusCode);
    }
}
