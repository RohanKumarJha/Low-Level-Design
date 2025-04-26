package com.pattern.Vehicle;

import com.pattern.strategy.AdvanceDrive;

public class Audi extends Vehicle {

	public Audi() {
		super(new AdvanceDrive());
	}

}
