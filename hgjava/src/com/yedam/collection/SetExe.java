package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("홍길동");
		names.add("김길동");
		names.add("손흥민");
		names.add("김민수");
		names.add("이만수");

		names.remove("손흥민"); // 삭제.

		System.out.println(names.size());

		Iterator<String> iter = names.iterator(); // Iterator라는 타입(클래스)에 담아줘야.
		while (iter.hasNext()) { // 있는지 없는지 확인-있으면 true //대상이 있는지 체크.//Iterator의 메소드
			String result = iter.next(); // 선택해서 가져옴.
			System.out.println(result);
		}
		
		System.out.println("---");
		
		// 확장for. 편하게쓰자.
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("---");
		
		int[] numbers = {10, 20, 30, 20};
		System.out.println(numbers.length);
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<numbers.length ; i++) {
			set.add(numbers[i]); //알아서 중복된값 걸러줌
		}
		System.out.println(set.size()); //3
		for(int num : set) {
			System.out.println(num);
		}

	}// end of main.
}// end of class.
