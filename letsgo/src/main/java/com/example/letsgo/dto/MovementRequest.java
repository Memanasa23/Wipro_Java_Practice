package com.example.letsgo.dto;

public class MovementRequest {
    private Long vehId;
    private Double lat;
    private Double lng; 

    public Long getVehId() { return vehId; }
    public void setVehId(Long vehId) { this.vehId = vehId; }

    public Double getLat() { return lat; }
    public void setLat(Double lat) { this.lat = lat; }

    public Double getLng() { return lng; }
    public void setLng(Double lng) { this.lng = lng; }
}
