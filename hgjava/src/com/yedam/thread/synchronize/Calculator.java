package com.yedam.thread.synchronize;

public class Calculator {
	// Thread User1, User2 작업공간
	private int memory;

	public int getMemory() {
		return memory;
	}
	public synchronized void setMemory(int memory) {
		System.out.println(Thread.currentThread().getName()); //현재실행스레드 보기위함.
		this.memory = memory;
		
		try {
			Thread.sleep(2000); //너무빨리처리하면 보기힘드니깐.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " >> " + this.memory);
	}
	
}
