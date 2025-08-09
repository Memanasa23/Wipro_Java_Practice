package com.example.letsgo.service;

import com.example.letsgo.dto.MovementRequest;
import com.example.letsgo.entity.VehicleMovement;
import com.example.letsgo.repository.VehicleMovementRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class VehicleMovementService {

    private static final Logger logger = LoggerFactory.getLogger(VehicleMovementService.class);
    private final VehicleMovementRepository repository;

    public VehicleMovementService(VehicleMovementRepository repository) {
        this.repository = repository;
    }

    public VehicleMovement saveMovement(MovementRequest request) {
    	VehicleMovement movement = new VehicleMovement(
    	        request.getVehId(),
    	        request.getLat(),
    	        request.getLng()
    	);


        VehicleMovement saved = repository.save(movement);

        
        logger.info("Vehicle ID {} moved to [Lat: {}, Lng: {}]",
                saved.getVehId(),
                saved.getLat(),
                saved.getLng());


        return saved;
    }
}
