package com.example.payment_ms.service;

import com.example.order_ms.entity.Order;
import com.example.payment_ms.client.OrderClient;
import com.example.payment_ms.entity.Payment;
import com.example.payment_ms.repository.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private OrderClient orderClient;

    public Payment processPayment(Long orderId) {
        Order order = orderClient.getOrderById(orderId);

        Payment payment = new Payment();
        payment.setOrderId(orderId);
        payment.setAmount(order.getTotalAmount());

        boolean success = Math.random() > 0.2; 
        payment.setStatus(success ? "SUCCESS" : "FAILED");
        payment.setTransactionId(UUID.randomUUID().toString());

        Payment savedPayment = paymentRepository.save(payment);

        String newStatus = success ? "PAID" : "PAYMENT_FAILED";
        orderClient.updateOrderStatus(orderId, newStatus);

        return savedPayment;
    }

    public Payment getPaymentByOrderId(Long orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
}
