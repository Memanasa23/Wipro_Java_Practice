package com.example.KafkaConsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "learn-subject", groupId = "learn-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
