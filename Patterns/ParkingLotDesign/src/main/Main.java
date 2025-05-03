package main;

import com.parking.gate.ExitGate;
import com.parking.parkingSpot.ParkingSpot;
import com.parking.parkingSpot.ticket.Ticket;
import com.parking.parkingSpotManager.ParkingSpotManager;
import com.parking.parkingSpotManagerFactory.ParkingSpotManagerFactory;
import com.parking.vehicle.Vehicle;
import com.parking.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create Vehicle
        Vehicle vehicle = new Vehicle("DL01AB1234", VehicleType.Two_Wheeler);

        // Step 2: Find Parking Spot
        ParkingSpotManager manager = ParkingSpotManagerFactory.getParkingSpotManager(vehicle);
        ParkingSpot spot = manager.findParkingSpace();
        
        if (spot == null) {
            System.out.println("No available parking spot!");
            return;
        }

        // Step 3: Park Vehicle & Generate Ticket
        manager.parkVehicle(vehicle);
        Ticket ticket = new Ticket(System.currentTimeMillis(), vehicle, spot);
        System.out.println("Ticket Generated: " + ticket);

        // Simulate Parking Duration
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

        // Step 4: Exit Process
        ExitGate exitGate = new ExitGate();
        int price = exitGate.processExit(ticket, "Cash");
        System.out.println("Total Amount: ₹" + price);
    }
}
