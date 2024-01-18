package com.yedam;

import java.util.Scanner;

public class StudyArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		int number = 0;
		int[] scores = new int[1];
		int max = 0;
		int sum = 0;
		double avg = 0;
		
		while(run) {
			System.out.println("======================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
			System.out.print("선택>> ");
			int choice = Integer.parseInt(scn.nextLine());
			
			switch(choice) {
			case 1:
				System.out.print("학생수?>> ");
				number = Integer.parseInt(scn.nextLine());
				scores = new int[number];
				System.out.printf("\n학생수 %d명.\n", number);
				break;
			case 2:
				for(int i=0; i<number; i++) {
					System.out.printf("%d번 점수입력>> ", i+1);
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				System.out.print("\n점수입력 완료.\n");
				break;
			case 3:
				System.out.print("점수목록\n");
				for(int i=0; i<number; i++) {
					System.out.printf("%d번 점수=> %d\n", i+1, scores[i]);
					sum += scores[i];
					if(max < scores[i]) max = scores[i];
				}
				System.out.print("\n목록출력 완료.\n");
				break;
			case 4:
				System.out.print("분석\n");
				avg = (double)sum / number;
				System.out.printf("최고점수: %d점\n평균점수: %.2f점", max, avg);
				System.out.print("\n분석 완료.\n");
				break;
			case 5:
				System.out.print("종료!\n");
				run = false;
				break;
			}
		}
		
		System.out.println("end of prog.");
	}//메인
	
	public static void Ex05() {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
		};
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length ; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		
		avg = (double)sum / cnt;
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);			
	}//5번문제
	
}//클래스
