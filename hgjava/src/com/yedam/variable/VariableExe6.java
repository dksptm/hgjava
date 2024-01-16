package com.yedam.variable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class VariableExe6 {
	public static void main(String[] args) throws FileNotFoundException {
		
		// 표준입력:키보드(System.in), 표준출력:모니터(System.out).
		
		// println() 구문출력 메소드  
		// System.out 표준출력으로 println() 구문출력하겠다.
		
		// Scanner (매개변수?)안의 값을 읽어들이고 처리하는 클래스 
		// nextLine(): 한 라인씩 읽어서 "문자열"로 반환하는 스캐너클래스의 메소드
		
		// 기본입출력클래스 InputStream
		// D:\git\hgjava\hgjava에 txt파일 저장
		
		InputStream is = new FileInputStream("test.txt"); 
		Scanner scn = new Scanner(is);
		
		String name = scn.nextLine(); 
		
		// **권장하지 않음 -> int age = scn.nextInt();
		// 만약에 20 (enter) 010-1111-2222 이었다면
		// nextInt는 처음에는 20만 읽고 (enter)는 안읽음
		// 다음에 nextLine 하면 010-1111-2222 이 아닌 (enter)를 읽어옴
		// 인풋미스매치 오류남**
		
		int age = Integer.parseInt(scn.nextLine());
		double height = Double.parseDouble(scn.nextLine()); 
		
		scn.close();
		
		String str = "이름은 %s, 나이는 %d세, 키는 %.2fcm 입니다.";
		System.out.printf(str, name, age, height);
		// %s : 첫번째 값은 문자열로, %d : 두번째 값은 디지털(10진수)으로, 
		// %.1f : 세번째 값은 실수(소수점1째자리까지)가져오는 형태
		
	} //end main
	
} //end class
