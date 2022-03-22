package com.sarv.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private int state;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		System.out.println("State Changed to - "+state);
		notifyObservers();
	}

	public void addObserver(Observer obs) {
		observers.add(obs);
	}
	
	private void notifyObservers() {
		for(Observer ob : observers) {
			ob.notify(state);
		}
		
	}
}
