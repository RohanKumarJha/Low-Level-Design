package com.pattern.Vehicle;

import com.pattern.strategy.NormalDrive;

public class Bus extends Vehicle {

	public Bus() {
		super(new NormalDrive());
	}

}
