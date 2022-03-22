package com.sarv.behavioural.visitor;

public class Circle implements Shape {

	@Override
	public String getName() {
		return "Circle";
	}

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}

}
