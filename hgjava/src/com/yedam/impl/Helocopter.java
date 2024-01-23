package com.yedam.impl;

public class Helocopter extends Airplane{
	//Helocopter클래스도 takeOff, fly, land 꼭 구현해야하나,
	//이미 부모클래스 Airplane를 상속받아서 가지고 있음->재정의 해도 되고 안해도 되고..
	
	@Override
	public void takeOff() {
//		super.takeOff(); 이거 안하고 오버라이딩
		System.out.println("[Helocopter] - 이륙.");
	}
	@Override
	public void fly() {
//		super.fly();
		System.out.println("[Helocopter] - 이륙.");
	}
//	@Override
//	public void land() {
//		// TODO Auto-generated method stub
//		super.land();
//	}

}
