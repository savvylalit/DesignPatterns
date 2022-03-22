package com.sarv.behavioural.chainofresponsibility;

public class ErrorLogger  extends BaseLogger {
	
	public ErrorLogger() {
		super(Logger.ERROR);
	}

	@Override
	public void log(int level, String message) {
		if(this.level == level) {
			System.out.println("ErrorLogger :: " + message);
		}else if(nextLogger != null){
			nextLogger.log(level, message);
		}
		
	}

}
