package com.example.carmicro.service;

import com.example.carmicro.entity.Car;
import com.example.carmicro.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car save(Car car) {
        Car savedCar = carRepository.save(car);
        System.out.println("Car created: " + savedCar);
        return savedCar;
    }

    public List<Car> getAll() {
        List<Car> cars = carRepository.findAll();
        System.out.println("All cars fetched. Count: " + cars.size());
        return cars;
    }

    public Optional<Car> getById(Long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            System.out.println("Car fetched by ID: " + car.get());
        } else {
            System.out.println("Car not found with ID: " + id);
        }
        return car;
    }

    public Car update(Long id, Car updatedCar) {
        return carRepository.findById(id).map(car -> {
            car.setMake(updatedCar.getMake());
            car.setRegistrationDetail(updatedCar.getRegistrationDetail());
            Car updated = carRepository.save(car);
            System.out.println("Car updated: " + updated);
            return updated;
        }).orElseThrow(() -> {
            System.out.println("Car not found for update. ID: " + id);
            return new RuntimeException("Car not found");
        });
    }

    public void delete(Long id) {
        carRepository.deleteById(id);
        System.out.println("Car deleted with ID: " + id);
    }
}
