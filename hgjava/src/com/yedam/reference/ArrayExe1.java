package com.yedam.reference;

public class ArrayExe1 {
	public static void main(String[] args) {
		// 선언.
		// int[] -> 이거자체가 타입 (int를 담아놓은 배열타입), int와 다르다!
		// intAry -> (참조,배열)변수이름.
		// int[]는 int와 같은 타입이 아니지만 int[]의 각 요소(?)값(?)은 int다.
		int[] intAry = {10, 20, 30}; // intAry[i] === int
		// 선언과 동시에 값을 할당
		
		// 제어문처럼 배열도 다중배열 쓸수있다...
		// int[]배열을 다시 []배열로 담겠다.
		// 배열에 담고있는 값이 또 배열
		int[][] intArray = { {10, 20}, {30, 40}, {50}};
		// intArray[0] !== int,  intArray[0] === int[]
		// intArray[0][0] === int
		System.out.println(intArray[0]); // 주소값([I@3d012ddd)
		
		// 선언할때 크기만 선언
		String[] strAry = new String[5];
		// 선언하는 시점에 값을 담는게 아니면 이렇게 값을 할당
		strAry = new String[] {"Hello", "World", "Nice"};
		
		// javascript의 for of같은거 사용
		
	}
}
