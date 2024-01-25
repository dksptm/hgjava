package com.yedam.collection;

public class Member {
	private int mid;
	private String name;

	public Member(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}
	
	// 논리적동일: hashCode, equals 
	@Override
	public int hashCode() {
//		return super.hashCode();
		return mid;
	}
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);//Object obj는 주소값이 다르면 다르다고 판단.
		if(obj instanceof Member) { 
			Member target = (Member) obj;
			return this.mid == target.mid && this.name.equals(target.name);
		}
		return false;//obj가 Member아니면 그냥 false
	}

	public int getId() {
		return mid;
	}

	public void setId(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [아이디: " + mid + ", 이름: " + name + "]";
	}
	
	

}//class
