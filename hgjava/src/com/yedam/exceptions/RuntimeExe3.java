package com.yedam.exceptions;

import java.util.Scanner;

public class RuntimeExe3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			int menu = 0;
			
			while(true) {//다시 숫자 입력할 수 있도록 기회줘야.
				System.out.println("1.실행 2.종료");
				try {
					menu = Integer.parseInt(scn.nextLine());
					break; //정상실행되면 반복문 빠져나가도록
				}catch(NumberFormatException ne){//입력값이 공백,숫자..
					System.out.println("숫자입력.");
				}				
			}
			
			if(menu == 1) {
				System.out.println("실행합니다.");				
			}else if(menu == 2) {
				System.out.println("종료합니다.");
				break;
			}	
		}//while
		
		System.out.println("end of prog.");
	}//main
}//class
