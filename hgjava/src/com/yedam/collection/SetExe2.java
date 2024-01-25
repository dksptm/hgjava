package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe2 {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		
		members.add(new Member(1, "홍길동"));
		members.add(new Member(2, "김길동"));
		members.add(new Member(3, "김민수"));
		members.add(new Member(1, "홍길동"));
		// hashCode, equals를 통해 중복된값을 체크한다.
		// 1번째와 4번째의 인스턴스가 다르다.(새로운 인스턴스)
		
		members.remove(new Member(2, "김길동"));//제거.(hashCode, equals 재정의후 가능)
		
		System.out.println(members.size());//4-(hashCode, equals 재정의후)->3 
		
		// 반복된 요소를 선택해서 가져오는 반복자.
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			Member member = iter.next();//iter.next();iter.next();//두번쓰면 두개씩 가져와서 홀수일경우 곤란.
			System.out.println(member);
		}
		
		
		
		
		
	}//end of main

}//end of class
