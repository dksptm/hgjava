package com.yedam.todo.classes;

import java.util.Scanner;

// 실행클래스

// 관리자만 등록,수정 가능
// 이용자는 한줄,별점,조회 가능
public class BookExe {
	static Scanner scn = new Scanner(System.in);
	
	static String number="", title="", author="", hanjul="";
	static int year, idx = 0;
	static double star = 0.0;
	
	//0.권한확인
	
	//1.등록
	public static void insert() {
		//저장공간확인
		if(BookApp.isNul() == -1) {
			System.out.println("저장할 공간이 없습니다.");
			return;
		}else {
			idx = BookApp.isNul();
		}
		//중복번호확인
		while(true) {
			System.out.print("고유번호 입력>> ");
			number = scn.nextLine();			
			if(BookApp.overlap(number)) {
				System.out.println("이미 등록한 번호입니다...");
				continue;
			} else {
				break;
			}
		}
		//등록
		System.out.print("책제목 입력>> ");
		title = scn.nextLine();
		System.out.print("저자 입력>> ");
		author = scn.nextLine();
		System.out.print("발행연도 입력>> ");
		year = Integer.parseInt(scn.nextLine());
		
		Book book = new Book(number, title, author, year);
		BookApp.bookAdd(idx, book);
		System.out.println("등록완료♥");
	}//등록메소드
	
	//2.조회
	public static void list() {
		Book[] list = BookApp.list();
		for(int i=0; i<list.length; i++) {
			if(list[i] != null) {
				list[i].showInfo();
			}
		}
		System.out.println("조회완료♥");
	}//조회메소드
	
	//3.삭제
	public static void delete() {
		System.out.print("삭제할 책제목 또는 고유번호 입력>> ");
		String str = scn.nextLine();
		
		if(BookApp.get(str) == -1) {
			System.out.println("그런책 없어요...");
			return;
		}
		idx = BookApp.get(str);
		BookApp.remove(idx);
		System.out.println("삭제완료♥");
	}//삭제메소드
	
	
	//4.평가
	public static void update() {
		System.out.print("평가할 책제목 또는 고유번호 입력>> ");
		String str = scn.nextLine();
		//단건조회
		if(BookApp.get(str) == -1) {
			System.out.println("그런책 없어요...");
			return;
		}
		idx = BookApp.get(str);
		
		//평가하기
		System.out.printf("%s의 별점(0~5까지 0.5단위로)", BookApp.list()[idx].getTitle());
		star = Double.parseDouble(scn.nextLine());
		System.out.printf("%s의 한줄평(10자이내)", BookApp.list()[idx].getTitle());
		hanjul = scn.nextLine();
		
		BookApp.review(idx, hanjul, star);
		System.out.println("평가완료♥");
	}// 평가메소드
	
	//5.별점조회--그냥 바로함
	
	
	public static void main(String[] args) {
		
		boolean run = false;
		
		MemberApp mem = new MemberApp();
		String id, pw, mname;
		Member member = null;
//		Member winter = new Member("winter", "4444", "윈터");
//		mem.addM(winter);
		
		while(true) {
			System.out.print("아이디 입력>> ");
			id = scn.nextLine();
			System.out.print("비밀번호 입력>> ");
			pw = scn.nextLine();
			if(mem.login(id, pw) != null) {
				mname = mem.login(id, pw).getName();
				System.out.printf("%s님, 환영합니다.\n", mname);
//				member = new Member(id, pw, mname); 이거왜있지..
				run = true;
				break;
			}
			System.out.println("아이디/비번 오류>> 1.계속하기 2.나가기");
			if(scn.nextLine().equals("2")) {
				System.out.println("로그인시도 종료..");
				break;
			}else {
				System.out.println("아이디와 패스워드 다시입력해주세요.");
				continue;
			}
		}
		
		while(run) {
			System.out.println("1.이용자추가 9.종료");
			int submenu = Integer.parseInt(scn.nextLine());
			if(submenu == 1) {
				System.out.print("추가할 id>> ");
				String mid = scn.nextLine();
				System.out.print("추가할 pw>> ");
				String mpw = scn.nextLine();
				System.out.print("추가할 이름>> ");
				String mna = scn.nextLine();
				member = new Member(mid, mpw, mna);
//				mem.addM(id, pw, member);
			}else {
				System.out.println("이용자 추가작업 종료..");
				break;
			}
		}
		
		
		while(run) {
			System.out.println("1.등록 2.목록 3.삭제 4.평가 5.별점 9.종료");
			System.out.print("메뉴번호>>> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: 
				//권한확인
				if(member.getId().equals("admin")){
					insert();					
				}else {
					System.out.printf("%s님은 권한이 없습니다.\n", member.getName());
				}
				break;
			case 2: list(); break;
			case 3: 
				if(member.getId().equals("admin")){
					delete();										
				}else {
					System.out.printf("%s님은 권한이 없습니다.\n", member.getName());
				}
				break;
			case 4: update(); break;
			case 5: BookApp.reviewList(); break;
			case 9:
				System.out.println("goodbye~");
				run = false; break;
			}//스위치
		}//while
		
		
	}//메인
	
}//클래스
