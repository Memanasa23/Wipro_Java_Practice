package com.example.FoodService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FoodService.dto.FoodRequest;
import com.example.FoodService.entity.Food;
import com.example.FoodService.exception.FoodNotFoundException;
import com.example.FoodService.repository.FoodRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public List<Food> getAvailableFoods() {
        return foodRepository.findByAvailabilityTrue();
    }

    public Food getFoodById(Long id) {
        return foodRepository.findById(id)
                .orElseThrow(() -> new FoodNotFoundException("Food not found with id: " + id));
    }

    public List<Food> getFoodsByCategory(String category) {
        return foodRepository.findByCategoryAndAvailabilityTrue(category);
    }

    public List<Food> searchFoods(String query) {
        return foodRepository.searchFoods(query);
    }

    public List<String> getAllCategories() {
        return foodRepository.findAllCategories();
    }

    public Food createFood(FoodRequest request) {
        Food food = new Food();
        mapRequestToFood(request, food);
        return foodRepository.save(food);
    }

    public Food updateFood(Long id, FoodRequest request) {
        Food food = getFoodById(id);
        mapRequestToFood(request, food);
        return foodRepository.save(food);
    }

    public void deleteFood(Long id) {
        Food food = getFoodById(id);
        foodRepository.delete(food);
    }

    public Food updateAvailability(Long id, Boolean availability) {
        Food food = getFoodById(id);
        food.setAvailability(availability);
        return foodRepository.save(food);
    }

    public Food updateRating(Long id, BigDecimal rating) {
        Food food = getFoodById(id);
        food.setRating(rating);
        return foodRepository.save(food);
    }

    public List<Food> getVegetarianFoods() {
        return foodRepository.findByIsVegetarianTrue();
    }

    public List<Food> getVeganFoods() {
        return foodRepository.findByIsVeganTrue();
    }

    public List<Food> getSpicyFoods() {
        return foodRepository.findByIsSpicyTrue();
    }

    public List<Food> getFoodsByRating(Double minRating) {
        return foodRepository.findByRatingGreaterThanEqual(minRating);
    }

    private void mapRequestToFood(FoodRequest request, Food food) {
        food.setName(request.getName());
        food.setDescription(request.getDescription());
        food.setPrice(request.getPrice());
        food.setImageUrl(request.getImageUrl());
        food.setCategory(request.getCategory());
        food.setAvailability(request.getAvailability());
        food.setRating(request.getRating());
        food.setPreparationTime(request.getPreparationTime());
        food.setCalories(request.getCalories());
        food.setIngredients(request.getIngredients());
        food.setIsVegetarian(request.getIsVegetarian());
        food.setIsVegan(request.getIsVegan());
        food.setIsSpicy(request.getIsSpicy());
    }
}