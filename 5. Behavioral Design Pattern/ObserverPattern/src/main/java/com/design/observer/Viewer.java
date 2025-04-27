package com.design.observer;

public class Viewer implements Observer {
	
	private String userName;

	public Viewer(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public void notification(String title) {
		System.out.println("Hi "+userName+", video uploaded : "+title);
	}

}
