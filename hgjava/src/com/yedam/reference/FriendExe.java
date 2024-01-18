package com.yedam.reference;

import java.util.Scanner;

// 친구의 정보를 저장하고 변경하고 관리한는 어플리케이션 만들기
// CRUD : Create, Read, Update, Delete.(생성, 조회, 수정, 삭제)
public class FriendExe {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Friend[] friends = new Friend[5]; // {null,null,null,null,null}
		
		////
		Friend f1 = new Friend();
		f1.name = "카리나";
		f1.weight = 47.3;
		f1.score = 78;
		
		Friend f2 = new Friend();
		f2.name = "장원영";
		f2.weight = 52.5;
		f2.score = 82;
		
		Friend f3 = new Friend();
		f3.name = "아이유";
		f3.weight = 40.7;
		f3.score = 95;

		Friend f4 = new Friend();
		f4.name = "김청하";
		f4.weight = 60.3;
		f4.score = 65;

		Friend f5 = new Friend();
		f5.name = "이태연";
		f5.weight = 51.1;
		f5.score = 85;
		
		friends = new Friend[] {f1, f2, f3, f4, f5};
		////
		
		String name = "";
		double weight = 0.0;
		int score = 0;
		
		while(run) {
			System.out.println("1.등록  2.조회  3.수정  4.삭제 5.점수조회 6.분석 9.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			
			case 1: //등록
				if(friends[friends.length-1] != null) {
					System.out.println("저장할 공간이 없습니다.");
					break;
				}
				
				System.out.print("이름>>> ");
				name = scn.nextLine();
				System.out.print("몸무게>>> ");
				weight = Double.parseDouble(scn.nextLine());
				System.out.print("점수>>> ");
				score = Integer.parseInt(scn.nextLine());
				
				Friend friend = new Friend();//Friend타입의 변수선언
				friend.name = name;
				friend.weight = weight;
				friend.score = score;
				
				// friends 배열의 null 위치 찾아서 한건입력하고 반복을 종료시켜야 함
				for(int i=0; i<friends.length; i++) {
					if(friends[i] == null) {
						friends[i] = friend;
						System.out.println("정상적으로 입력되었습니다.");
						break;
					}
				}
				break;
				
			case 2: // 조회 (일단은 전체목록 조회)
				// 이름:홍길동, 몸무게:77.5kg, 점수: 80점.
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null) {
						String str = "%d번=> 이름: %s, 몸무게: %.1fkg, 점수: %d점.\n";
						System.out.printf(str, i+1, friends[i].name, friends[i].weight, friends[i].score);
					}
				}
				break;
				
			case 3: // 수정 (일단은 점수만 수정)
				// 수정할 친구이름 -> 몸무게,점수 수정 -> 그냥 엔터하면 그대로.
//				weight = score = -1; 이렇게하지말자.타입다름
				
				//다시 초기화(0이 아닌이유? 0점도 있어서)
				weight = -1;
				score = -1;
				
				System.out.print("조회할 이름>>> ");
				name = scn.nextLine();
				
				// 존재여부, 인덱스체크
				boolean isExsit = false;
				int idx = 0;
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null && friends[i].name.equals(name)) {
						isExsit = true;
						idx = i;
					}
				}
				// 존재하지 않을경우 -> break로 스위치 나감 
				if(!isExsit) {
					System.out.println("해당 친구가 없습니다.");
					break; //switch나간다! (19행으로 간다. while은 계속..)
				}
				
				// 존재할 경우 아래진행
				
				// 입력받고 공백 체크
				System.out.print("수정 몸무게>>> ");
				String sweight = scn.nextLine(); // 그냥 enter하면 공백으로 저장됨
				if(!sweight.equals("")) weight = Double.parseDouble(sweight); //공백이아니면 값넣기
				
				System.out.print("수정 점수>>> ");
				String sscore = scn.nextLine();
				if(!sscore.equals("")) score = Integer.parseInt(sscore);
				
				// 수정하기
				friends[idx].weight = (weight != -1) ? weight : friends[idx].weight;
				friends[idx].score = (score != -1) ? score : friends[idx].score;
				
				System.out.println("수정완료.");
				break;
				
			case 4: //삭제
				System.out.print("조회할 이름>>> ");
				name = scn.nextLine();
				
				isExsit = false;
				idx = 0;
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null && friends[i].name.equals(name)) {
						isExsit = true;
						idx = i;
					}
				}
				if(!isExsit) {
					System.out.println("해당 친구가 없습니다.");
				}else {
					friends[idx] = null;	
					System.out.println("삭제완료.");
				}								
				break;
				
			case 5: // 입력점수 이상인 친구목록
				System.out.print("점수 입력>>> ");
				score = Integer.parseInt(scn.nextLine());
				
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null && friends[i].score >= score ) {
						System.out.printf("%d번=> 이름: %s, 점수: %d점.\n", i+1, friends[i].name, friends[i].score);
					}
				}
				
				break;
				
			case 6: // 평균점수: 점, 최고점수: 점.
				int sum = 0;
				int ctn = 0;
				int max = 0;
				idx = 0;
				double avg = 0;
				
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null) {
						sum += friends[i].score;
						ctn++;
					}
					if(friends[i] != null && friends[i].score > max) {
						max = friends[i].score;
						idx = i;
					}
				}
				avg = (double)sum/ctn;
				System.out.printf("평균점수 %.2f점\n", avg);
				System.out.printf("최고점수 %d점(%s)\n", max, friends[idx].name);
				break;
				
			case 9: // 종료
				run = false; 
				System.out.println("종료합니다."); 
				break;
			}//switch-case
			
		}//while
		
		scn.close();
		System.out.print("\nend of prog.");
	}//메인
	
}//클래스
