package com.sarv.behavioural.command;

public class Client {

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor("Initial Selection");
		ClipBoard clipBoard = new ClipBoard();

		Command copyCommand = new CopyCommand(textEditor, clipBoard);
		Command cutCommand = new CutCommand(textEditor, clipBoard);
		Command pasteCommand = new PasteCommand(textEditor, clipBoard);
		
		CommandInvoker commandInvoker = new CommandInvoker();
		
		commandInvoker.setCommand(copyCommand);
		commandInvoker.executeCommand();
		
		commandInvoker.setCommand(cutCommand);
		commandInvoker.executeCommand();
		
		commandInvoker.setCommand(pasteCommand);
		commandInvoker.executeCommand();
		
	}

}
