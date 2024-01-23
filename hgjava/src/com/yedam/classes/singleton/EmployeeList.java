package com.yedam.classes.singleton;

import java.util.Scanner;

// 기능들을 담는 클래스
// 싱글톤방식으로.
public class EmployeeList {
	// 싱글턴.
	private static EmployeeList instance = new EmployeeList(); //필드-본인클래스의 인스턴스생성
	Employee[] list;	//사원배열.
	int empNum;			//사원인덱스.현재사원수.
	Scanner scn = new Scanner(System.in); //원래는 이런 클래스에 이렇게 잘 안함
	
	private EmployeeList() {} //생성자-private
	
	public static EmployeeList getInstance() {
		return instance; //인스턴스 가져올 수 있도록 getInstance() 메소드
	}
	
	// 사원수 입력 초기화
	public void init() { 
		System.out.print("사원수>> ");
		int num = scn.nextInt();
		list = new Employee[num];
	}
	
	// 사원정보 입력 => 배열추가
	public void input() {
		if(list == null) { //empNum은 처음부터 0이라 여기서는 불가능할듯
			System.out.println("사원수부터 입력해주세요.");
			return;
		}
		if(empNum == list.length) { //배열길이3이고, 인덱스3이면 더이상 못 넣으니깐!
			System.out.println("입력초과");
			return;
		}
		System.out.printf("%d 사번>> ", empNum);
		int no = scn.nextInt();
		
		System.out.print("이름>> ");
		String name = scn.next();
		
		System.out.print("급여>> ");
		int sal = scn.nextInt();
		
		list[empNum++] = new Employee(no, name, sal);//호출될때마다 empNum이 증가되도록
	}
	
	// 사번에 해당하는 이름 출력.
	public String search(int empId) {
		// 해당사번이 있으면 이름 반환. 없으면 "".
//		if(list == null) return ""; emp쓰면 이거는 생략해도 되는듯
		String name = "없음";
		for(int i=0; i<empNum; i++) {
			if(list[i].getEmployeeId() == empId){
				name = list[i].getName();
			}
		}
		return name;
	}
	
	// 전체출력.
	public void print() {
		//사원번호, 이름, 급여 출력.
		if(empNum == 0) { //list == null 보다 적절함. 왜? 사원수가 있어도 한명도 입력안하면 없는거니깐
			System.out.println("현재 입력된 사원이 없습니다.");
			return;
		}
		System.out.println("사번\t이름\t급여");
		for(int i=0; i<empNum; i++) { //empNum사용하면 굳이 list[i]!= null안해도됨
			int no = list[i].getEmployeeId();
			String name = list[i].getName();
			int sal = list[i].getSalary();
//			System.out.printf("%4d %10s %7d\n", no, name, sal);	
			System.out.printf("%d\t%s\t%d\n", no, name, sal);
		}
	}
	
	// 급여총합
	public int sum(){
		int total = 0;
		for(int i=0; i<empNum; i++) {
			total += list[i].getSalary();
		}
		return total;
	}
	
}
