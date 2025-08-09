package com.example.letsgo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_movement")
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long vehId;
    private Double lat;
    private Double lng;

    public VehicleMovement() {
    }

    public VehicleMovement(Long vehId, Double lat, Double lng) {
        this.vehId = vehId;
        this.lat = lat;
        this.lng = lng;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getVehId() { return vehId; }
    public void setVehId(Long vehId) { this.vehId = vehId; }

    public Double getLat() { return lat; }
    public void setLat(Double lat) { this.lat = lat; }

    public Double getLng() { return lng; }
    public void setLng(Double lng) { this.lng = lng; }
}
