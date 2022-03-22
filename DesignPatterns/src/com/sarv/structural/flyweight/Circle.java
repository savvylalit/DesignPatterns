package com.sarv.structural.flyweight;

public class Circle {
	private int x,y;
	ColorIcon icon;
	
	public Circle(int x, int y, ColorIcon icon) {
		this.x = x;
		this.y = y;
		this.icon = icon;
	}

	public void draw() {
		System.out.println("circle drawn at (" + x +"'"+y+") with ");
		icon.draw();
	}
	
}
