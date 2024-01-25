package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("김민석");
		names.add(1, "이만수"); // 원래 1에는 김민석이었는데, 김민석은 자동으로 2로 밀어냄
		names.add(1, "이만우");
		names.add(1, "이만우"); // 중복입력 허용
		names.set(1, "김만우"); // 1:이만우를 1:김만우로 변경(이만우 사라짐)
		names.remove(1); // 1건삭제(size() 1줄어듬)
//		names.clear(); //모두삭제

		System.out.println(names.size()); // 크기확인. 배열의 names.length

		// 만약 컬렉션에 객체가 하나도없다면 실행시점 예외는 처리를 해줘야 함
		if (names.size() > 0) {
			System.out.println(names.get(1)); // 배열에서 names[1]
			System.out.println(names.get(2)); // 배열에서 names[1]
		}

		// 반복문(확장 for)
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("---------------------");

		List<Member> members = new ArrayList<>();
//		members.add("김민석"); //컴파일에러: 타입다름
		members.add(new Member(1, "홍길동")); // members 인스턴스에 Member 인스턴스 담는다.
		members.add(new Member(2, "김민석")); // 4:김길동 변경.
		members.add(new Member(3, "이충희"));

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getName().equals("김민석")) {
				members.set(i, new Member(4, "김길동"));
				break;
			}
		}

		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i); // List get() 메소드사용
			System.out.println(member.toString());
			String name = members.get(i).getName(); // members[i].getName()//타입구분필요!!
			int id = members.get(i).getId();
			System.out.printf("이름: %s, 아이디: %03d\n", name, id);
		}

	}// main
}// class
