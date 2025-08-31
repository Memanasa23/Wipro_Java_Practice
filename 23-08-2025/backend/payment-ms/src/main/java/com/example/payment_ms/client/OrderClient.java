package com.example.payment_ms.client;

import com.example.order_ms.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "order-service")
public interface OrderClient {
    @GetMapping("/api/order/{id}")
    Order getOrderById(@PathVariable Long id);

    @PutMapping("/api/order/{id}/status")
    Order updateOrderStatus(@PathVariable Long id, @RequestBody String status);
}