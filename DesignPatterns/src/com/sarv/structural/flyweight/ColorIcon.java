package com.sarv.structural.flyweight;

public class ColorIcon {
	private static int count = 0;
	String name;
	
	public ColorIcon(String name) {
		this.name = name;
		count++;
	}
	
	public void draw() {
		System.out.println("ColorIcon - "+ name);
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void resetCount() {
		System.out.println("\n color Icon reset to zero\n");
		count = 0;
	}
}
