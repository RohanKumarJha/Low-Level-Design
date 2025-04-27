package com.design.subject;

import java.util.ArrayList;
import java.util.List;

import com.design.observer.Observer;

public class Youtube implements Subject {
	
	private List<Observer> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Observer ob) {
		this.subscribers.add(ob);
	}

	@Override
	public void unSubscribe(Observer ob) {
		this.subscribers.remove(ob);
	}

	@Override
	public void uploadNewVideo(String title) {
		for(Observer observer : subscribers) {
			observer.notification(title);
		}
	}
}
