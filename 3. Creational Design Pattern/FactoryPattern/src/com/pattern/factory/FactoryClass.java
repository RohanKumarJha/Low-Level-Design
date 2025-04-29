package com.pattern.factory;

import com.pattern.developer.AndroidDeveloper;
import com.pattern.developer.DeveloperInterface;
import com.pattern.developer.WebDeveloper;

public class FactoryClass {

	public DeveloperInterface developer(String developerType) {
		if(developerType.trim().equalsIgnoreCase("Web Developer")) {
			return new WebDeveloper();
		} else if(developerType.trim().equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloper();
		} return null;
	}

}
