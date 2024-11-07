package co.edu.uco.ucobet.ucobet_generales.application.usecase.message;

import co.edu.uco.ucobet.ucobet_generales.domain.Message;

import java.util.List;

public interface MessageUseCase {
    Message saveMessage(Message message);
    List<Message> getMessagesByCity(String cityId);
    List<Message> getAllMessages();
}
