package com.pattern.Vehicle;

import com.pattern.strategy.AdvanceDrive;

public class Mercedes extends Vehicle {

	public Mercedes() {
		super(new AdvanceDrive());
	}

}
