package main;

import com.pattern.singelton.Student;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Student.createObj().hashCode());
		
		System.out.println(Student.createObj().hashCode());
	}

}
