package com.parking.parkingSpotManager;

import java.util.List;

import com.parking.parkingSpot.ParkingSpot;
import com.parking.vehicle.Vehicle;

public class FourWheelerManager implements ParkingSpotManager {
    private List<ParkingSpot> spots;

    public FourWheelerManager(List<ParkingSpot> spots) { 
    	this.spots = spots; 
    }

    @Override
    public ParkingSpot findParkingSpace() {
		return null; 
    }
    
    @Override
    public void parkVehicle(Vehicle vehicle) { 
    	
    }
    
    @Override
    public void removeVehicle(Vehicle vehicle) { 
    	/* Implement logic */ 
    }
}
