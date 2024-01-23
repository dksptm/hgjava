package com.yedam.classes.abstracts;

public class Bird extends Animal {
	
	public Bird(String name) {
		super(name); //부모의 생성자 물려받음(필드도 물려받음)
	}

	@Override
	public void sleep() { //만약 이 추상메소드를 overriding안하면 오류.무조건해야.
		// TODO Auto-generated method stub
		System.out.println("[Bird]가 잠을 잡니다.");
	}

}
