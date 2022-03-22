package com.sarv.behavioural.visitor;

public class Application {

	public static void main(String[] args) {
		Shape[] shapes = {new Circle(), new Square()};
		
		ShapeVisitor shapeVisitor1 = new ShapeVisitor2D();
		for(Shape s : shapes) {
			s.accept(shapeVisitor1);
		}

		ShapeVisitor shapeVisitor2 = new ShapeVisitor3D();
		for(Shape s : shapes) {
			s.accept(shapeVisitor2);
		}
	}

}
