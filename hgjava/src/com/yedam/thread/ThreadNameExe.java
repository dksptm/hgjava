package com.yedam.thread;

class ThreadA extends Thread {
	
	//생성자
	ThreadA(){
		setName("Thread-A");
	}
	
	//Thread의 run메소드 재정의.
	//Thread.start()하면 run()실행.
	//getName()은 스레드 이름 가져오는 메소드.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for(int i=0; i<30; i++) {
			System.out.println("ThreadA이름: " + getName());
		}
		System.out.println("end of A.");
	}
}

class ThreadB extends Thread {
	//생성자
	ThreadB(){
		setName("Thread-B");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for(int i=0; i<2; i++) {
			System.out.println("ThreadB이름: " + getName());
		}
		System.out.println("end of B.");
	}
}

public class ThreadNameExe {
	public static void main(String[] args) {
		//main메소드-> 메인스레드
		
		//currentThread(): static메소드. 현재 실행되는 스레드 정보.
		Thread mainThread = Thread.currentThread();
		System.out.println("시작 Thread이름=> " + mainThread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("ThreadA이름=> " + threadA.getName());
		threadA.start();
		Thread threadB = new ThreadB();
		System.out.println("ThreadB이름=> " + threadB.getName());
		threadB.start();
		
		System.out.println("end of main.");
		
		
	}
}
