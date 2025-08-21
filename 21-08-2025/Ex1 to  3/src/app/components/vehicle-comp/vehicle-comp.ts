import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Vehicle } from '../../models/vehicle';
import { VehicleService } from '../../services/vehicle';

@Component({
  selector: 'app-vehicle-comp',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './vehicle-comp.html',
  styleUrls: ['./vehicle-comp.css']
})
export class VehicleComp implements OnInit {
  vehicles: Vehicle[] = [];
  newVehicle: Vehicle = { make: '', model: '', fuelType: '', price: 0 };

  constructor(private vehicleService: VehicleService) {}

  ngOnInit(): void {
    this.loadVehicles();
  }

  loadVehicles(): void {
    this.vehicleService.getVehicles().subscribe(data => {
      this.vehicles = data;
    });
  }

  addVehicle(): void {
    this.vehicleService.addVehicle(this.newVehicle).subscribe(vehicle => {
      this.vehicles.push(vehicle);
      this.newVehicle = { make: '', model: '', fuelType: '', price: 0 };
    });
  }

  updateVehicle(vehicle: Vehicle): void {
    this.vehicleService.updateVehicle(vehicle).subscribe(updated => {
      const index = this.vehicles.findIndex(v => v.id === updated.id);
      if (index !== -1) {
        this.vehicles[index] = updated;
      }
    });
  }

  deleteVehicle(vehicleId: number): void {
    this.vehicleService.deleteVehicle(vehicleId).subscribe(() => {
      this.vehicles = this.vehicles.filter(v => v.id !== vehicleId);
    });
  }
}
