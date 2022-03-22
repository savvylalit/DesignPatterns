package com.sarv.behavioural.state;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("context switching to Start State...");
		context.setState(this);
	}
	public String toString() {
		return "StartState";
	}

}
