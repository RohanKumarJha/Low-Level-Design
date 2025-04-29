package com.pattern.developer;

public class AndroidDeveloper implements DeveloperInterface {

	@Override
	public int salary() {
		System.out.println("Android Developer");
		return 75000;
	}
	
}
