package com.sarv.structural.proxy;

public class Application {

	public static void main(String[] args) {
		String url1 = "http://url1";
		String url12 = "http://url12";
		Server server = new ProxyServer();
		server.visit(url1);
		server.visit(url12);
	}
	
}
