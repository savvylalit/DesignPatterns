package com.sarv.structural.decorator;

public class ChickenDecorator extends Decorator {
	final double price = 30;
	
	public ChickenDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+ "ChickenDecorator - Rs(" +price+ "), ";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
