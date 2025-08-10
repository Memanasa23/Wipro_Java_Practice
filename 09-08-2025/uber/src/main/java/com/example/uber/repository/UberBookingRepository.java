package com.example.uber.repository;

import com.example.uber.model.UberBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UberBookingRepository extends JpaRepository<UberBooking, Long> {}
