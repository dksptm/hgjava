package com.yedam.classes.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		
//		Animal animal = new Animal(); 불가.추상클래스라서.
		//아래는 가능
		Animal animal = null;
		animal = new Bird("제비"); //Animal animal = new Bird("제비");
		animal.eat();
		animal.sleep();
		
		Animal gugu = new Bird("비둘기");//가능
		
		Bird bird = new Bird("참새");
		bird.eat(); //부모 메소드
		bird.sleep(); //추상 메소드
		
//		System.out.println(bird.name); //name이 접근제한자라.
		System.out.println(bird.getName());
		
		Dog dog = new Dog();
		Bird[] birds = new Bird[5]; //이렇게 새의 배열만들고
//		birds[0] = dog; 불가능. 타입이 달라서.
		
		//위에서 new Animal()은 불가능하지만 배열은 가능하다. 왜? 배열을 생성하는거니깐!
		Animal[] animals = new Animal[5];
		animals[0] = bird;
		animals[1] = dog; //이게 가능함(이거는 상속이면 다 가능)
		
		//예) 윈도우에서 규칙을 제시(단면프린트, 양면프린트 메소드만 선언해줌-윈도우가 프린트구현까지는 하지않음)
		// 프린트회사에서 각각의 규칙(추상메소드)에 맞게 구현한다.-반드시 overriding하게 하니깐.
		// 추상클래스의 의미 : 반드시 구현할,해야할 규칙을 정한다!
	}

}
