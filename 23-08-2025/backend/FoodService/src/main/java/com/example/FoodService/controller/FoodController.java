package com.example.FoodService.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.FoodService.dto.FoodRequest;
import com.example.FoodService.entity.Food;
import com.example.FoodService.service.FoodService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/food")
@CrossOrigin(origins = "*")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/all")
    public ResponseEntity<List<Food>> getAllFoods() {
        List<Food> foods = foodService.getAllFoods();
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/available")
    public ResponseEntity<List<Food>> getAvailableFoods() {
        List<Food> foods = foodService.getAvailableFoods();
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable Long id) {
        Food food = foodService.getFoodById(id);
        return ResponseEntity.ok(food);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Food>> getFoodsByCategory(@PathVariable String category) {
        List<Food> foods = foodService.getFoodsByCategory(category);
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFoods(@RequestParam String q) {
        List<Food> foods = foodService.searchFoods(q);
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<String>> getAllCategories() {
        List<String> categories = foodService.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @PostMapping
    public ResponseEntity<Food> createFood(@Valid @RequestBody FoodRequest request) {
        Food food = foodService.createFood(request);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFood(@PathVariable Long id, @Valid @RequestBody FoodRequest request) {
        Food food = foodService.updateFood(id, request);
        return ResponseEntity.ok(food);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}/availability")
    public ResponseEntity<Food> updateAvailability(@PathVariable Long id, @RequestParam Boolean availability) {
        Food food = foodService.updateAvailability(id, availability);
        return ResponseEntity.ok(food);
    }

    @PatchMapping("/{id}/rating")
    public ResponseEntity<Food> updateRating(@PathVariable Long id, @RequestParam BigDecimal rating) {
        Food food = foodService.updateRating(id, rating);
        return ResponseEntity.ok(food);
    }

    @GetMapping("/vegetarian")
    public ResponseEntity<List<Food>> getVegetarianFoods() {
        List<Food> foods = foodService.getVegetarianFoods();
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/vegan")
    public ResponseEntity<List<Food>> getVeganFoods() {
        List<Food> foods = foodService.getVeganFoods();
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/spicy")
    public ResponseEntity<List<Food>> getSpicyFoods() {
        List<Food> foods = foodService.getSpicyFoods();
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/rating/{minRating}")
    public ResponseEntity<List<Food>> getFoodsByRating(@PathVariable Double minRating) {
        List<Food> foods = foodService.getFoodsByRating(minRating);
        return ResponseEntity.ok(foods);
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Food Service is running");
    }
}

