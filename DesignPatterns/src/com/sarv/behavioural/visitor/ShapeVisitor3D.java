package com.sarv.behavioural.visitor;

public class ShapeVisitor3D implements ShapeVisitor {

	@Override
	public void visit(Circle circle) {
		System.out.println("ShapeVisitor3D - Drawing Sphere");
	}

	@Override
	public void visit(Square square) {
		System.out.println("ShapeVisitor3D - Drawing Cube");

	}

}
