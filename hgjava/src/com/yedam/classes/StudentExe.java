package com.yedam.classes;

// Student 가 같은 패키지안에 있으면 그냥 사용
// 다른 패키지에 있으면 import 해주면 되는데, 생성자에 public이 되어있어야 함

// 실행클래스 -> 메인메소드 있어야 함
public class StudentExe {
	
	// 클래스가 실행되면 바로 불러오는 특별한 메소드 -> 메인메소드
	public static void main(String[] args) {
		// Student 라는 생성자 호출 -> 호출하면 생성자 {블럭}안에 있는 코드 실행
		Student s1 = new Student(); // 인스턴스생성.
		// 이 new Student에서 ctrl누른상태에서 클릭하면 해당클래스 생성자로 이동함
//		System.out.println(s1.sno); // 생성자{..}에 있던 초기화 값(S001 or null). 생성자통해 초기화진행

//		s1.sno = "S001"; // Student클래스에서 필드에 private 해서 이렇게 접근못함
//		s1.sname = "홍길동";
//		s1.score = 80;
//		s1.height = 178.9;
		
//		System.out.println(s1.sno); // private하면 이것도 안됨
		s1.showInfo(); // Student클래스 메소드 사용
		
//		Student s2 = new Student(); 이렇게도 되고
		Student s2 = new Student("S002", "김길동");
//		s2.score = 85;
		s2.showInfo();
		
		Student s3 = new Student("S003", "박길동", 90); // 매개값3개의 생성자 안만들고 그냥하면 에러, 생성자추가해줘야
		s3.showInfo();
		
		Student s4 = new Student("S004", "아이유", 100, 160.2);
		s4.showInfo();
		
		s1.setScore(87);
		
		
		
	}

}
