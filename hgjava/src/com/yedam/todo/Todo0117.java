package com.yedam.todo;

import java.util.Scanner;

public class Todo0117 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String friend = "";
		
		for(int i=0; i<3; i++) {
			System.out.println("친구 이름>> ");
			friend += "이름: " + scn.nextLine();
			System.out.println("연락처>> ");
			friend += "\n연락처: " + scn.nextLine();
			friend += "\n====================\n";			
		}
		scn.close();
		System.out.println("입력완료\n"+ friend);
		
		System.out.println("end of prog.");
	}//main
	
	public static void method1() {
		Scanner scn = new Scanner(System.in);
		String[] nameAry = new String[3];
		String[] phoneAry = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("친구 이름>> ");
			nameAry[i] = scn.nextLine();
			System.out.println("연락처>> ");
			phoneAry[i] = scn.nextLine();
		}
		System.out.println("입력완료");
		scn.close();
		for(int i=0; i<3; i++) {
			System.out.printf("이름: %s\n연락처: %s\n", nameAry[i], phoneAry[i]);
			System.out.println("====================");
		}
		// 친구3명의 이름과 연락처를 입력하도록.. 메시지 출력.
		// 입력완료.
		
		// 이름: 홍길동
		// 연락처: 010-1111-2222
		// ====================
		// 이름: 김길동
		// 연락처: 010-2222-3333
		// ====================
		// 이름: 박길동
		// 연락처: 010-3333-4444
		// ====================
		
		// 종료조건 3번입력되면 완료되도록
		System.out.println("end of method1.");
	}//메소드1
}//class
