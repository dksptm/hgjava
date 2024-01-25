package com.yedam.classes.nested;

class Parent {
	String name;

	void showName() {
		System.out.println("이름은" + name);
	}
}

interface Runnable { // 함수형 인터페이스. 구현해야할 메소드가 하나만 존재.
	void run(String name);
}

public class AnonymousExe {
	public static void main(String[] args) {
		//참고로 Lamda표현식은 Runnable이 메소드가 하나일때만 가능하다.
		Runnable runLamda = (name) -> System.out.println(name + " 나는 달립니다.");
		runLamda.run("홍길동");
		
		runLamda = (name) -> System.out.println(name + " 빨리 달립니다.");
		runLamda.run("김길동");
		
		//지금 Runnable에 매개변수 넣어서 컴파일 오류난것임.
//		Runnable runnable = new Runnable() {// 익명 구현 객체.
//			@Override
//			public void run() {
//				System.out.println("나는 달립니다.");
//			}
//		};
//		runnable.run();
		
		Parent parent = new Parent() {// Parent의 자식객체인 익명객체. 익명 자식 객체.
			int age;

			void showInfo(String name, int age) {
				this.name = name;
				this.age = age;
				System.out.println("이름은 " + name + ", 나이는 " + age);
			}

			@Override
			void showName() { // Override도 가능
//				System.out.println("이름은 " + name + "입니다.");
				showInfo("홍길동", 20);
			}
		};
		parent.showName();// 이름은 홍길동, 나이는 20
		// parent.showInfo(); //불가능. 대신 자식의 showName안에 showInfo넣어서 사용가능
		// 왜 parent 가 자식객체를 참조하는데 그 객체의 메소드는 사용하지 못할까?

	}
}
