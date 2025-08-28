package com.example.FoodService.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.FoodService.entity.Food;
import com.example.FoodService.repository.FoodRepository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public void run(String... args) {
        if (foodRepository.count() == 0) {
            initializeFoodData();
        }
    }

    private void initializeFoodData() {
        List<Food> foods = Arrays.asList(
            createFood("Margherita Pizza", "Classic pizza with fresh tomatoes, mozzarella, and basil", 
                      new BigDecimal("12.99"), "Pizza", "https://images.unsplash.com/photo-1565299624946-b28f40a0ca4b", 
                      true, false, false, 15, new BigDecimal("4.5")),
            
            createFood("Chicken Biryani", "Aromatic basmati rice cooked with spiced chicken", 
                      new BigDecimal("15.99"), "Indian", "https://images.unsplash.com/photo-1563379091339-03246", 
                      false, false, true, 45, new BigDecimal("4.7")),
            
            createFood("Caesar Salad", "Fresh romaine lettuce with caesar dressing, croutons, and parmesan", 
                      new BigDecimal("9.99"), "Salad", "https://images.unsplash.com/photo-1546793665-c74683f339c1", 
                      true, false, false, 10, new BigDecimal("4.2")),
            
            createFood("Veggie Burger", "Plant-based patty with lettuce, tomato, and special sauce", 
                      new BigDecimal("11.99"), "Burger", "https://images.unsplash.com/photo-1520072959219-c595dc870360", 
                      true, true, false, 20, new BigDecimal("4.3")),
            
            createFood("Spaghetti Carbonara", "Classic Italian pasta with eggs, cheese, and pancetta", 
                      new BigDecimal("14.99"), "Pasta", "https://images.unsplash.com/photo-1621996346565-e3dbc353d2e5", 
                      false, false, false, 25, new BigDecimal("4.6")),
            
            createFood("Tom Yum Soup", "Spicy Thai soup with shrimp, mushrooms, and lemongrass", 
                      new BigDecimal("8.99"), "Thai", "https://images.unsplash.com/photo-1569718212165-3a8278d5f624", 
                      false, false, true, 15, new BigDecimal("4.4")),
            
            createFood("Chocolate Brownie", "Rich chocolate brownie with vanilla ice cream", 
                      new BigDecimal("6.99"), "Dessert", "https://images.unsplash.com/photo-1586985289688-ca3cf47d3e6e", 
                      true, false, false, 5, new BigDecimal("4.8")),
            
            createFood("Grilled Salmon", "Fresh Atlantic salmon grilled with herbs and lemon", 
                      new BigDecimal("18.99"), "Seafood", "https://images.unsplash.com/photo-1467003909585-2f8a72700288", 
                      false, false, false, 30, new BigDecimal("4.9")),
            
            createFood("Paneer Tikka", "Marinated cottage cheese grilled with spices", 
                      new BigDecimal("13.99"), "Indian", "https://images.unsplash.com/photo-1567188040759-fb8a883dc6d8", 
                      true, false, true, 25, new BigDecimal("4.5")),
            
            createFood("Fish Tacos", "Fresh fish tacos with cabbage slaw and chipotle mayo", 
                      new BigDecimal("12.99"), "Mexican", "https://images.unsplash.com/photo-1565299585323-38174c872fb8", 
                      false, false, false, 20, new BigDecimal("4.4"))
        );

        foodRepository.saveAll(foods);
    }

    private Food createFood(String name, String description, BigDecimal price, String category, 
                           String imageUrl, boolean isVegetarian, boolean isVegan, boolean isSpicy, 
                           int prepTime, BigDecimal rating) {
        Food food = new Food();
        food.setName(name);
        food.setDescription(description);
        food.setPrice(price);
        food.setCategory(category);
        food.setImageUrl(imageUrl);
        food.setIsVegetarian(isVegetarian);
        food.setIsVegan(isVegan);
        food.setIsSpicy(isSpicy);
        food.setPreparationTime(prepTime);
        food.setRating(rating);
        food.setAvailability(true);
        food.setCalories(400 + (int)(Math.random() * 600)); // Random calories between 400-1000
        
        return food;
    }
}
