package com.hdfc.capstone.client.entity;

/*
 * Author -suchita kadam
 * created on - 23/04/2023
 */
public class Employee {

	private int employeeID;
	private String employeeName;
	
	private String dateOfBirth;

	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public int getEmployeeID() {
		return employeeID;
	}
	public Employee(int employeeID, String employeeName, String dateOfBirth) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
}
