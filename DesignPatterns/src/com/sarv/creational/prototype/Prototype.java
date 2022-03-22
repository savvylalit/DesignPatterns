package com.sarv.creational.prototype;

public interface Prototype extends Cloneable {
	public AccessControl clone() throws CloneNotSupportedException;
}
