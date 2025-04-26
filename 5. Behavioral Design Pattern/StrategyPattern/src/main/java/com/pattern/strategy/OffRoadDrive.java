package com.pattern.strategy;

public class OffRoadDrive implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Engine power on all 4 wheels only...");
	}

}
