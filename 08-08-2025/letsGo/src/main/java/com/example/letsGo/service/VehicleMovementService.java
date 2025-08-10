package com.example.letsGo.service;

import com.example.letsGo.dto.MovieRequest;
import com.example.letsGo.entity.VehicleMovement;
import com.example.letsGo.repository.VehicleMovementRepository;
import org.springframework.stereotype.Service;

@Service
public class VehicleMovementService {

    private final VehicleMovementRepository repository;

    public VehicleMovementService(VehicleMovementRepository repository) {
        this.repository = repository;
    }

    public VehicleMovement saveMovement(MovieRequest request) {
        VehicleMovement movement = new VehicleMovement();
        movement.setVehId(request.getVehId());
        movement.setLat(request.getLat());
        movement.setLongVal(request.getLongitude());
        return repository.save(movement);
    }
}

