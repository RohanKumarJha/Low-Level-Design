package com.pattern.Vehicle;

import com.pattern.strategy.OffRoadDrive;

public class Thar extends Vehicle {

	public Thar() {
		super(new OffRoadDrive());
	}

}
