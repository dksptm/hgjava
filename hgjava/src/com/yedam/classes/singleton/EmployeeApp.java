package com.yedam.classes.singleton;

import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		EmployeeList app = EmployeeList.getInstance();
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int menu = 0;
		
		while(run) {
			System.out.println("1.사원수 2.사원입력 3.사원리스트 4.사번검색 5.급여합계 9.종료");
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
					System.out.printf("사번:%d, 이름:%s\n", no, app.search(no));
				}
			}else if(menu == 5) {
				System.out.printf("급여의 총합은 %3d만원 입니다.\n", app.sum());
			}else if(menu == 9) {
				System.out.println("종료합니다.");
				run = false;
			}else {
				System.out.println("잘못된 메뉴번호입니다.");
			}
			
		}
		System.out.println("end of prog.");
	}//main
}//class
