package com.lcit.assignment7;

import java.util.List;
import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee firstEmpoyee = new Employee(47899, "Susan Meyers", "Accounting", "Vice President");
		Employee SecondEmpoyee = new Employee(39119, "Mark Jones", "IT", "Programmer");
		Employee thirdEmpoyee = new Employee(81774, "Joy Rogers", "Manufacturing", "Engineer");
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(firstEmpoyee);
		employees.add(SecondEmpoyee);
		employees.add(thirdEmpoyee);
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" +
				   		   "| This program creates 3 employees and display  |\n" +
				   		   "| them using a table format, demostrating the   |\n" +
				   		   "| Employee class.                               |\n" +
						   "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		
		displayEmployees(employees);
	}
	
	private static void displayEmployees(List<Employee> employees) {
		final String STRUCTURE = "%-10s %-15s %-15s %-15s";
		final String HEADER = String.format(STRUCTURE, "ID NUMBER", "NAME", "DEPARTMENT", "POSITION");
		final String LINE = "-".repeat(HEADER.length());
		
		System.out.println(LINE);
		System.out.println(HEADER);
		System.out.println(LINE);
		
		for(Employee employee : employees) {
			System.out.println(
					String.format(STRUCTURE, employee.getIdNumber(), employee.getName(), employee.getDepartment(), employee.getPosition())
					);
		}
		System.out.println(LINE);
	}

}
