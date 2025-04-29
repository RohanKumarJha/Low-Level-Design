package com.pattern.singelton;

public class Student {
	
	static Student student;

	private Student() {
		super();
	}
	
	public static Student createObj() {
		if(student == null) {
			return student = new Student();
		} return student;
	}
	
}
