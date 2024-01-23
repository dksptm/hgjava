package com.yedam.interfaces.emp;

import java.util.Scanner;

public class EmployeeListApp {
	public static void main(String[] args) {
//		EmployeeList app = new EmployeeArray(); 싱글톤이라 안됨
		EmployeeList app = EmployeeArray.getInstance();
		app = EmployeeArrayList.getInstance();
		
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int menu = 0;

		while(run) {
			System.out.println("1.사원수 2.사원입력 3.사원리스트 4.사번검색 5.급여합계 6.초기값입력 9.종료");
			System.out.print("메뉴선택> ");
			menu = scn.nextInt();
			
			if(menu == 1) {
				app.init();
			}else if(menu == 2) {
				app.input();
			}else if(menu == 3) {
				app.print();
			}else if(menu == 4) {
				System.out.print("조회할 사번> ");
				int no = scn.nextInt();
				if(app.search(no).equals("없음")) {
					System.out.println("없는 사번입니다.");
				}else {
					System.out.printf("사번:%03d, 이름:%s\n", no, app.search(no));
				}
			}else if(menu == 5) {
				System.out.printf("급여의 총합은 %3d만원 입니다.\n", app.sum());
			}else if(menu == 6) {
//				.inEmp();안됨 인터페이스에 없는 메소드는 넣을수없는...새롭게 변수만들거나 인터페이스에 넣거니
			}else if(menu == 9) {
				System.out.println("종료합니다.");
				run = false;
			}else {
				System.out.println("잘못된 메뉴번호입니다.");
			}
			
		}//while
		
		System.out.println("end of prog.");
	}//main
}//class
