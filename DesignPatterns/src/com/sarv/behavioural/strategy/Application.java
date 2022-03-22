package com.sarv.behavioural.strategy;

public class Application {

	public static void main(String[] args) {
		NumberProcessor np = new NumberProcessor(24, 8);
		np.setStrategy(new AddStrategy());
		np.process();
		
		np.setStrategy(new SubstractStrategy());
		np.process();
		
		np.setStrategy(new MultiplyStrategy());
		np.process();
		
		np.setStrategy(new DivideStrategy());
		np.process();

	}

}
