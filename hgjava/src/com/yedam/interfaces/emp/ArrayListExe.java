package com.yedam.interfaces.emp;

import java.util.ArrayList;

//컬렉션 간단히 설명
public class ArrayListExe {
	public static void main(String[] args) {
		//배열
		Employee[] employeeAry = new Employee[10]; //타입파라미터[배열] => 크기정해줘야.
		
		employeeAry[0] = new Employee(101, "카리나");// 추가: 인덱스에 대입.
		employeeAry[1] = new Employee(102, "윈터");
		Employee emp = new Employee(103, "닝닝");
		employeeAry[2] = emp;
		employeeAry[1] = null; //삭제.
		
		for(int i=0; i<employeeAry.length; i++) {
			if(employeeAry[i] != null) { //반드시 null아닌걸로 찾아야.
				System.out.println(employeeAry[i].getName());
			}
		}
		
		System.out.println("=============");
		
		//컬렉션
		ArrayList<Employee> employeeAryList = new ArrayList<Employee>(); 
		// utill가져와야(ctrl shift o) 
		// 배열<타입파라미터> => 크기가변적
		
		employeeAryList.add(new Employee(1, "제니")); //추가: 메소드를 사용. 알아서 0번부터 차례로.
		employeeAryList.add(new Employee(2, "로제"));
		employeeAryList.add(emp);
		employeeAryList.remove(1); //삭제.(2번인덱스-3번째위치-삭제)
		// 컬렉션은 null이 없다
		
		//.size()메소드 -> 컬렉션의 크기, .get(i)메소드 -> i인덱스의 참조주소값.. 의 getName..
		for(int i=0; i<employeeAryList.size(); i++) {
			System.out.println(employeeAryList.get(i).getName());
		}
		
	}//main
}//class
