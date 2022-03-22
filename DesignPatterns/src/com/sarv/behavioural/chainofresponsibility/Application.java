package com.sarv.behavioural.chainofresponsibility;

public class Application {

	public static void main(String[] args) {
		Logger logger = getLogger();
		logger.log(Logger.INFO, "This is INFO message");
		logger.log(Logger.DEBUG, "This is DEBUG message");
		logger.log(Logger.ERROR, "This is ERROR message");

	}

	private static Logger getLogger() {
		Logger logger1 = new InfoLogger();
		Logger logger2 = new DebugLogger();
		Logger logger3 = new ErrorLogger();
		logger1.setNext(logger2);
		logger2.setNext(logger3);
		return logger1;
	}
	
}
