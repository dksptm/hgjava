package com.yedam.classes;

// 전체 프로그램에서 인스턴스를 하나만 생성.
// 이 하나만 공용으로 사용.
public class Singleton {
	// 1.생성자를 private 선언.
	// 2.이 타입(클래스)으로 필드 선언 + static + private 
	// //클래스가 메모리 읽어들이는 시점에 사용가능하게->static(static은 this사용못함, ..)
	// 3.인스턴스를 반환하도록 getInstance()제공 <- 메소드이름 관례
	private static Singleton instance = new Singleton();
	
	private Singleton(){}
	
	// static붙여줘야함. new방법으로 생성못함
	public static Singleton getInstance() {
		return instance;
	}
	// 나중에 프로그램만들때 싱글톤직접 만들지 않음 but 우리가 사용하는 서버프로그램이 싱글톤방식으로..!
}
