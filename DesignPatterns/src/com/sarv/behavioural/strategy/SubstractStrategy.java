package com.sarv.behavioural.strategy;

public class SubstractStrategy implements Strategy {

	@Override
	public int execute(int n1, int n2) {
		return n1 - n2;
	}

}
