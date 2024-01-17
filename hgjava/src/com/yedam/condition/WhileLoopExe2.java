package com.yedam.condition;

import java.util.Scanner;

public class WhileLoopExe2 {
	public static void main(String[] args) {
		//반복횟수 정해져있을때 써도 되지만
		//조건만족시 반복종료하고 싶을때 많이 사용
		//(어떤 조건일 동안 반복)
		
//		Scanner scn = new Scanner(System.in);
//		int random = (int)(Math.random() * 5) + 1; //1~10 정수난수
//		while(true) {
//			System.out.println("값입력>> ");
//			if(random == scn.nextInt()) {
//				System.out.printf("임의값 %d\n", random);
//				break;
//			}
//			System.out.println("틀린값");
//		}
		
		Scanner scn = new Scanner(System.in);
		int random = (int)(Math.random() * 100) + 1; //1~10 정수난수
		while(true) {
			System.out.println("값입력>> ");
			int num = scn.nextInt();
			if(random == num) {
				System.out.printf("임의값 %d\n", random);
				break;
			}
			//값이 틀릭 경우를 구분
			
			// if하나만 사용
			if(random > num) {
				System.out.printf("%d보다 큽니다.\n", num);
				continue;
			}
			System.out.printf("%d보다 작습니다.\n", num);
			
			// if, else만 사용
//			if(random > num) {
//				System.out.printf("%d보다 큽니다.\n", num);
//			}else {
//				System.out.printf("%d보다 작습니다.\n", num);
//			}
			
			//내가한것
//			}else if(random > num) {
//				System.out.printf("%d보다 큽니다.\n", num);
//			}else if(random < num) {
//				System.out.printf("%d보다 작습니다.\n", num);				
//			}
		}//while
		
		System.out.println("end of prog.");
		scn.close();
	}//main
}//class
