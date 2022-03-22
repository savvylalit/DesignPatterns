package com.sarv.creational.factory;

public class TransportFactory {
	public Transport getTransport(String name) {
		switch(name) {
			case "Truck" : return new Truck();
			case "Ship"  : return new Ship();
			case "Plane" : return new Plane();
			default: return null;
		}
	}
}
