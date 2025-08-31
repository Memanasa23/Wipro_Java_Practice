package com.example.rider.repository;

import com.example.rider.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookingRepository extends JpaRepository<Booking, Long> {
	
}
