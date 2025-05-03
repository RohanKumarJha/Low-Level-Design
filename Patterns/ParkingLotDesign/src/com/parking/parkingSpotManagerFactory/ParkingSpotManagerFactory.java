package com.parking.parkingSpotManagerFactory;

import java.util.ArrayList;

import com.parking.parkingSpotManager.FourWheelerManager;
import com.parking.parkingSpotManager.ParkingSpotManager;
import com.parking.parkingSpotManager.TwoWheelerManager;
import com.parking.vehicle.Vehicle;
import com.parking.vehicle.VehicleType;

public class ParkingSpotManagerFactory {
    public static ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.Two_Wheeler ? new TwoWheelerManager(new ArrayList<>()) : new FourWheelerManager(new ArrayList<>());
    }
}

