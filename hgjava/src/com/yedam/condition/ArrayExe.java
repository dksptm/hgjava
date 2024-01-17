package com.yedam.condition;

public class ArrayExe {
	public static void main(String[] args) {
		// 배열 : javascript와 달리 같은 타입만 가능하고 배열=[]이었으나, 자바는 배열={},
		// (javascript는 객체={})
		// 한번 선언한 배열의 크기한번 정해졌으면 변경안됨(?) javascript와 달리 크기초과 불가능
		// push 이런거 안됨(javascript의 메소드사용못함)
		// length속성은 사용가능
		// 배열의 크기 변경하고 싶으면? 다시 인스턴스생성 
		// new int[] = {새로담을..}; 또는 new int[10];(0, 0, 0, ... 0만 10개)
		
		int[] intAry = {10, 20, 30};
//		intAry[3] = 40; //3번인덱스에 40담겠다 -> 4번인덱스 없음(초과)->예외발생
		intAry[2] = 40; //가능. 2번인덱스(30)을 40으로 변경
		
		// 배열크기재설정
		intAry = new int[] {10, 20, 30, 40, 50};
		intAry = new int[10];
		
		intAry[0] = 100; 
		System.out.println(intAry[0] + ", 크기:" + intAry.length);
		System.out.println("---end---");
		
		// 배열에 값을 저장
		for(int i=0; i<intAry.length; i++) {
			intAry[i] = (int)(Math.random() * 10);
		}
		
		// 2, 3의 배수의 값의 합을 각각 int sum2, sum3에 저장 (6은 2와 3의 배수)
		int sum2, sum3;
		sum2 = sum3 = 0;
		for(int i=0; i<10; i++) {
			System.out.printf("%d ", intAry[i]);
			// 내가한것
//			if(intAry[i] % 2 == 0) {
//				sum2 += intAry[i];
//			}
//			if(intAry[i] % 3 == 0) {
//				sum3 += intAry[i];
//			}
			if(intAry[i] % 2 == 0 && intAry[i] % 3 == 0) {
				sum2 += intAry[i];
				sum3 += intAry[i];
			}else if(intAry[i] % 2 == 0) {
				sum2 += intAry[i];
			}else if(intAry[i] % 3 == 0) {
				sum3 += intAry[i];
			}
		}
		System.out.printf("\n2의 배수의 합=> %d\n3의 배수의 합=> %d\n", sum2, sum3);
		System.out.println("---end---");
		
		String[] strAry = { "hong", "Park", "Kim", "20" }; //20은 int아니고 String
		for(int i=0; i<strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		
	}//main

}//class
