package com.yedam.interfaces.emp;

import java.util.Scanner;

//저장공간: 배열사용 Employee[]
public class EmployeeArray implements EmployeeList{
	//싱글톤
	private static EmployeeArray instance = new EmployeeArray();
	
	//추가 필요한 필드들..
	Employee[] list;
	int empNum;
	Scanner scn = new Scanner(System.in);
	
	//싱글톤 생성자
	private EmployeeArray() {}
	
	//싱글톤 getInstance()메소드
	public static EmployeeArray getInstance() {
		return instance;
	}
	
	@Override
	public void init() {
		System.out.print("사원수>> ");
		int num = scn.nextInt();
		list = new Employee[num];
	}

	@Override
	public void input() {
		if(list == null) {
			System.out.println("사원수부터 입력해주세요.");
			return;
		}
		if(empNum == list.length) {
			System.out.println("입력초과");
			return;
		}
		System.out.printf("%d 사번>> ", empNum);
		int no = scn.nextInt();
		
		System.out.print("이름>> ");
		String name = scn.next();
		
		System.out.print("급여>> ");
		int sal = scn.nextInt();
		
		list[empNum++] = new Employee(no, name, sal);
	}

	@Override
	public String search(int empId) {
		String name = "없음";
		for(int i=0; i<empNum; i++) {
			if(list[i].getEmployeeId() == empId){
				name = list[i].getName();
			}
		}
		return name;
	}

	@Override
	public void print() {
		if(empNum == 0) {
			System.out.println("현재 입력된 사원이 없습니다.");
			return;
		}
		System.out.println("사번\t이름\t급여");
		for(int i=0; i<empNum; i++) {
			int no = list[i].getEmployeeId();
			String name = list[i].getName();
			int sal = list[i].getSalary();
			System.out.printf("%03d\t%s\t%d\n", no, name, sal);
		}
	}

	@Override
	public int sum() {
		int total = 0;
		for(int i=0; i<empNum; i++) {
			total += list[i].getSalary();
		}
		return total;
	}

}
