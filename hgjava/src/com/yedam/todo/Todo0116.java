package com.yedam.todo;

import java.util.Scanner;

public class Todo0116 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("값을 입력>>> ");
			String input = scn.nextLine();
			if(input.equals("quit")) {
				System.out.println("<<end of prog>>");
				scn.close();
				break;
			}else {
				System.out.println("입력값은 " + input +" 입니다.");				
			}
		}
		
		// 입력값은 ~~ 입니다.
		// 입력값은 ~~ 입니다.
		// ...
		// quit 값이 들어오면 콘솔에 <<end of prog>> 프로그램 종료시키기
		// javascript에서는 ==를 사용해서 비교하겠지만
		// java에서는 equals라는 메소드(?) 함수(?) 사용
		
	}//end main
}//end class
