package com.sarv.structural.flyweight;

public class Application {
	private static final String colors[] = {"Red", "Green", "Blue"};
	private static String getRandomcolor() {
		return colors[(int)(Math.random()*colors.length)];
	}
	
	public static void main(String[] args) {
		drawCirclesWithoutFlyweight();
		System.out.println("Total icon objects created w/o Flyweight - "+ColorIcon.getCount());

		ColorIcon.resetCount();
		
		drawCirclesWithFlyweight();
		System.out.println("Total icon objects created with Flyweight - "+ColorIcon.getCount());
	}
	
	public static void drawCirclesWithoutFlyweight() {
		for(int i=0;i<10;i++) {
			String color = getRandomcolor();
			Circle c = new Circle(i, i+2, new ColorIcon(color));
			c.draw();
		}
	}
	
	public static void drawCirclesWithFlyweight() {
		for(int i=0;i<10;i++) {
			String color = getRandomcolor();
			Circle c = new Circle(i, i+2, IconFactory.getIcon(color));
			c.draw();
		}
	}

}
