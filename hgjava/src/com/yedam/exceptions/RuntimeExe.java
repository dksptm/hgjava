package com.yedam.exceptions;

public class RuntimeExe {
//Class.forName("java.lang.String") 자바랑패키지안에 스트링클래스있는지 체크한후 스트링객체를 반환해줌
	public static void main(String[] args) {
		//예외처리-> 프로그램이 정상적으로 종료되는것이 목적.(프로그램이 강제종료되는것이 아닌)
		
//		Class.forName("java.lang.String"); //일반예외(컴파일시점에 확인가능)(컴파일자체가안됨.프로그램실행자체가안됨)
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//실행예외
		String str = null;
		try {
			System.out.println(str.toString());//객체의 주소값이 없는데, 그 객체를 참조하는 메소드를 쓰고있음			
		}catch(NullPointerException e) {
			System.out.println("참조값이 없음.");
			str = "ten";
		}
		
		try {
			int num = Integer.parseInt(str);
			System.out.println(num);			
		} catch(NumberFormatException e) { //(NumberFormatException.java:67) NumberFormatException 클래스
			System.out.println("숫자로 변경 불가.");
		}
		
		//catch 안에도 의미가 맞는 코드를 넣어야 한다.
		
		
		
		
		
		System.out.println("end of prog.");
	}
}
