package com.yedam.reference;

import java.util.Scanner;

public class ArrayExe3 {
	public static void main(String[] args) {
		// 친구의 정보를 담기위한 실체를 선언한다 -> 인스턴스를 만든다.(친구의 정보담기위한 공간을 만든다.)
		Friend f1 = new Friend(); //초기화
		f1.name = "카리나"; //값을 담는다.
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

		// f1~f3의 정보를 배열에 담겠다. -> 타입이 Friend가 모인 배열이다! -> Friend[] 
		Friend[] friends = { f1, f2, f3 }; //이전에는 배열3개 필요했으나, 이제는 1개만 필요!
		
		// Friend라는 데이터타입은 문자열, 실수, 정수를 각각 담고있기때문에, 속성도 가져와야서 값을비교해야한다.
		// -> friends[i].name.equals(~)
		for(int i=0; i<friends.length; i++) {
			if(friends[i].name.equals("카리나")) {
				String str = "몸무게는 %.1fkg, 점수는 %d점";
				System.out.printf(str, friends[i].weight, friends[i].score);
			}
		}
		
		// 배열의 크기재선언하면 안의 데이터도 모두 초기화(객체는 초기값이 null)
		friends = new Friend[5]; // {null,null,null,null,null} //friends라는 배열만 초기화한것(f1~f3는 초기화X)
		// 런타임예외 : 실행해야 알수있는 오류 (컴파일러가 미리 알려주지 않음)
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3; //{f1,f2,f3,null,null}
		
		// 새로운 친구.
		String name = "김말숙";
		double weight = 55.5;
		int score = 88;
		
		// 새로운 친구 담기 ---- !!!틀렸음!!!!
//		friends[3].name = name;
//		friends[3].weight = weight;
//		friends[3].score = score;
		// 새롭게 선언해줘야 한다!
		// friends는 Friend라는 타입이 모여있는 "배열"이고(Friend 타입아님), friends[3]에 넣을때도 속성에 넣는게 아니라
		// f4라는 Friend 타입의 변수 생성해서 넣어줘야 한다.
		Friend f4 = new Friend();
		f4.name = name;
		f4.weight = weight;
		f4.score = score;
		friends[3] = f4; //{f1,f2,f3,null,null}
		
		// 김말숙 점수 88->90 변경
		Scanner scn = new Scanner(System.in);
		System.out.println("\n점수바꿀 친구이름>>> ");
		String fname = scn.nextLine();
		System.out.println("변경점수 입력>>> ");
		int fscore = Integer.parseInt(scn.nextLine());
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].name.equals(fname)) {
				friends[i].score = fscore;
			}
		}
		
		// null값이 아닌것만 조회하세요. 조건 넣어주면 null이 있어도 코드진행 정상
		// friends[i] != null && friends[i].name.equals("아이유") 이거 순서바꾸면 안됨
		// friends[i] != null 이 false이면 뒤에꺼 실행안하니깐.
		// friends[i].name.equals("아이유") 먼저실행하면 에러남
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].name.equals("아이유")) {
				String str = "\n%s의 몸무게는 %.1fkg, 점수는 %d점";
				System.out.printf(str, friends[i].name, friends[i].weight, friends[i].score);
			}
		}
		
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
				String str = "\n%s의 몸무게는 %.1fkg, 점수는 %d점";
				System.out.printf(str, friends[i].name, friends[i].weight, friends[i].score);
			}
		}
		
		scn.close();
		System.out.println("\nend of prog.");
	}//메인

}//클래스
