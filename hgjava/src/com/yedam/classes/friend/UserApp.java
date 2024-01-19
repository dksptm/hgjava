package com.yedam.classes.friend;

class User{
	private String id;
	private String pw;
	private String name;
	
	public User(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}//class User

// 클래스 웬만하면 파일하나당 하나, but 필요하면 2개이상 가능, but 하나만 퍼블릭!
public class UserApp {// 로그인기능
	private User[] users;
	
	public UserApp() {
		users = new User[5];
		users[0] = new User("user1", "1111", "홍길동");
		users[1] = new User("user2", "2222", "김민규");
		users[2] = new User("user3", "3333", "관리자");
	}
	
	// 로그인메소드
	
	// 나중에는 데이터베이스 쿼리로할껀데 지금은 그냥...
//	public boolean login(String id, String pw) {
//		for(int i=0; i<users.length; i++) {
//			if(users[i] != null) { // 배열에 null있으면 에러나니깐.
//				if(users[i].getId().equals(id)
//						&& users[i].getPw().equals(pw)) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	// 또 이것보다는...
	
	public User login(String id, String pw) {
	for(int i=0; i<users.length; i++) {
		if(users[i] != null) { // 배열에 null있으면 에러나니깐.
			if(users[i].getId().equals(id)
					&& users[i].getPw().equals(pw)) {
				return users[i];
			}
		}
	}
	return null;
}
	
}// class public
