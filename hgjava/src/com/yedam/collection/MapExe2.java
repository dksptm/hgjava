package com.yedam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe2 {
	public static void main(String[] args) {
		// Map : javascript의 객체와 비슷. 많이 사용한다.
		Map<Member, Integer> map = new HashMap<>(); // 멤버의 포인트(int)관리
		map.put(new Member(1, "홍길동"), 900);
		map.put(new Member(2, "박길동"), 1200);
		map.put(new Member(3, "최길동"), 500);
		map.put(new Member(1, "홍길동"), 800); // 아까 hashCode, equals -> Override.
		map.put(new Member(4, "김길동"), 1500);

		System.out.println("크기: " + map.size());
		System.out.println("키: " + new Member(1, "홍길동"));
		System.out.println("값: " + map.get(new Member(1, "홍길동")) + "point");
		System.out.println("박길동 키의 존재유무: " + map.containsKey(new Member(2, "박길동")));
		System.out.println("1200 값의 존재유무: " + map.containsValue(1200));
		System.out.println("-----------");

		// 포인트가 1000점 이상인 사람의 이름을 출력
		Set<Entry<Member, Integer>> mapset = map.entrySet();
		for (Entry<Member, Integer> ms : mapset) {
			if (ms.getValue() > 1000) {
				System.out.printf("%s %dpoint\n", ms.getKey().getName());
			}
		}
		System.out.println("-----------");

		Set<Entry<Member, Integer>> eset = map.entrySet();
		Iterator<Entry<Member, Integer>> iter = eset.iterator();
		while (iter.hasNext()) {
			Entry<Member, Integer> ent = iter.next();
			if (ent.getValue() > 1000) {
				System.out.printf("이름: %s, 포인트: %d\n", ent.getKey().getName(), ent.getValue());
			}
		}

	}// main
}// class
