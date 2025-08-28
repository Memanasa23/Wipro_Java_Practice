package com.example.order_ms.client;

import com.example.FoodService.entity.Food;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FoodService")
public interface FoodClient {
    @GetMapping("/api/food/{id}")
    Food getFoodById(@PathVariable Long id);
}