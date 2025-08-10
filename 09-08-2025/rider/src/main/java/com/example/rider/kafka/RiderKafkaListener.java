package com.example.rider.kafka;


import com.example.rider.model.Booking;
import com.example.rider.repository.BookingRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
public class RiderKafkaListener {
    private final BookingRepository bookingRepository;
    public static final String TOPIC = "U2R";

    public RiderKafkaListener(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @KafkaListener(topics = TOPIC, groupId = "rider-group")
    public void listen(Map<String, Object> message) {
        
        Long riderBookingId = Long.valueOf(String.valueOf(message.get("riderBookingId")));
        String status = (String) message.get("status");
        String uberBookingId = message.get("uberBookingId") != null ? String.valueOf(message.get("uberBookingId")) : null;

        Optional<Booking> opt = bookingRepository.findById(riderBookingId);
        if (opt.isPresent()) {
            Booking b = opt.get();
            b.setStatus(status);
            b.setUberBookingId(uberBookingId);
            bookingRepository.save(b);
        } else {
            
            System.out.println("Received update for unknown booking id: " + riderBookingId);
        }
    }
}
