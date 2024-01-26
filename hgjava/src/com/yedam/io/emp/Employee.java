package com.yedam.io.emp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements java.io.Serializable {
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

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return String.format("%05d 이름:%s 입사일:%s 월급:%d만원.\n", empNo, empName, sdf.format(hireDate), salary);
	}

}
