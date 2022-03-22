package com.sarv.creational.factory;

public class ClientApp {

	public static void main(String[] args) {
		TransportFactory transportFactory = new TransportFactory();
		
		Transport t1 = transportFactory.getTransport("Truck");
		t1.deliver();
		
		Transport t2 = transportFactory.getTransport("Ship");
		t2.deliver();
		
		Transport t3 = transportFactory.getTransport("Plane");
		t3.deliver();
		
	}

}
