package com.yedam.classes.nested;

public class Outer {
	String field1;
	
	// 인스턴스 멤버 클래스
	class NestClass{ //중첩클래스.
		String field2;
		
		void method2() {
			System.out.println("method2().");
		}
	}
	
	// 정적 멤버 클래스
	static class StaticClass{ //중첩클래스.
		static String field3;
		static void method3() {
			System.out.println("method3().");
//			NestClass nest = new NestClass(); 컴파일오류. 인스턴스메소드 안에서 정적은 가능. 반대는 불가능.
		}
	}
	
	void method1() {
		NestClass nest = new NestClass(); //(인스턴스 멤버 클래스)의 인스턴스 생성
		nest.field2 = "field2 안녕!";
		System.out.println(nest.field2);
		nest.method2();
		
		StaticClass.method3();
	}

}
