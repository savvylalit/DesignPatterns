package com.sarv.structural.decorator;

public abstract class Decorator implements Pizza {
	final Pizza pizza;
	public Decorator(Pizza pizza) {
		this.pizza = pizza;
	}
}
