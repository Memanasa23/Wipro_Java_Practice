package com.example.uber.kafka;

import com.example.uber.model.UberBooking;
import com.example.uber.repository.UberBookingRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;

@Component
public class UberKafkaService {
    private final UberBookingRepository repo;
    private final KafkaTemplate<String, Object> kafkaTemplate;
    public static final String TOPIC_BACK = "U2R";

    public UberKafkaService(UberBookingRepository repo, KafkaTemplate<String,Object> kafkaTemplate) {
        this.repo = repo;
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "R2U", groupId = "uber-group")
    public void handleBooking(Map<String, Object> message) {
        
        Long riderBookingId = Long.valueOf(String.valueOf(message.get("riderBookingId")));
        String riderName = (String) message.get("riderName");
        String fromLoc = (String) message.get("fromLocation");
        String toLoc = (String) message.get("toLocation");

        
        UberBooking ub = UberBooking.builder()
                .riderBookingId(riderBookingId)
                .riderName(riderName)
                .fromLocation(fromLoc)
                .toLocation(toLoc)
                .status("ACCEPTED")
                .build();
        ub = repo.save(ub);

        
        Map<String, Object> statusMsg = new HashMap<>();
        statusMsg.put("riderBookingId", riderBookingId);
        statusMsg.put("status", "ACCEPTED");
        statusMsg.put("uberBookingId", ub.getId());
        kafkaTemplate.send(TOPIC_BACK, String.valueOf(riderBookingId), statusMsg);
    }
}
