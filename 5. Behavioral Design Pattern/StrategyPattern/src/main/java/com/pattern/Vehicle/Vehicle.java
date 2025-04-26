package com.pattern.Vehicle;

import com.pattern.strategy.DriveStrategy;

public class Vehicle {
	private DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		super();
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
}
