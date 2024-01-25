package com.yedam.thread;

import java.awt.Toolkit;

// 소리출력 & 문자출력
public class BeepPrintExe {
	public static void main(String[] args) {
		//소리 낼수있는 제어권을 받아오는 클래스
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for (int i=0; i<5 ; i++) {
//			toolkit.beep(); //"삐"소리 출력
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		//새로운 스레드 만들어짐
//		Thread thread = new Thread(new BeepTask()); 1번 방법.
		Thread thread = new BeepThread();
		thread.start(); //start 호출하면 run()메소드 실행.
		
		//메인쓰레드가 실행
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(1000);//프로그램 실행 중 일시중지하는 기능
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		
		
	}
}
