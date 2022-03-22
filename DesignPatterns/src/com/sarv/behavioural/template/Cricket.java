package com.sarv.behavioural.template;

public class Cricket extends Game {

	@Override
	void initialize() {
		System.out.println("Initialize Cricket...!!!");
	}

	@Override
	void startPlay() {
		System.out.println("Start playing Cricket...");

	}

	@Override
	void stopPlay() {
		System.out.println("Stop playing Cricket...");

	}

}
