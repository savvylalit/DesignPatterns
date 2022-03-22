package com.sarv.creational.builder;

public class ClientApp {

	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);
		engineer.constructHouse();
		House house = engineer.getHouse();
		System.out.println("Builder constructed" + house);
	}

}
