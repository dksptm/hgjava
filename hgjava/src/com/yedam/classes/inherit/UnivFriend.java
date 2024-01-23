package com.yedam.classes.inherit;

import lombok.Data;

@Data
public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	@Override
	public void changeInfo(String info1, String info2) {
		this.univ = info1;
		this.major = info1;
	}
	// 왜 나는 @Override 하고 ctrl space했는데 안될까?-->over..적지말고 그냥 ctrl space
	
	@Override
	public String toString() {
		// 부모 그대로> super.toString()
		return super.toString() + ", 학교는" + univ + ", 전공은 " + major;
	}
	
	
}
