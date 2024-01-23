package com.yedam.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	void method1() {
		//java에서 기본적으로 제공해주는 캘린더 클래스!
		//getInstance()로 가져왔지만 싱글톤은 아니다!
		Calendar cal = Calendar.getInstance();
		
		//오늘 연도
		//Calendar 클래스로 가보면 상수가 선언되어있음(get()인덱스값이 정해져있음)
		System.out.println(Calendar.YEAR); //1
		//1월1일기준으로 가져오고싶으면
		cal.set(2024, 1, 1); //2024-2-1
		System.out.println("year: " + cal.get(1)); //위에서 상수결과로 가져오거나
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); //2 월요일 DAY_OF_WEEK라는 상수값 가져옴
		System.out.println("last Date: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH)); //해당월DAY_OF_MONTH의 마지막날getActualMaximum
		System.out.println("...");
	}//백업
	
	void method2() {
		// java.util.Date
		Date date = new Date(); //1900년 기준.
		System.out.println(date.getYear()); //124
		System.out.println(date.getYear() + 1900); //2024
		date.setYear(123); //2023년(2023-1900)
		date.setMonth(1); //2월
		// 불편하다..다른 클래스를 활용(문자열을 date타입으로, date타입을 문자열로)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //"2024-01-01"를 날짜2024-01-01
		try {
			date = sdf.parse("2024-03-01");//String -> Date 근데 예외발생할수있으니깐 꼭 예외처리해줘야(안하면 컴파일오류)			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(date.getMonth());
		System.out.println(date.getYear()+1900);
		
		// 왜 취소선이 있나? Deprecated! 지금은 사용가능하지만 앞으로 사용하지 마...		
	}
	
	public static void main(String[] args) {
		drawCalendar(2022, 1); //2024년 12월 달력
		
		
//		drawCalendar(date);//결과나오도록!
			
	}//main
	
	static void drawCalendar(Date date) {
		//Date타입으로 
	}//drawCalendar(Date date) 오버로딩
	
	
	static void drawCalendar(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);
		
		int pos = calendar.get(Calendar.DAY_OF_WEEK) - 1; //공백 //calendar.DAY_OF_WEEK 이렇게쓰면 안됨!!
		int lastDate = calendar.getActualMaximum(Calendar.DATE); //마지막날 DATE상수값해도되는구나..
		
		//요일출력
		System.out.printf("%9s%d년 %2d월\n", "", year, month);
		System.out.println(" Sun Mon Tue Wed Thr Fri Sat");
		//1일 위치지정
		for(int i=0; i < pos; i++) {
			System.out.printf("%4s", "");			
		}
		//1~말일까지 날짜출력
		for(int d=1; d<=lastDate; d++) {
			System.out.printf("%4d", d);
			if((pos+d) % 7 == 0) {
				System.out.println();
			}
		}
		
	}//drawCalendar 메소드
	
}//class
