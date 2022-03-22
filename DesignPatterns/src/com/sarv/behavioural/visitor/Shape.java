package com.sarv.behavioural.visitor;

public interface Shape {
	public String getName();
	public void accept(ShapeVisitor visitor);
}
