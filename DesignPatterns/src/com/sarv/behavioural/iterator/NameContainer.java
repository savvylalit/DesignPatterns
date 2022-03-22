package com.sarv.behavioural.iterator;

public class NameContainer implements Container {
	public String names[] = {"Sarv001", "Sarv002", "Sarv003", "Sarv004"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator{
		int index;
		public boolean hasNext() {
			if(index < names.length) {
				return true;
			}
			return false;
		}
		public Object next() {
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
	}
}
