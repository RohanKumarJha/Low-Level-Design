package com.pattern.strategy;

public class NormalDrive implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Engine power on 2 wheels only...");
	}

}
