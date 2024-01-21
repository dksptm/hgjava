package com.yedam.todo.classes;

class Member {
	//필드
	private String id;
	private String pw;
	private String name;
	
	//생성자
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	//getter
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getName() {
		return name;
	}

	//메소드
}

public class MemberApp{
	private Member[] members;
	
	public MemberApp() {
		members = new Member[5];
		members[0] = new Member("admin", "1111", "관리자");
		members[1] = new Member("user", "2222", "이용자");
		members[2] = new Member("karina", "3333", "카리나");
	}
	
	public Member login(String id, String pw) {
		for(Member i : members) {
			if(i != null && i.getId().equals(id)) {
				if(i.getPw().equals(pw)) {
					return i;
				}
			}
		}
		return null;
	}
	
}
