package com.example.uber.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="uber_bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UberBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long riderBookingId; 
    private String riderName;
    private String fromLocation;
    private String toLocation;
    private String status; 
}
