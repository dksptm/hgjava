package com.yedam.thread.synchronize;

public class MainThread {
	public static void main(String[] args) {
		// 공유하기위한(memory필드) 인스턴스 생성
		// memory 필드를 User1, User2
		Calculator calculator = new Calculator();

//		Thread user1 = new User1(); User1의 setCal~ 쓰기위해 User1으로 생성
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); // memory = 100 (2초대기)

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start(); // memory = 50 (2초대기)

		// 결과 User1 Thread >> 50, User2 Thread >> 50
		// 공유영역을 침범해서 작업하고 있음
	}
}
