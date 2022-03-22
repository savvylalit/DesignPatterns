package com.sarv.behavioural.observer;

public class Application {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.setState(1);
		Observer binObserver = new BinaryObserver();
		Observer hexObserver = new HexObserver();
		subject.addObserver(binObserver);
		subject.addObserver(hexObserver);
		subject.setState(2);

	}

}
