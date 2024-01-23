package com.yedam.classes.inherit;
//친구정보저장,조회,수정,삭제
public class FriendApp {
	//필드
	private Friend[] friends;
	//생성자
	public FriendApp() {
		friends = new Friend[10];
	}
	
	//CRUD.
	public boolean add(Friend fnd) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = fnd;
				return true;
			}
		}
		return false;
	}
	//Read:목록, 이름(name) : name이 매개값으로 들어오면 해당이름조회, 아니면 목록
	private int idx = 0; //Friend[] list의 인덱스값 위한변수(메소드안에 선언하면 초기화되니깐)
	public Friend[] list(String name) {
		Friend[] list = new Friend[10];
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
				if(friends[i].getName().equals(name) || name.equals("")) { //교수님방법|| name.equals("")
					list[idx++] = friends[i];
				}
			}
		}
		return list;
	}
//	public Friend[] list() {
//		return friends;
//	}
	
	
	//전화번호(키)단건조회
	public Friend getFriend(String phone) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
				if(friends[i].getPhone().equals(phone)) {
					return friends[i];
				}
			}
		}
		return null;
	}
	
	//수정(매개값 전화번호-> 회사:회사,부서/ 학교:학교,전공)
	// 매개값을 이름으로 안하는 이유> 동명이인
	public boolean modify(String phone, String info1, String info2) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
				if(friends[i].getPhone().equals(phone)) {
					friends[i].changeInfo(info1, info2);
					return true;
				}
			}
		}
		return false;
	}
	
	//삭제
	public boolean remove(String phone) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
				if(friends[i].getPhone().equals(phone)) {
					friends[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
}
