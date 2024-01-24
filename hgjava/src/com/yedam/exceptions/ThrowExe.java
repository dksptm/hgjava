package com.yedam.exceptions;

public class ThrowExe {
	public static void main(String[] args) {
		
		try {
			method();
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
		} catch (Exception e2) {
			System.out.println("알수없는 예외.");
		}
		
		
		System.out.println("end of prog.");
	}//main

	static void method() throws ClassNotFoundException, Exception {
		
		Class.forName("java.lang.String");//존재하는 클래스가 없을수있음
		
		//throws하는 이유? 예외가 반복되어서 코드가 길어질수있음
		//이렇게...
//		try {
//			Class.forName("java.lang.Scanner");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Class.forName("java.lang.Integer");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Class.forName("java.lang.Double");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//
		
		//throws ~~~, Exception 이렇게 여러개 나열가능
		//실행한 곳에서 예외처리함
		
		
	}
	
}//class
