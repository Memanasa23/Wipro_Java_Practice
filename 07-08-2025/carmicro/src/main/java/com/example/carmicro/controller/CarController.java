package com.example.carmicro.controller;

import com.example.carmicro.entity.Car;
import com.example.carmicro.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getById(id).orElseThrow(() -> new RuntimeException("Car not found"));
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car) {
        return carService.update(id, car);
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.delete(id);
        return "Car deleted successfully.";
    }
}
