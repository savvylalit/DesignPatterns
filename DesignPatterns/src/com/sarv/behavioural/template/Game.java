package com.sarv.behavioural.template;

public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void stopPlay();
	public final void play() {
		initialize();
		startPlay();
		stopPlay();
	}
}
