package com.example.order_ms.service;

import com.example.order_ms.client.FoodClient;
import com.example.order_ms.dto.OrderRequest;
import com.example.order_ms.entity.Order;
import com.example.order_ms.entity.OrderItem;
import com.example.order_ms.repository.OrderRepository;
import com.example.FoodService.entity.Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private FoodClient foodClient;

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public Order createOrder(OrderRequest request) {
        Order order = new Order();
        order.setUserId(request.getUserId());
        order.setDeliveryAddress(request.getDeliveryAddress());

        List<OrderItem> items = new ArrayList<>();
        BigDecimal total = BigDecimal.ZERO;

        for (OrderRequest.OrderItemRequest itemReq : request.getItems()) {
            Food food = foodClient.getFoodById(itemReq.getFoodId());
            OrderItem item = new OrderItem();
            item.setFoodId(food.getId());
            item.setFoodName(food.getName());
            item.setQuantity(itemReq.getQuantity());
            item.setPrice(food.getPrice());
            item.setTotalPrice(food.getPrice().multiply(BigDecimal.valueOf(itemReq.getQuantity())));
            items.add(item);
            total = total.add(item.getTotalPrice());
        }

        order.setItems(items);
        order.setTotalAmount(total);
        Order savedOrder = orderRepository.save(order);

        kafkaTemplate.send("order-created", savedOrder);

        return savedOrder;
    }

    public List<Order> getUserOrders(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public Order updateOrderStatus(Long id, String status) {
        Order order = getOrderById(id);
        order.setStatus(status);
        return orderRepository.save(order);
    }
}