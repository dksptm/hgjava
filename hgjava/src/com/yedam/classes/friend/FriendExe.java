package com.yedam.classes.friend;

import java.util.Scanner;

//실행클래스
public class FriendExe {
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// static없는 sum은 그냥 바로 사용못함
//		FriendExe exe = new FriendExe(); // 이렇게해야함
//		exe.sum(10,20);
		// 근데 static하면
		sum(10,20);
		
		
		// 메뉴 : 1.출력 2.목록 3.수정 4.삭제 9.종료
		// 사용자의 입력 // 처리결과 콘솔출력 ...// 로그인기능(id.pw.)
		Scanner scn = new Scanner(System.in);
		
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
		
		FriendApp app = new FriendApp();		
		boolean run = true;
				
		String name = "", phone = "";
		int age = 0;
		
		while(run) {
			System.out.println("<친구> 1.등록 2.목록 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: //등록
				int idx = 0;
				if(app.preAdd() == -1) {
					System.out.println("더이상 저장할 공간이 없습니다!");
					break; //스위치나감
				} else {
					idx = app.preAdd();
				}
				
				System.out.print("친구이름>>> ");
				name = scn.nextLine();
				System.out.print("연락처>>> ");
				phone = scn.nextLine();
				System.out.print("나이>>> ");
				age = Integer.parseInt(scn.nextLine());
				
				Friend newF = new Friend(name, phone, age);
//				nf.setFname(name); -----그냥 위에서 인스턴스생성할때 매개값 같이 넣으면 됨!!!!
				
				app.add(newF, idx);
				System.out.println("친구>>등록완료!");
				break;
				
			case 2: //목록
				Friend[] list = app.list();
				for(int i=0; i<list.length; i++) {
					if(list[i] != null) {
						list[i].showInfo();						
					}
				}
				System.out.println("친구>>조회완료!");
				break;
				
			case 3: //수정
				System.out.print("수정할 이름>>> ");
				name = scn.nextLine();
				
				//확인
				if(app.get(name) == -1) {
					System.out.println("없는친구입니다!");
					break;
				}
				
				System.out.print("연락처>>> ");
				phone = scn.nextLine();
				
				//수정
				idx = app.get(name);
				Friend f1 = app.modify(idx, phone);
				f1.showInfo();
				System.out.println("친구>>수정완료!");
				break;
				
			case 4: //삭제
				System.out.print("수정할 이름>>> ");
				name = scn.nextLine();
				
				//확인
				if(app.get(name) == -1) {
					System.out.println("없는친구입니다!");
					break;
				}
				
				//삭제
				idx = app.get(name);
				app.remone(idx);
				System.out.println("친구>>삭제완료!");
				break;
				
			case 9: //종료
				System.out.println("종료합니다...");
				run = false;
				break;
			
			}//switch
			
		}//while
		
		System.out.println("end of prog.");
	}//main
}//class
