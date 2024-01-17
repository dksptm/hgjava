package com.yedam.condition;

public class ForLoopExe1 {
	public static void main(String[] args) {
		// for(초기값;조건식;증감값){실행구문}
		// for->반복횟수가 정해져 있는 경우
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
			if(i > 5) {
				break;
			}// 이렇게하면 아예 반복문자체를 빠져나간다.
		}
//		System.out.println(i); i변수 선언안된 오류. i는 반복문안에서만 의미있는것.
		
		// 1 ~ 10까지 홀수 합을 계산
		int sum = 0;
		for(int n=1; n<=10; n++) {
			if(n % 3 == 0) {
				sum += n;				
			}
		}
		System.out.printf("누적값은: %d\n",sum);
		
		// 1 ~ 31까지 반복
		System.out.printf("%3s", "");
		for (int d=1; d<=31; d++) {
			System.out.printf("%3d", d);
			if(d % 7 == 6) {
				System.out.println();
			}
		}
		
	}//main
}//class
