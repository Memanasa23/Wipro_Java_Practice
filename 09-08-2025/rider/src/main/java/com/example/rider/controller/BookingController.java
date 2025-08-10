package com.example.rider.controller;

import com.example.rider.dto.BookingRequest;
import com.example.rider.kafka.RiderKafkaProducer;
import com.example.rider.model.Booking;
import com.example.rider.repository.BookingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ride")
public class BookingController {
    private final BookingRepository bookingRepository;
    private final RiderKafkaProducer producer;

    public BookingController(BookingRepository bookingRepository, RiderKafkaProducer producer) {
        this.bookingRepository = bookingRepository;
        this.producer = producer;
    }

    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody BookingRequest request) {
        Booking booking = Booking.builder()
                .riderName(request.getRiderName())
                .fromLocation(request.getFromLocation())
                .toLocation(request.getToLocation())
                .status("PENDING")
                .build();
        booking = bookingRepository.save(booking);

        
        producer.sendBooking(request, booking.getId());

        return ResponseEntity.ok().body(booking);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBooking(@PathVariable Long id) {
        return bookingRepository.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
