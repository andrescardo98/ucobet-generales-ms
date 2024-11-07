package co.edu.uco.ucobet.ucobet_generales.infrastructure.secondaryadapters;

import co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository.MessageRepository;
import co.edu.uco.ucobet.ucobet_generales.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class RedisMessageRepository implements MessageRepository {

    private final RedisTemplate<String, Message> redisTemplate;
    private static final String KEY_PREFIX = "message:";
    private static final String CITY_PREFIX = "city:";

    @Override
    public Message save(Message message) {
        if (message.getId() == null){
            message.setId(UUID.randomUUID().toString());
        }
        String messageKey = KEY_PREFIX + message.getId();
        String cityKey = CITY_PREFIX + message.getCityId();

        redisTemplate.opsForValue().set(messageKey, message);
        redisTemplate.opsForSet().add(cityKey, message);

        return message;
    }

    @Override
    public List<Message> findByCityId(String cityId) {
        String cityKey = CITY_PREFIX + cityId;
        return redisTemplate.opsForSet().members(cityKey).
                stream().collect(Collectors.toList());
    }

    @Override
    public void delete(String id) {
        String messageKey = KEY_PREFIX + id;
        Message message = redisTemplate.opsForValue().get(messageKey);
        if (message != null){
            String cityKey = CITY_PREFIX + message.getCityId();
            redisTemplate.opsForSet().remove(cityKey, message);
            redisTemplate.delete(messageKey);
        }
    }

    @Override
    public List<Message> findAll() {
        try {
            Set<String> keys = redisTemplate.keys(KEY_PREFIX + "*");
            if (keys == null || keys.isEmpty()) {
                return new ArrayList<>();
            }

            return keys.stream()
                    .map(key -> redisTemplate.opsForValue().get(key))
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener mensajes", e);
        }
    }
}
