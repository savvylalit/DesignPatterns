package com.sarv.behavioural.chainofresponsibility;

public interface Logger {
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;
	
	public void log(int level, String message);
	public void setNext(Logger logger);
}
