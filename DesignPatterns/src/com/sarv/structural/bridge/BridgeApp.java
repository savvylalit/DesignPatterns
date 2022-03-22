package com.sarv.structural.bridge;

public class BridgeApp {

	public static void main(String[] args) {
		ColorApi redColorApi = new Red();
		ColorApi blueColorApi = new Blue();
		
		Shape redCircle = new Circle(redColorApi);
		redCircle.draw();
		
		Shape blueCircle = new Circle(blueColorApi);
		blueCircle.draw();
		
		Shape redSquare = new Square(redColorApi);
		redSquare.draw();
		
		Shape blueSquare = new Square(blueColorApi);
		blueSquare.draw();
	}

}
