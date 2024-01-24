package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {
		Date today = new Date();
		
//		System.out.println(today);
//		System.out.println(today.toGMTString());
//		System.out.println(today.toString());
//		System.out.println(today.toLocaleString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// "yyyy-MM-dd" "yyyy/MM/dd" "yy-MM-dd"...
		System.out.println(sdf.format(today)); // format() Date -> String
		try {
			today = sdf.parse("2020-01-05 12:12:12"); // parse() String -> Date 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(today); //Sun Jan 05 12:12:12 KST 2020
		
		Date now = new Date();
		System.out.println(today.before(now)); //이전. today가 now보다 이전이면 true
		
		// Date대신. LocalDate, LocalTime, LocalDateTime
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());
		
		LocalDate ld1 = LocalDate.of(2021, 2, 12);
		System.out.println(ld1.toString());
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.toString());
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		
		//.format(DateTimeFormatter.ofPattern(" ") 이렇게해야 
		// DateTimeFormatter 클래스 사용해야.
		String result = ldt.format(DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss")); //결과 String
		System.out.println(result);
		
	}//main

}//class
