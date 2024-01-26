package com.yedam.thread.synchronize;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User2 Thread"); //Thread상속받았으니 setName 가능한듯..
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
