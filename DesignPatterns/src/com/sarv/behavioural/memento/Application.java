package com.sarv.behavioural.memento;

public class Application {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.save());
		
		originator.setState("State #3");
		careTaker.add(originator.save());

		originator.setState("State #4");
		System.out.println("Current State : " + originator.getState());
		originator.restore(careTaker.get(0));
		System.out.println("First saved state: "+ originator.getState());
		originator.restore(careTaker.get(1));
		System.out.println("Second saved state: "+ originator.getState());
	}

}
