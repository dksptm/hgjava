package com.yedam.reference;

public class RefExe1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 100;
		System.out.println(n1 == n2); //true 값을 비교.
		
		String str1 = new String("홍길동"); //홍길동이라는 값을 가지고있는 객체를 참조하는 주소값
		String str2 = new String("홍길동");
		System.out.println(str1 == str2); //false 주소값을 비교.
		System.out.println(str1.equals(str2)); //true 값을 비교하는 equals메소드로 값을 비교.
		
		int[] intAry = new int[10]; //배열 소문자[], 선언할때 크기정해줘야함
		intAry = null; //더이상참조하지 않도록 끊어줌.
//		System.out.println(intAry[0]); // 예외발생
	}
}
