package com.lcit.assignment7;

public class Employee {
	
	private int idNumber;
	private String name;
	private String department;
	private String position;
	
	public Employee(int idNumber, String name, String department, String position) {
		this.idNumber = idNumber;
		this.name = name;
		this.department = department;
		this.position = position;
	}
	
	public Employee(int idNumber, String name) {
		this.idNumber = idNumber;
		this.name = name;
	}
	
	public Employee() {
		idNumber = 0;
		name = "";
		department = "";
		position = "";
	}

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

	@Override
	public String toString() {
		return "Employee [idNumber=" + idNumber + ", name=" + name + ", department=" + department + ", position="
				+ position + "]";
	}
}
