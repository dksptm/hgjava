package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.Date;

//empNo, empName, hireDate, salary
public class Employee {

	private int empNo;
	private String empName;
	private Date hireDate;
	private int salary;

	public Employee(int empNo, String empName, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.hireDate = hireDate;
		this.salary = salary;
	}
	
	Date getHireDate() {
		return this.hireDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return "▷ 사번: " + empNo + ", 이름: " + empName + ", 입사일: " + sdf.format(hireDate) + ", 월급: " + salary + "만원.";
	}
	
}
