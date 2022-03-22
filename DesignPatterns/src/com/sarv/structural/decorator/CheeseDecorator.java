package com.sarv.structural.decorator;

public class CheeseDecorator extends Decorator {
	final double price = 20;
	
	public CheeseDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+ "CheeseDecorator - Rs(" +price+ "), ";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
