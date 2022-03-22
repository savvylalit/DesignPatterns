package com.sarv.structural.decorator;

public class Application {

	public static void main(String[] args) {
		Pizza p1 = new SimpleVeg();
		p1 = new PaneerDecorator(p1);
		p1 = new CheeseDecorator(p1);
		
		System.out.println("Veg Pizza ready..");
		System.out.println("Desc = " + p1.getDesc());
		System.out.println("Price = " + p1.getPrice());

		Pizza p2 = new CheeseDecorator(new ChickenDecorator(new SimpleNonVeg()));  
		System.out.println("Non Veg Pizza ready..");
		System.out.println("Desc = " + p2.getDesc());
		System.out.println("Price = " + p2.getPrice());
	}

}
