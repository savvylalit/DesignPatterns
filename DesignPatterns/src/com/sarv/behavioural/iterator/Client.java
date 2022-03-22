package com.sarv.behavioural.iterator;

public class Client {
	public static void main(String[] args) {
		NameContainer namesContainer = new NameContainer();
		Iterator itr = namesContainer.getIterator();
		while(itr.hasNext()) {
			String name = (String)itr.next();
			System.out.println("Name : " + name);
		}
	}
}
