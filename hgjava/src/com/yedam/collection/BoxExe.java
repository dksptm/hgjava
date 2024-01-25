package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoxExe {
	public static void main(String[] args) {
		// 제너릭
		Box<String> box = new Box<String>(); // 이제 box에는 String만 담을수있다.
		// Box클래스에서 T부분이 모두 String으로!
		box.setObj("Hong");
//		box.setObj(200);	컴파일오류!
		String result = box.getObj();

		Box<Integer> boxi = new Box<>(); // 뒤에는 <>안에 생략해도..
		boxi.setObj(100);
		Integer resulti = boxi.getObj();

		// List..제너릭. 선언하는 시점에 타입을 담는 것!
		List<Integer> list = new ArrayList<>();
		
		// <> 타입 안정해도 되기는 됨. 대신 목적이 사라짐!

	}// main

	static void method() {
		//Box가 제너릭아니고 그냥 Object obj..인 경우
		Box box = new Box();
		box.setObj("Hong");
//		box.getObj(); 이 결과는 Object 타입이이라서, get하려면 casting해줘야 함
		// 개발자가 어떤 타입으로 set했는지 확인하고, 하나하나 알려줘야함
		String result = (String) box.getObj();
		box.setObj(100);
		box.setObj("ㅇㅇ");
		Integer result2 = (Integer) box.getObj();
		// 컴파일에러말고 실행에러..
		System.out.println(result2);

	}

}// class
