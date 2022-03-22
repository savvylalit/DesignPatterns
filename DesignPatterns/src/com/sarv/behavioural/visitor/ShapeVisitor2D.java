package com.sarv.behavioural.visitor;

public class ShapeVisitor2D implements ShapeVisitor {

	@Override
	public void visit(Circle circle) {
		System.out.println("ShapeVisitor2D - Drawing Circle");
	}

	@Override
	public void visit(Square square) {
		System.out.println("ShapeVisitor2D - Drawing Square");

	}

}
