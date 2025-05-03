package com.parking.parkingSpotManager;

import com.parking.parkingSpot.ParkingSpot;
import com.parking.vehicle.Vehicle;

public interface ParkingSpotManager {
    ParkingSpot findParkingSpace();
    void parkVehicle(Vehicle vehicle);
    void removeVehicle(Vehicle vehicle);
}

