package com.sarv.structural.bridge;

public class Circle extends Shape{

	public Circle(ColorApi colorApi) {
		super(colorApi);
	}

	@Override
	public void draw() {
		System.out.println("Circle Draw - ");
		colorApi.fill();
	}
	
}
