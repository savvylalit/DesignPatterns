package com.sarv.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Lead implements Employee {
	String name;
	List<Employee> reporters = new ArrayList<Employee>();
	
	public Lead(String name) {
		this.name = name;
	}

	public void add(Employee e) {
		reporters.add(e);
	}
	public List<Employee> getReporters(){
		return reporters;
	}
	
	@Override
	public void showDetails() {
		// displayName
		System.out.println("Name - "+name);

		//display reporters
		System.out.println("List of reporters - ");
		reporters.forEach(e->e.showDetails());
	}

}
