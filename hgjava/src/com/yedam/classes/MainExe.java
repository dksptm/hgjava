package com.yedam.classes;

import java.util.Scanner;

public class MainExe {
	static Scanner scn = new Scanner(System.in);
	// main안에 있으면 다른 메소드에서 사용못하니깐.. 일단 밖으로 빼고!
	// 지금은 Scanner scn 는 필드이다!
	// 각 메소드마다 인스턴스를 만들거나, static 하거나해야하니깐
	// static 해준다.
	
//	static StudentApp app = new StudentApp(); 이제 이것도 static해준다.
	
	static String sno="", sname="";
	static int score=0;
	static double height=0.0;
	// 이것도 각 메소드마다 사용해야하니깐.. 필드로 뺀다.
	
	// 1.등록
	public static void insert() {
		System.out.print("학생번호>>> ");
		sno = scn.nextLine();
		System.out.print("학생이름>>> ");
		sname = scn.nextLine();
		System.out.print("학생점수>>> ");
		score = Integer.parseInt(scn.nextLine());
		System.out.print("학생키>>> ");
		height = Double.parseDouble(scn.nextLine());
		// 위의 입력데이터를 app.add(null) 매개값으로 사용하기 위해(매개값은 Student타입이므로)
		Student std = new Student(sno, sname, score, height);
		
//		app.add(std) // 매개값으로 Student타입 넣어줘야. 위의 sno~ 등으로 Student 타입 만들어줘야함
		// 그리고 이 add는 boolean을 리턴함 이 값을 가지고(변수든 제어문이든) 뭘 해야함
		
		if(StudentApp.add(std)) {
			System.out.println("입력성공!");
		} else {
			System.out.println("입력실패!");
		}
	}// 등록메소드

	// 2.목록
	public static void list() {
		Student[] list = StudentApp.list(); //반환타입이 Student[]라서 Student[]타입의 변수명list 선언, 담기
		for(int i=0; i<list.length; i++) {
			if(list[i] != null) {
				list[i].showInfo(); //list[i]는 Student 배열아니고 그냥 Student 타입(클래스), showInfo메소드사용가능
			}
		}
		System.out.println("조회완료!");
	}// 목록메소드
	
	// 3.수정
	public static void update() {
		System.out.print("수정할 학생번호>>> ");
		sno = scn.nextLine();
		// app.get()을 이용해서 정상 학번 체크
		if(StudentApp.get(sno) == null) {
			System.out.println("없는 학생번호입니다!!");
			return; //메소드의 종료 //원래 break; switch종료---> 이제 메소드로 들어왔으니깐 메소드를 끝낸다.--->return
		}
		
		// 점수가 정상인지(왜 app아닌 여기에다? 일단 입력을 여기에다 받으니깐..)
		while(true) {
			System.out.print("수정할 점수>>> ");
			score = Integer.parseInt(scn.nextLine());
			if(score < 0) {
				System.out.println("점수를 확인하세요!!");
				continue;
			}
			break; //while나가기
		}
		
		if(StudentApp.modify(sno, score)) {
			System.out.println("수정완료!!");
		}else {
			System.out.println("없는 학생번호입니다!!");
		}
	}//수정메소드
	
	// 4.삭제
	public static void delete() {
		System.out.print("삭제할 학생번호>>> ");
		sno = scn.nextLine();
		
		if(StudentApp.remove(sno)) {
			System.out.println("삭제완료!!");
		}else {
			System.out.println("없는 학생번호입니다!!");
		}
	}// 삭제메소드
	
	// 5.단건조회
	public static void search() {
		System.out.print("조회할 학생번호>>> ");
		sno = scn.nextLine();
		
		// 조회하고싶다..-> 그냥 출력하는 기능은 get()에 없어.
		// 그리고 showinfo에 조회양식 있음..
		// get(sno)를 써서 (null or Student 반환) -> 이걸 변수에 담아서 -> 확인하기
		
		Student s1 = StudentApp.get(sno); // new로 새로생성해도 되지만 이렇게 get()으로 Student를 리턴받아서 선언해도 된다.
		
		if(s1 == null) {
			System.out.println("없는 학생번호입니다!!");
			return;
		}else {
			s1.showInfo();
		}
		
	}
	
	public static void main(String[] args) {
		
		// StudentApp 기능(add) 사용하고 싶음-> 인스턴스 생성(스캐너처럼)
		// 그냥 막 쓸수있는거 아니다. 메모리상에 공간을 할당해야 쓸수있다. -> 지금은 클래스라서 이렇게 변수선언
//		StudentApp app = new StudentApp();
//		10개짜리 students 배열 생성(초기화), add기능 사용가능
		// 이렇게해도 되지만 static 정적메소드로 해도 된다고 함..
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.단건조회 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: //등록
				insert(); break;				
			case 2: // 목록
				list(); break;				
			case 3: //수정
				update(); break;				
			case 4: //삭제
				delete(); break;				
			case 5: //단건조회
				search(); break;
			case 9: //종료
				run = false; System.out.println("종료합니다!");
				
			} // switch
			
		}// while
		
		System.out.println("end of main prog.");	
	}// main

}// class
