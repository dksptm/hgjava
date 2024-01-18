package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe2 {
	public static void main(String[] args) {
		// 문자열배열
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("친구입력>> ");
		String name = scn.nextLine();

		String[] friends = {"카리나", "장원영", "태연", "청하", "아이유"};
		double[] dblAry = { 57.3, 52.5, 48.3, 49.3, 40.4 };
		int[] scores = { 78, 82, 95, 90, 91 };

		// 내 친구는 몇번째?
		boolean isExist = false;
		for(int i=0; i<friends.length; i++) {
			if(friends[i].equals(name)) {
				System.out.printf("%s는 %d번째에 있습니다.", name, (i+1));
				isExist = true;
			}
		}
		if(!isExist) System.out.println("찾는 친구가 없습니다.");
		
		// 친구의 몸무게, 점수 출력
		for(int i=0; i<friends.length; i++) {
			if(friends[i].equals(name)) {
				String str = "%s의 몸무게는 %.1fkg이고, 점수는 %d점 입니다.";
				System.out.printf(str, friends[i], dblAry[i], scores[i]);
			}
		}
		
		int max = 0;
		int idx = 0;
		for(int i=0; i<scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				idx = i;
			}
		}
		System.out.printf("가장 큰 점수: %d점, 이름: %s, 몸무게: %.1fkg.", scores[idx], friends[idx], dblAry[idx]);
		
		scn.close();
		System.out.println("\nend of prog.");
	}//main
	
	public static void method2() {
		// double타입배열
		
		double[] dblAry = { 67.3, 72.5, 88.3, 79.3, 90.4 };
		double avg, sum;
		avg = sum = 0;
		
		for(int i=0; i<dblAry.length; i++) sum += dblAry[i];
		avg = sum / dblAry.length;
		System.out.printf("평균 몸무게는 %.2fkg입니다.", avg);
		
		double max = 0;
		for(int i=0; i<dblAry.length; i++) {
			if(max < dblAry[i]) max = dblAry[i];
		}
		System.out.printf("\n제일 큰 값은 %.1fkg입니다.", max);
		System.out.println("\nend of method2.");
	}
	
	public static void method1() {
		int[] scores = new int[10]; //각각의 인덱스에는 0으로 초기화되어있음
		
		scores[3] = 40;
		scores[7] = 50;
		scores = new int[5]; // 크기변경 + 값도 모두 초기화됨(scores[3] = 40; 사라짐..)
		scores[0] = 78;
		scores[1] = 92;
		scores[2] = 77;
		scores[3] = 90;
		scores[4] = 95;
		for(int i=0; i<scores.length; i++) { //배열은 length라는 속성을 가지고 있음
			System.out.printf("scores[%d]=> %d\n", i, scores[i]);		
		}
		
		int cnt = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] >= 80) {
				cnt++;
			}
		}
		System.out.printf("80점 이상인 학생은 %d명 입니다.\n", cnt);
		
		cnt = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > 90) {
				cnt++;
			}
		}
		if(cnt > 0) {
			System.out.printf("90점 초과인 학생은 %d명 입니다.\n", cnt);
		}else {
			System.out.printf("90점 초과인 학생은 없습니다.\n");			
		}
		
		System.out.println("end of method1.");
	}//메소드1

}//class
