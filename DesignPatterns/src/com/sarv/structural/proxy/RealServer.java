package com.sarv.structural.proxy;

public class RealServer implements Server {

	@Override
	public void visit(String url) {
		System.out.println("Visiting Real Server");

	}

}
