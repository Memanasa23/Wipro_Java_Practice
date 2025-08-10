package com.example.relationshipdemo.service;

import com.example.relationshipdemo.entity.Payment;
import com.example.relationshipdemo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }

    public Optional<Payment> getById(Long id) {
        return paymentRepository.findById(id);
    }

    public Payment update(Long id, Payment updatedPayment) {
        return paymentRepository.findById(id).map(existing -> {
            existing.setPaymentMode(updatedPayment.getPaymentMode());
            existing.setAmount(updatedPayment.getAmount());
            existing.setDescription(updatedPayment.getDescription());
            return paymentRepository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Payment not found"));
    }

    public void delete(Long id) {
        paymentRepository.deleteById(id);
    }
}

