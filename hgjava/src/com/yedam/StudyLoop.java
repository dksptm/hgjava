package com.yedam;

public class StudyLoop {
	public static void main(String[] args) {
		
		System.out.println("end of prog.");
	}//main
	public static void Ex06() {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=(4-i) ;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	public static void Ex02() {
		//160쪽 2번문제
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);			
	}
	public static void Ex03() {
		//161쪽 3번문제
		while(true) {
			int nun1 = (int)(Math.random() * 6)+1;
			int nun2 = (int)(Math.random() * 6)+1;
			int sum = nun1 + nun2;
			System.out.printf("(%d, %d)\n", nun1, nun2);			
			if(sum == 5)
				break;
		}
	}
	public static void Ex04() {
		// 4번문제
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}		
	}
	
}//class
