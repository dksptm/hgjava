package com.yedam.api;

public class Member {

	String name;
	int age;
	
	Member(){}
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Set에서 중복검사할때 hashCode를 bject.hashCode()아닌 String.hashCode()로 변경
	@Override
	public int hashCode() {
		return this.name.hashCode(); //String.hashCode()->이름이 같으면 같은 hashCode
	}
	
	// name같으면 논리적으로 동일한 객체.
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);부모 실행코드는 삭제하고
		if(obj instanceof Member) {//obj가 Member의 인스턴스가 맞으면(Member타입이 맞으면)
			Member target = (Member) obj; //Object obj를 Member로 캐스팅(상위클래스->하위클래스로 형변환)
			if(this.name.equals(target.name)//String.equals()
					&& this.age == target.age) { 
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "이름은 " + name + ", 나이는 " + age;
	}
}
