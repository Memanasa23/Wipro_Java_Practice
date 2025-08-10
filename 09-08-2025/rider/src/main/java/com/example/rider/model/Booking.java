package com.example.rider.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String riderName;
    private String fromLocation;
    private String toLocation;

    
    private String status;
    private String uberBookingId; 
}
