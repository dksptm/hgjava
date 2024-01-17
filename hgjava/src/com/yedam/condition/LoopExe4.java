package com.yedam.condition;

public class LoopExe4 {
	public static void main(String[] args) {
		for(int j=4; j>0; j--) {
			for(int i=1; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//main
	
	public static void method1() {
//		for(int j=2; j<=9; j++) {
//		// 시작
//		int num = j; //단정보
//		for(int i=1; i<=9; i++) {
//			// 3 x 1 = 3
//			System.out.printf("%d x %d = %d\n", num, i, (num*i));
//		}
//		// 끝
//	}	
	}//메소드1
	public static void method2() {
		// 구구단 출력
//		for(int i=2; i<=9; i++) {
//			System.out.printf("===%d단===\t", i);
//		}
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.printf("%2d x %d = %2d  ", i, j, (i*j)); //"%d x %d = %d\t"
			}
			System.out.println();
		}
	}
	public static void method3() {
		// 별찍기..반복문횟수가 가변적!
		// println사용하면 안됨(줄바꿈되니깐)
		for(int j=2; j<=5; j++) {
			for(int i=1; i<j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}//class
