package com.parking.parkingSpot;

import com.parking.vehicle.Vehicle;
import com.parking.vehicle.VehicleType;

public class ParkingSpot {
	    private int id;
	    private boolean isEmpty;
	    private Vehicle vehicle;
	    private int price;
	    private VehicleType type;

	    public void parkVehicle(Vehicle vehicle) { 
	    	this.vehicle = vehicle; isEmpty = false; 
	    }
	    
	    public void removeVehicle() {
	    	this.vehicle = null; isEmpty = true; 
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public boolean isEmpty() {
			return isEmpty;
		}

		public void setEmpty(boolean isEmpty) {
			this.isEmpty = isEmpty;
		}

		public Vehicle getVehicle() {
			return vehicle;
		}

		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public VehicleType getType() {
			return type;
		}

		public void setType(VehicleType type) {
			this.type = type;
		}

}
