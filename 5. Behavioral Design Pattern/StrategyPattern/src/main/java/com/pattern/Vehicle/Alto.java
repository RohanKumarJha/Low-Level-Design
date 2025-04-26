package com.pattern.Vehicle;

import com.pattern.strategy.NormalDrive;

public class Alto extends Vehicle {
	public Alto() {
		super(new NormalDrive());
	}
}
