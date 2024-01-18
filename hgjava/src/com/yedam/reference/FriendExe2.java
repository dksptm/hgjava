package com.yedam.reference;

import java.util.Scanner;

// 수정해보기!
public class FriendExe2 {
	
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
				int idx = 0;
				boolean isNul = false;
				
				// null 있는지, 인덱스찾기
				for(int i=0; i<friends.length; i++) {
					if(friends[i] == null) {
						isNul = true;
						idx = i;
						break;
					}
				}
				// null 없는 경우
				if(!isNul) {
					System.out.println("저장할 공간이 없습니다.");
					break; //스위치 나감
				}
				// null 있으면 아래진행
				System.out.print("이름>>> ");
				name = scn.nextLine();
				////수정중
				if(name.equals("")) {
					System.out.print("이름을 입력하세요!");
				}else {
					System.out.print("몸무게>>> ");
					weight = Double.parseDouble(scn.nextLine());					
				}
				System.out.print("점수>>> ");
				score = Integer.parseInt(scn.nextLine());
				///수정중
				
				Friend friend = new Friend();
				friend.name = name;
				friend.weight = weight;
				friend.score = score;
				
				friends[idx] = friend;
				System.out.println("정상적으로 입력되었습니다.");
				break;
				
			case 2: // 조회
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null) {
						String str = "%d번=> 이름: %s, 몸무게: %.1fkg, 점수: %d점.\n";
						System.out.printf(str, i+1, friends[i].name, friends[i].weight, friends[i].score);
					}
				}
				break;
				
			case 3: // 수정
				weight = -1; //case1의 몸무게,스코어,인덱스 초기화
				score = -1;
				idx = 0;
				boolean isExsit = false; //존재여부
				
				System.out.print("조회할 이름>>> ");
				name = scn.nextLine();
				
				// 존재여부, 인덱스찾기
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null && friends[i].name.equals(name)) {
						isExsit = true;
						idx = i;
					}
				}
				// 존재하지 않을경우 
				if(!isExsit) {
					System.out.println("해당 친구가 없습니다.");
					break; //스위치 나감
				}
				
				// 존재할 경우 아래진행
				
				// 입력받고 공백 체크
				System.out.print("수정 몸무게>>> ");
				String sweight = scn.nextLine();
				if(!sweight.equals("")) weight = Double.parseDouble(sweight);
				
				System.out.print("수정 점수>>> ");
				String sscore = scn.nextLine();
				if(!sscore.equals("")) score = Integer.parseInt(sscore);
				
				// 수정하기
				friends[idx].weight = (weight != -1) ? weight : friends[idx].weight;
				friends[idx].score = (score != -1) ? score : friends[idx].score;
				
				System.out.println("수정완료.");
				break;
				
			case 4: //삭제
				isExsit = false; // 존재여부, 인덱스 초기화
				idx = 0;
				
				System.out.print("조회할 이름>>> ");
				name = scn.nextLine();
				
				// 존재여부, 인덱스찾기 
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
						String str = "%d번=> 이름: %s, 점수: %d점.\n";
						System.out.printf(str, i+1, friends[i].name, friends[i].score);
					}
				}
				break;
				
			case 6: // 평균점수: 점, 최고점수: 점.
				idx = 0;
				int sum = 0, cnt = 0, max = 0;
				double avg = 0;
				
				for(int i=0; i<friends.length; i++) {
					if(friends[i] != null) { // 합계와 사람수 구하기.
						sum += friends[i].score;
						cnt++;
					}
					if(friends[i] != null && friends[i].score > max) { // 최고점수 구하기
						max = friends[i].score;
						idx = i;
					}
				}
				avg = (double)sum/cnt; // 평균구하기
				
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
