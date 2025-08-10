package com.example.carmicro.repository;

import com.example.carmicro.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
	
}
