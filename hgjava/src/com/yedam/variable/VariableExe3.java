package com.yedam.variable;

import java.util.Scanner;

public class VariableExe3 {
	public static void main(String[] args) {
		// import없이 하려면 fullname입력 java.util.Scanner ... = new java.util.Scanner(..)
		
//		Scanner scn = new Scanner(System.in);
		
		//3명의 키(height) 입력(double)
		//키 평균(합계=sum/3)
//		double heigth = 0; 이렇게 안됨 for안에 키변수 선언해야하나봄..
		
//		double sum = 0;
//		for(int i=1; i<=3; i++) {
//			System.out.println("키를 입력>>> ");
//			double height = scn.nextDouble(); // 밖에서 변수선언하고 안에 scn.nextDouble()를 담을수없나보다..
//			sum += height;
//		}
		
		// 세사람의 평균키는 : 175.2 입니다.
//		System.out.println("세사람 평균키는 : " + (sum / 3) + "입니다.");
		// (sum / 3) 이렇게 먼저해줘야 문자열+로 안됨
		
//		scn.close();
		
		char c1 = 'a';
		System.out.println((int)c1); //97. 유니코드값으로 보고싶으면 형변환
		System.out.println(c1); // a
		
		for(int i=1; i<30; i++) {
			System.out.println(c1++);
		}
		
		int n1 = 0b1111;
		System.out.println(n1); //15 (2진수 1111은 10진수로 15)
		
		
	}

}
