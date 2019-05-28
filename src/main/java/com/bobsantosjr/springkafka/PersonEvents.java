package com.bobsantosjr.springkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PersonEvents {

    private static final Logger logger = LoggerFactory.getLogger(PersonEvents.class);

    @KafkaListener(topics = "${kafka.topics.person}")
    public void handle(String message) {
        logger.info("Received message: {}", message);
    }
}
