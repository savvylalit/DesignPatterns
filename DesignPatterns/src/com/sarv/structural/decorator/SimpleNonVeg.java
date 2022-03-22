package com.sarv.structural.decorator;

public class SimpleNonVeg implements Pizza {
	final double price = 200;
	@Override
	public String getDesc() {
		return "Simple NonVeg- Rs("+price+"),";
	}

	@Override
	public double getPrice() {
		return price;
	}

}
