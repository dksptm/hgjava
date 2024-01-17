package com.yedam.condition;

public class CalendarExe {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.printf("%d월\n", i);
			method1(i);			
		}

	}//main
	
	public static void method1(int mm) {
		// 달력만들기
		int month = mm; //~4월까지
		
		// 변수: 월의 1이 위치
		int pos = 0;
		// 변수: 월의 마지막날짜
		int lastDay = 0;
		// 월이 변경될때마다 pos, lastday 계산
		
		switch(month) {
		case 1: pos = 1; lastDay=31; break;
		case 2: pos = 4; lastDay=29; break;
		case 3: pos = 5; lastDay=31; break;
		case 4: pos = 1; lastDay=30; break;
		case 5: pos = 3; lastDay=31; break;
		case 6: pos = 6; lastDay=30; break;
		case 7: pos = 1; lastDay=31; break;
		case 8: pos = 4; lastDay=31; break;
		case 9: pos = 0; lastDay=30; break;
		case 10: pos = 2; lastDay=31; break;
		case 11: pos = 5; lastDay=30; break;
		case 12: pos = 0; lastDay=31; break;
		}
				
		//System.out.println(" Sun Mon Tue Wed Thr Fri Sat");
		String[] days = {"일","월", "화", "수", "목", "금", "토"};
		for(int i=0; i<days.length; i++) {
			System.out.printf(" %s  ", days[i]);
		}
		System.out.println();
		for(int i=0; i < pos; i++) {
			System.out.printf("%4s", "");			
		}			
		for(int d=1; d<=lastDay; d++) {
			System.out.printf("%4d", d);
			if((pos+d) % 7 == 0) { // 또는 d % 7 == (7-pos)
				System.out.println();
			}
		}
		System.out.println();
	}//메소드1
	
}//class
