package com.yedam.api;

public class ObjectExe {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.equals(obj2)); //Object.equals() //항상false
		
		//Object.equals();
//		public boolean equals(Object obj) {
//	        return (this == obj); this(자기자신)의 참조값과 obj(비교대상)의 참조값 주소 비교
//	    }
		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2)); //String.equals() //String에 equals()가 재정의되어 있음
		
		//
		Member mbr1 = new Member();
		Member mbr2 = new Member();
		mbr1.name = "김회원";
		mbr2.name = "김회원";
		
		//Member 클래스는 따로 적지않아도 extends Object 이므로 Object.equals() 사용가능
		//오버라이드 안하면 부모 메소드 그대로 물려받음
		System.out.println(mbr1.equals(mbr2)); //Member.equals() //true
		//원래 mbr1, mbr2는 각각 생성된 인스턴스라서 다른 객체(실체)(>물리적으로 다른객체)
		//그런데 Member에서 equals메소드를 재정의(오버라이드)했으므로
		//이름이 같으면 true로 결과나옴
		
		mbr1.age = 22;
		mbr2.age = 30;
		System.out.println(mbr1.equals(mbr2)); //false
		
		System.out.println("end of prog.");
	}//main
}//class
