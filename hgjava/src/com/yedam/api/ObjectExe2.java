package com.yedam.api;

import java.util.HashSet;
import java.util.Set;

// hashCode, equals
public class ObjectExe2 {
	public static void main(String[] args) {
		//Set은 인터페이스.(인스턴스생성불가). Set의 대표적인 클래스: HashSet
		Set<String> set = new HashSet<String>();
		set.add("제니");
		set.add("로제");
		set.add("지수");
		set.add("로제");//동일한 값은 담아주지 않는다->Set. hashCode, equals로 판별->String 클래스에 가면 hashCode, equals 동일하다는 있을것..
		
		//javascript의 for..of같은거. :뒤에 컬렉션or배열. 값을 가져옴
		for(String name : set) {
			System.out.println(name);
		}
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김길동", 20)); //기존 members에서 김길동, 20을 확인하고 중복값은 저장X 아니면 저장O
		members.add(new Member("홍길동", 22));
		members.add(new Member("박길동", 22));
		members.add(new Member("김길동", 20)); //Member에서 hashCode 오버라이드하지 않으면 중복아니라고 인식
		for(Member mem : members) {
			System.out.println(mem.toString());
		}
		
		long time1 = System.nanoTime(); //시작시간
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime(); //종료시간

		System.out.println("1~1000000 합:" + sum);
		System.out.printf("소요시간은 %d나노초", (time2-time1));
		
		
		
	}
}
