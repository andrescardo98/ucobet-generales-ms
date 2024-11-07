package co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository;
;
import co.edu.uco.ucobet.ucobet_generales.domain.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository {
    Message save(Message message);
    List<Message> findByCityId(String cityId);
    void delete(String id);
    List<Message> findAll();
}
