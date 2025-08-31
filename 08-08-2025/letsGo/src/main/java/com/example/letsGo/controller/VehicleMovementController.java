package com.example.letsGo.controller;

import com.example.letsGo.dto.MovieRequest;
import com.example.letsGo.entity.VehicleMovement;
import com.example.letsGo.service.VehicleMovementService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/move")
public class VehicleMovementController {

    private final VehicleMovementService service;

    public VehicleMovementController(VehicleMovementService service) {
        this.service = service;
    }

    @PostMapping
    public VehicleMovement move(@RequestBody MovieRequest request) {
        return service.saveMovement(request);
    }
}

