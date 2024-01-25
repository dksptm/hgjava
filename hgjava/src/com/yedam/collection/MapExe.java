package com.yedam.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe {
	public static void main(String[] args) {
		// 키:값, 키와 값의 타임(클래스)을 모두 정해줘야.
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "홍길동");
		map.put(2, "김길동");
		map.put(3, "박길동");
		map.put(4, "홍길동"); //value는 동일값 넣어도 가능.
		map.put(3, "최길동"); //박길동->최길동. key는 중복불가. 마지막값으로 변경.
		
		map.remove(3); //삭제.
		
		System.out.println("크기: " + map.size());
		
		//looping못함. 키만 set.
		Set<Integer> keyset = map.keySet(); //key는 위에서 Integer!
		Iterator<Integer> iter = keyset.iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			String val = map.get(key); //해당되는 키(iter.next())의 값을 반환-값은 String!
			System.out.printf("키: %d, 값: %s\n", key, val);
		}
		
		System.out.println("-------");
		
		//looping못함. 키와 값을 set.
		//Set은 원래 하나의 타입만 가능. 두개의 타입을 담고싶으면 Entry타입으로.
		Set<Entry<Integer, String>> entry = map.entrySet();
		Iterator<Entry<Integer, String>> eiter = entry.iterator(); //Iterator 타입도 2개.
		while(eiter.hasNext()) {
			Entry<Integer, String> ent = eiter.next(); //Entry타입은 getKey, getValue메소드 제공
			System.out.printf("키: %d, 값: %s\n", ent.getKey(), ent.getValue());
		}
		
		
	}//메인
}//클래스
