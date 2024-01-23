package com.yedam.impl;

public class FlyerExe {
	public static void main(String[] args) {
		//구현클래스도, 그 구현클래스를 상속받는 자식클래스도 가능
		Flyer flyer = new Airplane();
		//flyer.takeOff();
		
		flyer = new Helocopter();
		//flyer.takeOff();
		
		//위처럼 똑같은 코드이지만 구현클래스에따라 결과 다르게 나오는 것 -> 다형성
		//다형성은 필드에도, 매개변수에도 만들수있음
		
		flyer = new Seaplane();
		
		//매개변수 다형성
		Driver driver = new Driver();
		driver.drive(flyer);
		
	}//main
}//clasee
