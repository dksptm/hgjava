package com.yedam.operator;

import java.util.Scanner;

// 은행계좌(1개만있음) 입금, 출금, 잔고, 종료
// 10만원 초과하면 입금이 안되도록, -계좌안되게
public class BankExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0; //잔고
		boolean run = true; //while문 실행/종료 위함
		
		while(run) {
			System.out.println("1.입금 2.출금 3.잔고 4.종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch(menu) {
			case 1:
				System.out.println("입금액>> ");
				int val = Integer.parseInt(scn.nextLine());
				if(balance + val > 100000) {
					System.out.println("10만원 초과! 입금불가!");
					break;
				}
				balance += val;
				System.out.println("입금성공");
				break;
			case 2: 
				System.out.println("출금액>> ");
				val = Integer.parseInt(scn.nextLine());
				if(balance < val) {
					System.out.println("잔액부족! 출금불가!");
					break;
				}
				balance -= val;
				System.out.println("출금성공"); 
				break;
			case 3: 
				System.out.printf("잔고: %d원\n", balance);
				break;
			case 4: 
				System.out.println("종료.");
				run = false;
			}
		}
		System.out.println("end of prog.");
		scn.close();
		
	}//end main
	
}//end class
