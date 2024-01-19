package com.yedam.classes;

// 학생정보관리 기능구현 -- 말하자면 Student의 메소드를 모아두는..?
public class StudentApp {
	// *****클래스에 static 붙이는거 아니다!!!*****
	// 그냥 필드와 메소드에 붙이는것
	
	// 필드
	private static Student[] students; //초기값 null (배열이라서.. 객체라서..)
	
	// 생성자
	public StudentApp() {
		students = new Student[10]; //Student 타입이 모여있는 배열생성
	}
	
	// static 사용위해
	// studens에 메모리를 할당해줘야 함
	static {
		students = new Student[10];
	}
	// 클래스를 읽어들이는 시점에 미리 students = new Student[10]; 실행해줌
	
	
	// 생성자 만드는 규칙 :
	// 클래스명과 똑같은 이름의 메소드처럼 생긴거 만들기
	// 대신 반환 타입 없다.
	
	// 메소드 : CRUD 
	// --> 이 기능들은 메인이 있는 클래스(StudentExe, MainExe)에서 호출
	// 입력내용은 StudentApp, 호출(사용)은 StudentExe
	// 이렇게 다른 클래스.. 매개변수를 활용할수밖에 없다.
	
	// 1)등록
	// Student라는 데이터타입이 매개값으로 들어온다.(std) (매개값 넣을때 Student타입의 매개값을 넣어줘야함)
	// String sno.. 이렇게해도 되지만 Student 활용!
	public static boolean add(Student std) {
		for (int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = std;
				return true;
			}
		}
		return false;
//		System.out.println("입력성공"); // 이거보다는 이 add는 등록기능이라 true, false 반환되는 값으로 처리
		// --> 리턴을 넣어줘야함. void 말고 boolean // 그리고 return 이 있어서 종료되니깐 break빼줌	
	}//add
	// 이 true,false를 가지고 Exe(메인메소드실행클래스)에서 뭘 한다.. >>깔끔한 정리를 위해 MainExe하나 만듬(원래는 스튜던트Exe)
	
	// 2)목록 (반환타입은 위의 Student[])
	public static Student[] list() {
		return students;
	}
	
	// 3)수정 (점수만수정)
	// 누구점수 수정? 중복되지 않는 값으로! 이름(동명이인)보다는 학생번호! 매개값으로 학생번호, 점수(수정해야하니깐)
	// 리턴 : 수정잘됐는지 안됐는지 불린으로..
	public static boolean modify(String sno, int score) {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null && students[i].getSno().equals(sno)) {
				//students[i].equals()이렇게하면 안됨! Student에는 이름도..점수도..그렇다고 .sno도 프라이빗으라 안되 > 겟!
				students[i].setScore(score);
				return true;
			}
		}
		return false;
	}
	
	// 4)삭제(사실 삭제는 실제로는 잘 안하는..)
	// 매개값(학생번호)
	public static boolean remove(String sno) {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null && students[i].getSno().equals(sno)) {
				students[i] = null;
				return true;
			}
		}
		return false;	
	}
	
	// 단건조회
	public static Student get(String sno) {
		for(int i=0; i<students.length; i++) {
			if(students[i] != null 
					&& students[i].getSno().equals(sno)) {
				return students[i];
			}
		}
		return null;
	}

}// class
