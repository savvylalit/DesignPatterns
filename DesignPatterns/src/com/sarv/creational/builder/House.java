package com.sarv.creational.builder;

public class House {
	private String basement;
	private String structure;
	private String roof;
	private String interior;
	public String getBasement() {
		return basement;
	}
	public void setBasement(String basement) {
		this.basement = basement;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public String getInterior() {
		return interior;
	}
	public void setInterior(String interior) {
		this.interior = interior;
	}
	@Override
	public String toString() {
		return String.format("House [basement=%s, structure=%s, roof=%s, interior=%s]", basement, structure, roof,
				interior);
	}
	
	
}
