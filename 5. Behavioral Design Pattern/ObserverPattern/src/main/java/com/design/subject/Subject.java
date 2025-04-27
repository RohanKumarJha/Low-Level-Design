package com.design.subject;

import com.design.observer.Observer;

public interface Subject {
	void subscribe(Observer ob);
	void unSubscribe(Observer ob);
	void uploadNewVideo(String title);
}
