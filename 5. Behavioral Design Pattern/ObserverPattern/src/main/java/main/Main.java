package main;

import com.design.observer.Viewer;
import com.design.subject.Youtube;

public class Main {

	public static void main(String[] args) {
		Youtube youtube = new Youtube();
		
		Viewer viewer1 = new Viewer("Ajay");
		youtube.subscribe(viewer1);
		
		Viewer viewer2 = new Viewer("Rohan");
		youtube.subscribe(viewer2);
		
		Viewer viewer3 = new Viewer("Anjali");
		youtube.subscribe(viewer3);
		
		Viewer viewer4 = new Viewer("Manshi");
		youtube.subscribe(viewer4);
		
		youtube.unSubscribe(viewer3);
		
		youtube.uploadNewVideo("Learn programming");
	}

}
