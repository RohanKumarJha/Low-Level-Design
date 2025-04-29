package main;

import com.pattern.factory.FactoryClass;

public class Main {

	public static void main(String[] args) {
		FactoryClass factory = new FactoryClass();
		
		System.out.println(factory.developer("Web Developer").salary());
		System.out.println(factory.developer("Android developer").salary());
	}

}
