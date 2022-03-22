package com.sarv.structural.facade;


public class Computer {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public Computer() {
		super();
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	
	public void start() {
		cpu.processData();
		memory.loadData();
		hardDrive.readData();
		System.out.println("Computer Started . . . ");
	}
	
}
