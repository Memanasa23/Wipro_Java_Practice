package com.example.rider.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookingRequest {
    private String riderName;
    private String fromLocation;
    private String toLocation;
}
