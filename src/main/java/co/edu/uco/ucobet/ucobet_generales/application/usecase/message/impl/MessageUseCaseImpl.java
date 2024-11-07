package co.edu.uco.ucobet.ucobet_generales.application.usecase.message.impl;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.MessageRepository;
import co.edu.uco.ucobet.ucobet_generales.application.usecase.message.MessageUseCase;
import co.edu.uco.ucobet.ucobet_generales.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MessageUseCaseImpl implements MessageUseCase {

    private final MessageRepository messageRepository;

    @Override
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getMessagesByCity(String cityId) {
        return messageRepository.findByCityId(cityId);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
