package co.edu.uco.ucobet.ucobet_generales.domain.notification;

import co.edu.uco.ucobet.ucobet_generales.crosscutting.exception.DomainUcobetException;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.MessageCatalog;
import co.edu.uco.ucobet.ucobet_generales.crosscutting.messages.enumerator.MessageCode;
import co.edu.uco.ucobet.ucobet_generales.domain.city.exception.CityIdIsNullException;

public class EmailNotificationException extends DomainUcobetException {

    private static final long serialVersionUID = 1L;

    public EmailNotificationException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final EmailNotificationException create() {
        var userMessage = MessageCatalog.getMessageContent(MessageCode.M0000000023);
        return new EmailNotificationException(userMessage);
    }
}
