package com.sarv.behavioural.state;

public class Application {

	public static void main(String[] args) {
		Context context = new Context();
		State start = new StartState();
		start.doAction(context);
		State stop = new StopState();
		stop.doAction(context);
	}

}
