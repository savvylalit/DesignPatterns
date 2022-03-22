package com.sarv.behavioural.chainofresponsibility;

public abstract class BaseLogger implements Logger {

	protected Logger nextLogger;
	protected int level;
	
	public BaseLogger(int level) {
		this.level = level;
	}

	@Override
	public void setNext(Logger logger) {
		this.nextLogger = logger;

	}

}
