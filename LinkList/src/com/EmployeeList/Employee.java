package com.EmployeeList;

public class Employee {
	
	private int empid;
	private String name;
	private float sal;
	
	public Employee(int empid, String name, float sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}

}
