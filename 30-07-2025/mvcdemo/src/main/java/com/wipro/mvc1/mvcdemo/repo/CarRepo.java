package com.wipro.mvc1.mvcdemo.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.wipro.mvc1.mvcdemo.model.Car;

@Repository
public class CarRepo {
    public List<Car> getAllCars() {
        return Arrays.asList(
            new Car("Audi"),
            new Car("Mercedes"),
            new Car("BMW")
        );
    }
}
