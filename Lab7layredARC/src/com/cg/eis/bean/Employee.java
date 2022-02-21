package com.cg.eis.bean;

public class Employee {
	public int employeeId;
	public String name,designation,insuranceScheme;
	public double salary;
	public Employee(int employeeId, String name, String designation,String insuranceScheme,double salary)
	{
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
		this.salary = salary;
	}
	public Employee(){
		
	}
	
}