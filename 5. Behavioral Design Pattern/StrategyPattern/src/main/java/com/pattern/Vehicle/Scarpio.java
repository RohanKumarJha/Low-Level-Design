package com.pattern.Vehicle;

import com.pattern.strategy.OffRoadDrive;

public class Scarpio extends Vehicle {

	public Scarpio() {
		super(new OffRoadDrive());
	}

}
