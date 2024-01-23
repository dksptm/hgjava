package com.yedam.classes.inherit;

import java.util.Scanner;

public class FriendExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		FriendApp app = new FriendApp();
		
		while(run) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: //등록.(그냥친구인지, 학교친구인지, 회사친구인지)
				System.out.println("1.친구 2.회사 3.학교");
				int subMenu = Integer.parseInt(scn.nextLine());
				
				System.out.print("이름>> ");
				String name = scn.nextLine();
				System.out.print("연락처>> ");
				String phone = scn.nextLine();
				
				Friend friend = null;
				if(subMenu == 1) {
					friend = new Friend();
					friend.setName(name);
					friend.setPhone(phone);
				} else if (subMenu == 2) {
					CompFriend cfriend = new CompFriend();
					cfriend.setName(name);
					cfriend.setPhone(phone);
					System.out.print("회사>> ");
					String company = scn.nextLine();
					System.out.print("부서>> ");
					String dept = scn.nextLine();
					cfriend.setCompany(company);
					cfriend.setDept(dept);
					//일단 CompFriend cfriend = new CompFriend();로 인스턴스생성 후 값을 다시 부모에게..
					//가능한 이유 : 부모라서
					friend = cfriend; 
					} else if (subMenu ==3) {
					UnivFriend ufriend = new UnivFriend();
					ufriend.setName(name);
					ufriend.setPhone(phone);
					System.out.print("학교>> ");
					String univ = scn.nextLine();
					System.out.print("전공>> ");
					String major = scn.nextLine();
					ufriend.setUniv(univ);
					ufriend.setMajor(major);
					friend = ufriend;
				}
				
				if(app.add(friend)) {
					System.out.println("정상 등록.");
				} else {
					System.out.println("등록 안됨.");
				}
				break;
				
			case 2:
				System.out.print("조회할 이름>> ");
				String fname = scn.nextLine();
				Friend[] list = app.list(fname);
//				if(fname.equals("")) {
//					list = app.list();
//				} else {
//					list = app.list(fname);					
//				} //교수님방법으로 했을때 필요없음
				for(int i=0; i<list.length; i++) {
					if(list[i] != null) {
						System.out.println(list[i].toString());
						// toString() ? 롬복에서 만들어준, 객체의 값,정보들을 문자열로 나열해주는.
						// UnivFriend(univ=예담, major=3강의)--->나중에 바꿔주면된다
					}
				}
				System.out.println("조회 완료.");
				break;
			case 3:
				System.out.print("조회할 연락처>> ");
				phone = scn.nextLine();
				Friend frnd = app.getFriend(phone);
				String info1="", info2 ="";
				if(frnd instanceof UnivFriend) {
					System.out.print("수정할 학교>> ");
					info1 = scn.nextLine();
					System.out.print("수정할 전공>> ");
					info2 = scn.nextLine();					
				} else if(frnd instanceof CompFriend) {
					System.out.print("수정할 회사>> ");
					info1 = scn.nextLine();
					System.out.print("수정할 부서>> ");
					info2 = scn.nextLine();
				}
				
				if(app.modify(phone, info1, info2)) {
					System.out.println("수정 완료.");
				}else {
					System.out.println("수정 실패!");
				}
				break;
				
			case 4: 
				System.out.print("조회할 연락처>> ");
				phone = scn.nextLine();
				
				if(app.remove(phone)) {
					System.out.println("삭제 완료.");
				}else {
					System.out.println("삭제 실패!");
				}
				break;
				
			case 9:
				System.out.println("종료...");
				run = false;
			}//end of switch
		}//end of while
		System.out.println("end of prog.");
		scn.close();
	}//end of main
}//end of class
