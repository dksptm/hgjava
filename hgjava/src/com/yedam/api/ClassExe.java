package com.yedam.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ClassExe {
	public static void main(String[] args) throws FileNotFoundException {
		Class cls = String.class;
		
		try {
			cls = Class.forName("com.yedam.api.Member");
			System.out.println(cls);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("---------");
		
//		String str = "";
//		cls = str.getClass();
		
		//해당 클래스 메소드
		Method[] methods = cls.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("---------");
		
		//해당 클래스 필드
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		System.out.println("---------");
		
		//경로정보
		String path = cls.getResource("ObjectExe.class").getPath();
		System.out.println(path);//ObjectExe 클래스의 경로
		
		//cls (Member)기준으로 HelloWorld.class의 상대위치를 본다.
		path = cls.getResource("../HelloWorld.class").getPath();
		System.out.println(path);
		
		System.out.println("---------");
		
		//Member(cls)와 같은경로에 sample.txt 만들기
		path = cls.getResource("sample.txt").getPath();
		System.out.println(path);
		
		//경로에 있는 파일을 읽어들이겠다. -> 예외처리필요 -> throws로 했음
		Scanner scn = new Scanner(new File(path));
		while(true) {
			try {
				System.out.println(scn.nextLine());				
			}catch(NoSuchElementException e) {
				System.out.println("더 읽을 라인이 없음.");
				break;
			}
		}
		
		System.out.println("end of prog.");
	}
}
