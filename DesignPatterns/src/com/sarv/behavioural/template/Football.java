package com.sarv.behavioural.template;

public class Football extends Game {

	@Override
	void initialize() {
		System.out.println("Initialize Football...!!!");
	}

	@Override
	void startPlay() {
		System.out.println("Start playing Football...");

	}

	@Override
	void stopPlay() {
		System.out.println("Stop playing Football...");

	}

}
