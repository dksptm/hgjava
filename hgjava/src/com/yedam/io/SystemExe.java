package com.yedam.io;

import java.io.IOException;

public class SystemExe {
	public static void main(String[] args) {
		while(true) {
			System.out.println("입력>> ");
			try {
				int input = System.in.read(); //byte타입으로 읽고, int타입으로 반환
				if(input == 57) { // 9입력하면 종료
					System.out.println("종료.");
					break;
				}
				System.in.read(); //13
				System.in.read(); //10
				System.out.println((char)input);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
}
