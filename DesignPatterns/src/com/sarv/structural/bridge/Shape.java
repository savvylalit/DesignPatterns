package com.sarv.structural.bridge;

public abstract class Shape {
	ColorApi colorApi;
	
	public Shape(ColorApi colorApi) {
		super();
		this.colorApi = colorApi;
	}
	
	public abstract void draw();
}
