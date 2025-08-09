package com.example.letsgo.controller;

import com.example.letsgo.dto.MovementRequest;
import com.example.letsgo.entity.VehicleMovement;
import com.example.letsgo.service.VehicleMovementService;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleMovementController {

    private final VehicleMovementService service;

    public VehicleMovementController(VehicleMovementService service) {
        this.service = service;
    }

    @PostMapping("/move")
    public VehicleMovement moveVehicle(@RequestBody MovementRequest request) {
        return service.saveMovement(request);
    }
}
