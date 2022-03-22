package com.sarv.behavioural.command;

public class CopyCommand implements Command {
	TextEditor textEditor;
	ClipBoard clipBoard;
	
	public CopyCommand(TextEditor textEditor, ClipBoard clipBoard) {
		this.textEditor = textEditor;
		this.clipBoard = clipBoard;
	}

	@Override
	public void execute() {
		String selection = textEditor.getSelection();
		clipBoard.setText(selection);
		System.out.println("Copy command :: ");
		System.out.println("--TextEditor Selection - " + textEditor.getSelection());
		System.out.println("--Text as ClipBoard - " + clipBoard.getText());

	}

}
