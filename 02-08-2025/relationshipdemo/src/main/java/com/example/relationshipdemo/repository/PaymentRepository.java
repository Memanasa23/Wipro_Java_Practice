package com.example.relationshipdemo.repository;

import com.example.relationshipdemo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
