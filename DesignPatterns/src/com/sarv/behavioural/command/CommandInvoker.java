package com.sarv.behavioural.command;

public class CommandInvoker {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand() {
		command.execute();
	}

}
