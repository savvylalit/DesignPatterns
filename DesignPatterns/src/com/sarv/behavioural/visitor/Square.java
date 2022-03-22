package com.sarv.behavioural.visitor;

public class Square implements Shape {

	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}

}
