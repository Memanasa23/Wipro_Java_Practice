package com.example.rider.kafka;

import com.example.rider.dto.BookingRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class RiderKafkaProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;
    public static final String TOPIC = "R2U";

    public RiderKafkaProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendBooking(BookingRequest request, Long bookingId) {
        
        var payload = new java.util.HashMap<String,Object>();
        payload.put("riderBookingId", bookingId);
        payload.put("riderName", request.getRiderName());
        payload.put("fromLocation", request.getFromLocation());
        payload.put("toLocation", request.getToLocation());
        kafkaTemplate.send(TOPIC, String.valueOf(bookingId), payload);
    }
}
