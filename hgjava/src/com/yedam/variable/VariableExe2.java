package com.yedam.variable;

import java.util.Scanner;

public class VariableExe2 {
	public static void main(String[] args) {
		// javascript 에서는 prompt를 함수 있었지만 자바에는 없다.
		// 대신 Scanner 클래스 사용
		// 자바.유틸.Scanner ctrl+shift+o -> 자바유틸스캐너 임포트 자동으로가능
		// in : 키보드속성값 (System이라는 클래스의 in속성)
		Scanner scn = new Scanner(System.in);
		//System.out.println("이름을 입력>>> ");
		//String result = scn.nextLine();
		// .nextLine() Scanner의 메소드. 입력값을 문자열로 반환 -> 변수도 문자로
		//int result2 = scn.nextInt();
		// .nextInt() 입력값을 정수로 반환 // 왜 변수명 age, 등등 변수선언 안되는지 모르겠음
		// 위에 //String result = scn.nextLine(); 주석처리하면 가능
		//System.out.println("당신의 이름은" + result + "입니다.");
		
		// 이름입력 (=name), 연락처(=phone)
		// System.out.println("이름입력>> "); 은 사용자를 위한 안내
		// Scanner scn = new Scanner(System.in); 은 계속 그냥 커서 깜박이고 있을뿐..
		System.out.println("이름입력>> ");
		String name = scn.nextLine();
		System.out.println("번호입력>> ");
		String phone = scn.nextLine();
		
		// 위에 scn하나 있는걸로 계속 입력할수있다.. scan.close할때까지..
		
		// 영어(=eng), 수학(=math) => 합계(=sum)
		System.out.println("영어점수>> ");
		int eng = scn.nextInt();
		System.out.println("수학점수>> ");
		int math = scn.nextInt();
		int sum = eng + math;
		
		// 출력
		System.out.println("이름: " + name + ", 연락처: " + phone);
		System.out.println("영어: " + eng + ", 수학: " + math + ". 합계: " + sum + ".");
		
		// 자바가상머신 리소슬 쓰고나면 리소스 해제해야함
		// 클로즈해줘야 함 (안해도 상관없다고 함)
		scn.close();
	}
}
