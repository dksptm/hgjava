package com.yedam.interfaces.emp;

public class Employee {
	private int employeeId;			
	private String name;			
	private int departmentId;		
	private String departmentName;	
	private int salary;				
	
	public Employee() {}
	public Employee(int employeeId, String name) {
		this(employeeId, name, 100); //기본월급 100, 부서30으로.
	}
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);
	}
	public Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId; 
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		if(departmentId == 10) {
			departmentName = "인사";
		}else if(departmentId == 20) {
			departmentName = "개발";
		}else{
			departmentName = "영업";
		}
	}
	
	
	//getter/setter
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
}//class
