package com.sarv.structural.decorator;

public class SimpleVeg implements Pizza {
	final double price = 100;
	@Override
	public String getDesc() {
		return "Simple Veg- Rs("+price+"),";
	}

	@Override
	public double getPrice() {
		return price;
	}

}
