package com.yedam.api;

import java.util.ArrayList;
import java.util.List; //interface

public class WrapperExe {
	public static void main(String[] args) {
		//왜 Wrapper를 쓸까? 컬렉션의 <타입파라메타>안에는 클래스타입만 가능하다!
		
		List<Integer> list = new ArrayList<Integer>();
//		List<int> listInt = new ArrayList<int>(); 이런거 안됨
		
		list.add(new Integer(1));	//원래 이렇게 해야하는데.
		list.add(1);	//이렇게(1을 Integer로 변환하는거 자동으로)가능! (박싱,언박싱)(기본타입<->래퍼클래스) 알아서 해줌.
		list.add(Integer.valueOf(1));
		
		double d1 = Double.valueOf("2.3").doubleValue(); //(박싱<->언박싱)
		double d2 = Double.valueOf("2.3"); //(박싱<->언박싱)
		
		System.out.println(Math.floor(2.3));
		
		
	}

}
