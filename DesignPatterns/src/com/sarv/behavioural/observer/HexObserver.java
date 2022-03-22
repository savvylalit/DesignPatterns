package com.sarv.behavioural.observer;

public class HexObserver implements Observer {

	@Override
	public void notify(int newState) {
		System.out.println("Hex String: "+ Integer.toHexString(newState));

	}

}
