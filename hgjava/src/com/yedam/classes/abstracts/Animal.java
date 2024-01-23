package com.yedam.classes.abstracts;

// 추상클래스. abstract.<-클래스 자체에.
public abstract class Animal {
	//필드
	private String name;

	//생성자도 만들수있다. 하지만 new로 인스턴스 못만든다.
	public Animal() {
	}
	public Animal(String name) {
		this.name = name;
	}
	
	//메소드
	public void eat() {
		System.out.println("[Animal] 음식을 먹습니다.");
	}
	//추상메소드 -> 선언만한다.구현부분이 없다.{블럭}이 없다.자식클래스에서 구현한다. 리턴타입앞에 abstract.
	//반드시 자식클래스에서 overriding.
	public abstract void sleep();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
