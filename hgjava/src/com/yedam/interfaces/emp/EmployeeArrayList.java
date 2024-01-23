package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.Scanner;

//저장공간: 컬렉션사용 ArrayList<Employee>
//크기 가변적
//EmployeeList를 구현하는 구현객체(구현클래스)->EmployeeArrayList
public class EmployeeArrayList implements EmployeeList {
	//싱글톤
	
	private static EmployeeArrayList instance = new EmployeeArrayList();
	ArrayList<Employee> list; //크기정할수도있지만 안정해도된다.-->init()에 굳이 사원수 입력받을필요없음
//	int empNum; 컬렉션에선 필요없음 list.size()
	Scanner scn = new Scanner(System.in);
	
	private EmployeeArrayList() {}
	
	public static EmployeeArrayList getInstance() {
		return instance;
	}
	
	//인터페이스구현
	@Override
	public void init() {
		list = new ArrayList<Employee>(); //인스턴스생성으로 초기화완료
		System.out.println("초기화 완료");
	}

	@Override
	public void input() {
		// 사원수부터 입력할 필요없음!
		System.out.printf("%d 사번>> ", list.size());
		int no = scn.nextInt();
		
		System.out.print("이름>> ");
		String name = scn.next();
		
		System.out.print("급여>> ");
		int sal = scn.nextInt();
		
		list.add(new Employee(no, name, sal));
	}

	@Override
	public String search(int empId) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getEmployeeId() == empId){
				return list.get(i).getName();
			}
		}
		return "없음";
	}

	@Override
	public void print() {
		System.out.println("사번\t이름\t급여");
		for(int i=0; i<list.size(); i++) {
			int no = list.get(i).getEmployeeId();
			String name = list.get(i).getName();
			int sal = list.get(i).getSalary();
			System.out.printf("%03d\t%s\t%d\n", no, name, sal);
		}
	}

	@Override
	public int sum() {
		int total = 0;
		for(int i=0; i<list.size(); i++) {
			total += list.get(i).getSalary();
		}
		return total;
	}
	
	//초기값넣기
	public void inEmp(){
		System.out.println("왜 안될까...");
//		list = new ArrayList<Employee>(); 
//		list.add(new Employee(1, "카리나"));
//		list.add(new Employee(2, "윈터"));
//		list.add(new Employee(3, "지젤"));
//		list.add(new Employee(4, "닝닝"));
//		list.add(new Employee(5, "제니"));
//		list.add(new Employee(6, "로제"));
	}

}
