package com.lcit.assignment7;

import java.util.List;
import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Creates the three instances for Employee with data for each one of the fields in each one of the employees. 
		Employee firstEmpoyee = new Employee(47899, "Susan Meyers", "Accounting", "Vice President");
		Employee SecondEmpoyee = new Employee(39119, "Mark Jones", "IT", "Programmer");
		Employee thirdEmpoyee = new Employee(81774, "Joy Rogers", "Manufacturing", "Engineer");
		
		// Creates a list of employees to hold all the instances of Employee created.
		List<Employee> employees = new ArrayList<>();
		
		employees.add(firstEmpoyee);
		employees.add(SecondEmpoyee);
		employees.add(thirdEmpoyee);
		// Prints out all the information in console using an user-created method.
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
		
		// Prints each one of the employees in the list.
		for(Employee employee : employees) {
			System.out.println(
					String.format(STRUCTURE, employee.getIdNumber(), employee.getName(), employee.getDepartment(), employee.getPosition())
					);
		}
		System.out.println(LINE);
	}

}
