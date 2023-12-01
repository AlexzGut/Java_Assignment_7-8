package com.lcit.assignment7;

public class Employee {
	// Creates the fields for employee
	private int idNumber;
	private String name;
	private String department;
	private String position;
	
	// Creates the constructor for employee when all the 4 fields are passed.
	public Employee(int idNumber, String name, String department, String position) {
		this.idNumber = idNumber;
		this.name = name;
		this.department = department;
		this.position = position;
	}
	
	// Creates the constructor for employee when just idNumber and name are passed.
	public Employee(int idNumber, String name) {
		this.idNumber = idNumber;
		this.name = name;
	}
	
	// Creates a non-args constructor.
	public Employee() {
		idNumber = 0;
		name = "";
		department = "";
		position = "";
	}

	
	// Setters and getters for the fields
	/**
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	// toString Method for printing the Employee.
	@Override
	public String toString() {
		return "Employee [idNumber=" + idNumber + ", name=" + name + ", department=" + department + ", position="
				+ position + "]";
	}
}
