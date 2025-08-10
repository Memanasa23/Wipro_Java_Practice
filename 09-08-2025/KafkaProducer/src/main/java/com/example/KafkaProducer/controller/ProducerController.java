package com.example.KafkaProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.example.KafkaProducer.model.Subject;

//@RestController
//@RequestMapping("/produce")
//public class ProducerController {
//
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    private static final String TOPIC = "learn-subject";
//
//    @GetMapping("/{message}")
//    public String sendMessage(@PathVariable String message) {
//        kafkaTemplate.send(TOPIC, message);
//        return "Message sent to Kafka topic: " + message;
//    }

@RestController
@RequestMapping("/learn")
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, Subject> kafkaTemplate;

    private static final String TOPIC = "learn-subject";

    @PostMapping
    public String sendMessage(@RequestBody Subject subject) {
        kafkaTemplate.send(TOPIC, subject);
        return "Subject sent to Kafka: " + subject;
    }
}

