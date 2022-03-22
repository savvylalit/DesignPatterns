package com.sarv.behavioural.strategy;

public class NumberProcessor {
	int n1, n2;
	private Strategy strategy;
	
	public NumberProcessor(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void process() {
		System.out.println("Result = "+ strategy.execute(n1, n2));
	}
}
