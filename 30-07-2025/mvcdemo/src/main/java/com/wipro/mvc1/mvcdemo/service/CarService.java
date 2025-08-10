package com.wipro.mvc1.mvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mvc1.mvcdemo.model.Car;
import com.wipro.mvc1.mvcdemo.repo.CarRepo;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;

    public List<Car> getCarList() {
        return carRepo.getAllCars();
    }
}
