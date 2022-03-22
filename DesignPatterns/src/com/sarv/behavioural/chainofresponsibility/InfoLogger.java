package com.sarv.behavioural.chainofresponsibility;

public class InfoLogger extends BaseLogger {
	
	public InfoLogger() {
		super(Logger.INFO);
	}

	@Override
	public void log(int level, String message) {
		if(this.level == level) {
			System.out.println("InfoLogger :: " + message);
		}else if(nextLogger != null){
			nextLogger.log(level, message);
		}
		
	}

}
