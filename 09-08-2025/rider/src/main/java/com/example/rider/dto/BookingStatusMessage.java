package com.example.rider.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingStatusMessage {
    private Long riderBookingId; 
    private String status;       
    private String uberBookingId; 
}

