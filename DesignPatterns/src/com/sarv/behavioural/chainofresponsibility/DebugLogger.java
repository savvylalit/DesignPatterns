package com.sarv.behavioural.chainofresponsibility;

public class DebugLogger extends BaseLogger {
	
	public DebugLogger() {
		super(Logger.DEBUG);
	}

	@Override
	public void log(int level, String message) {
		if(this.level == level) {
			System.out.println("DebugLogger :: " + message);
		}else if(nextLogger != null){
			nextLogger.log(level, message);
		}
		
	}

}

