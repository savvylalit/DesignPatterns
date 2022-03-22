package com.sarv.structural.decorator;

public class PaneerDecorator extends Decorator {
	final double price = 22;
	
	public PaneerDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+ "PaneerDecorator - Rs(" +price+ "), ";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
