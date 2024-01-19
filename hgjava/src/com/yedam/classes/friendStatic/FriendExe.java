package com.yedam.classes.friendStatic;

import java.util.Scanner;

//실행클래스
public class FriendExe {
	static Scanner scn = new Scanner(System.in);
	
	static String name = "", phone = "";
	static int age = 0;
	
	public static void insert() {
		int idx = 0;
		if(FriendApp.preAdd() == -1) {
			System.out.println("더이상 저장할 공간이 없습니다!");
			return; 
		} else {
			idx = FriendApp.preAdd();
		}
		
		System.out.print("친구이름>>> ");
		name = scn.nextLine();
		System.out.print("연락처>>> ");
		phone = scn.nextLine();
		System.out.print("나이>>> ");
		age = Integer.parseInt(scn.nextLine());
		
		Friend newF = new Friend(name, phone, age);
//		nf.setFname(name); -----그냥 위에서 인스턴스생성할때 매개값 같이 넣으면 됨!!!!
		
		FriendApp.add(newF, idx);
		System.out.println("친구>>등록완료!");
	}// 등록메소드
	
	public static void list() {
		Friend[] list = FriendApp.list();
		for(int i=0; i<list.length; i++) {
			if(list[i] != null) {
				list[i].showInfo();						
			}
		}
		System.out.println("친구>>조회완료!");
	}// 목록메소드
	
	public static void update() {
		System.out.print("수정할 이름>>> ");
		name = scn.nextLine();
		
		//확인
		if(FriendApp.get(name) == -1) {
			System.out.println("없는친구입니다!");
			return;
		}
		
		System.out.print("연락처>>> ");
		phone = scn.nextLine();
		
		//수정
		int idx = FriendApp.get(name);
		Friend f1 = FriendApp.modify(idx, phone);
		f1.showInfo();
		System.out.println("친구>>수정완료!");
	}// 수정메소드
	
	public static void delete() {
		System.out.print("수정할 이름>>> ");
		name = scn.nextLine();
		
		//확인
		if(FriendApp.get(name) == -1) {
			System.out.println("없는친구입니다!");
			return;
		}
		
		//삭제
		int idx = FriendApp.get(name);
		FriendApp.remove(idx);
		System.out.println("친구>>삭제완료!");
	}// 삭제메소드
	
	public static void main(String[] args) {
		
		// 로그인
		UserApp uapp = new UserApp();
		
		while(true) {
			System.out.print("아이디>>> ");
			String id = scn.nextLine();
			System.out.print("비밀번호>>> ");
			String pw = scn.nextLine();
			
			User user = uapp.login(id, pw);
			if(user != null) {
				System.out.printf("%s님, 환영합니다.\n", user.getName());
				break;
			}
			System.out.println("로그인 실패...다시...");
		}
				
		boolean run = true;
				
		while(run) {
			System.out.println("<친구> 1.등록 2.목록 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: insert(); break;
			case 2: list(); break;
			case 3: update(); break;
			case 4: delete(); break;
			case 9:
				System.out.println("종료합니다...");
				run = false;
			}//switch
			
		}//while
		
		System.out.println("end of prog.");
	}//main
}//class
