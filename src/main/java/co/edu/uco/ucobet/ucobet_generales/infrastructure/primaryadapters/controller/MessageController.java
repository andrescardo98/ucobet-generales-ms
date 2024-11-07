package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller;

import co.edu.uco.ucobet.ucobet_generales.application.usecase.message.MessageUseCase;
import co.edu.uco.ucobet.ucobet_generales.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/general/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
    private final MessageUseCase messageUseCase;

    @PostMapping
    public ResponseEntity<Message> createMessage(@RequestBody Message message){
        return ResponseEntity.ok(messageUseCase.saveMessage(message));
    }

    @GetMapping
    public ResponseEntity<List<Message>> getAllMessages(){
        try {
            List<Message> messages = messageUseCase.getAllMessages();
            return ResponseEntity.ok(messages);
        } catch (final Exception exception){
            throw new RuntimeException("Error al obtener mensajes", exception);
        }

    }
}
