package com.yedam.thread;

class PrintThread2 extends Thread {
	int i=0;
//	@Override
//	public void run() {
//		while(true) {//종료조건없음.
//			++i;
//			System.out.println("실행중.."+i);
//			++i;
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				System.out.println("interrupt()");
//				break; //스레드를 종료하기 위한 코드작성
//			}
//		}
//		System.out.println("자원정리.");
//		System.out.println("실행종료.");
//	}
	
	@Override
	public void run() {
		try {
			while(true) {
				i++;
				System.out.println("실행중.." + i);
				Thread.sleep(1);
			}
		}catch(InterruptedException e){
			
		}
		System.out.println("자원정리.");
		System.out.println("실행종료.");
	}
	
}

public class InterruptExe {
	public static void main(String[] args) {
		PrintThread2 thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//run메소드 안에서 interrupt예외 호출
		//실행되는 thread에 Interrupted예외 발생
		thread.interrupt();
		System.out.println("i값"+thread.i);
		
	}
}
