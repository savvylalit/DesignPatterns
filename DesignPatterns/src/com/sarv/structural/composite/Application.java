package com.sarv.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Employee> orgEmployees = buildOrganization();
		orgEmployees.forEach(e->e.showDetails());

	}

	private static List<Employee> buildOrganization() {
		Lead cto = new Lead("CTO");
		IC secretary = new IC("Secretary");
		
		Lead headTech = new Lead("Head Technology");
		Lead headOperations = new Lead("Head Operations");
		
		cto.add(secretary);
		cto.add(headTech);
		cto.add(headOperations);
		
		IC tech1 = new IC("TECH1");
		IC tech2 = new IC("TECH2");
		headTech.add(tech1);
		headTech.add(tech2);
		
		IC op1 = new IC("OP1");
		IC op2 = new IC("OP2");
		headOperations.add(op1);
		headOperations.add(op2);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(cto);
		employees.add(new Lead("CTO2"));
		
		return employees;
	}

}
