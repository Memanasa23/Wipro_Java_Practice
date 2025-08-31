package com.example.payment_ms.kafka;

import com.example.order_ms.entity.Order;
import com.example.payment_ms.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {

    @Autowired
    private PaymentService paymentService;

    @KafkaListener(topics = "order-created", groupId = "payment-group")
    public void consumeOrderCreated(Order order) {
        paymentService.processPayment(order.getId());
    }
}
