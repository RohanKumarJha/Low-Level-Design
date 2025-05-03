package com.parking.gate;

import com.parking.parkingSpot.ParkingSpot;
import com.parking.parkingSpot.ticket.Ticket;
import com.parking.parkingSpotManager.ParkingSpotManager;
import com.parking.parkingSpotManagerFactory.ParkingSpotManagerFactory;
import com.parking.vehicle.Vehicle;

public class EntranceGate {
    private ParkingSpotManagerFactory factory;

    public Ticket generateTicket(Vehicle vehicle) {
        ParkingSpotManager manager = ParkingSpotManagerFactory.getParkingSpotManager(vehicle);
        ParkingSpot spot = manager.findParkingSpace();
        return new Ticket(System.currentTimeMillis(), vehicle, spot);
    }
}

