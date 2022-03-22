package com.sarv.behavioural.state;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("context switching to Stop State...");
		context.setState(this);
	}
	public String toString() {
		return "StopState";
	}

}
