package com.example.letsGo.repository;

import com.example.letsGo.entity.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Long> {
}
