package com.yedam.operator;

import java.util.Scanner;

public class OperarExe1 {
	public static void main(String[] args) {
		
		// method1(); 이렇게하면 메소드1 호출, 그대로 실행됨

		int result = 0;
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("숫자입력>>> ");
			String input = scn.nextLine();
			if(input.equals("quit")) {
				scn.close();
				break;
			}
			// 만약 quit 아닌 다른 문자열 입력? 예외가 발생한 것!
			// 예외 발생한 것에 대한 처리를 해줘야 한다. => try{}catch{}
			try {
			result += Integer.parseInt(input);
			} catch(Exception e) {
				System.out.println("숫자만 입력하세요");
				// 현재 반복문 중에 있기때문에 이렇게만해도 다시 while처음으로 돌아감
			}
		}
		System.out.printf("누적값은 %d 입니다.\n", result);
		System.out.println("end of prog");
		
	}//end main
	
	public static void method1() {
		int sum = 1 + 2 * 3;
		// 우선순위 sum+5 -> 결과를 sum에 대입
		sum = sum + 5;
		sum += 5;
		// javacript와 달리 === 등 없다. 
		// 애초에 타입이 다르면 연산이 안되기 때문!
		
		String str = "";
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("문자열 입력 >>> ");
			String input = scn.nextLine();
			if(input.equals("quit")) {
				scn.close();
				break;
			}
			str += input + ", ";
		}
		System.out.printf("누적내용: %s\n", str);
	}// end method1
	
}//end class
