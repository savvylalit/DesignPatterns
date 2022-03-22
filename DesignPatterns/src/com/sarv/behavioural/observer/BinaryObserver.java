package com.sarv.behavioural.observer;

public class BinaryObserver implements Observer {

	@Override
	public void notify(int newState) {
		System.out.println("Binary String: "+ Integer.toBinaryString(newState));

	}

}
