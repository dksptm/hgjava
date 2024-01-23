package com.yedam.classes.singleton;

// 데이터를 담아놓기 위한 클래스 --> 인스턴스타입이어야 함(각 사원마다 다른정보)
public class Employee {
	//필드
	private int employeeId;			//사번.
	private String name;			//이름.
	private int departmentId;		//부서번호(10:인사 20:개발 30:영업-기본값).
	private String departmentName;	//부서명.
	private int salary;				//급여.
	
	//생성자
	public Employee() {}
	public Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId; //this -> 나중에 만들어질 인스턴스를 가리킨다.
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
	public Employee(int employeeId, String name, int salary) {
//		this(); //기본생성자 호출
		this(employeeId, name, salary, 30); //두번째 생성자 호출하고 없는 departmentId는 영업으로 기본값
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
	
	
	
	
	
}
