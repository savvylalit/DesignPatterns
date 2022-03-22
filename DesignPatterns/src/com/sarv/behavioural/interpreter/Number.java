package com.sarv.behavioural.interpreter;

public class Number implements Expression {

	private int n;
	
	public Number(int n) {
		this.n = n;
	}

	@Override
	public int interpret() {
		return n;
	}

}
