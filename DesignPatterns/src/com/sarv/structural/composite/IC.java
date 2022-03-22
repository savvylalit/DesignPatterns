package com.sarv.structural.composite;

public class IC implements Employee {
	String name;
	
	public IC(String name) {
		this.name = name;
	}
	@Override
	public void showDetails() {
		System.out.println("Name - "+name);
	}

}
