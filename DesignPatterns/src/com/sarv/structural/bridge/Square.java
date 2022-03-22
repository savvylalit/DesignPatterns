package com.sarv.structural.bridge;

public class Square extends Shape{
	
	public Square(ColorApi colorApi) {
		super(colorApi);
	}

	@Override
	public void draw() {
		System.out.println("Square Draw - ");
		colorApi.fill();
	}

}
