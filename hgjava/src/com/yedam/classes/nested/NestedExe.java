package com.yedam.classes.nested;

import java.util.Map;

public class NestedExe {
	public static void main(String[] args) {
		// Outer클래스 기능을 활용.
		Outer outer = new Outer();
		outer.method1();
		
		// 직접 중첩클래스(NestClass) 가져오기. //"Outer.NestClass"통째로타입.
		Outer.NestClass nest = outer.new NestClass();
		nest.field2 = "반갑습니다!";
		System.out.println(nest.field2);
		nest.method2();
		
		// 중첩클래스 예시: Entry클래스(Map의 멤버클래스)
		// import java.util.Map;
		Map.Entry<String, Integer> entry;
	}
}
