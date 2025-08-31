package com.example.FoodService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FoodService.entity.Food;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByCategory(String category);
    List<Food> findByAvailabilityTrue();
    List<Food> findByCategoryAndAvailabilityTrue(String category);
    
    @Query("SELECT f FROM Food f WHERE " +
           "(LOWER(f.name) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
           "LOWER(f.description) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
           "LOWER(f.category) LIKE LOWER(CONCAT('%', :query, '%')))")
    List<Food> searchFoods(@Param("query") String query);
    
    @Query("SELECT DISTINCT f.category FROM Food f")
    List<String> findAllCategories();
    
    List<Food> findByIsVegetarianTrue();
    List<Food> findByIsVeganTrue();
    List<Food> findByIsSpicyTrue();
    
    @Query("SELECT f FROM Food f WHERE f.rating >= :minRating")
    List<Food> findByRatingGreaterThanEqual(@Param("minRating") Double minRating);
}

