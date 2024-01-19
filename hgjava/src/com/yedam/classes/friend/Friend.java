package com.yedam.classes.friend;
// API 데이터타입 목적 -> 인스턴스가 필요하다.(다른정보를 담아야하닌깐)
// 멤버: 필드, 생성자, 메소드 이런것들을 멤버라고 한다.
// 친구이름, 연락처, 나이 : 관리.
public class Friend {
	// 1.필드
	private String fname;
	private String fphone;
	private int fage;
	
	// 2.생성자
	public Friend() {
	}
	
	public Friend(String fname) {
		this.fname = fname;
	}
	
	public Friend(String fname, String fphone) {
		this.fname = fname;
		this.fphone = fphone;
	}

	public Friend(String fname, String fphone, int fage) {
		this.fname = fname;
		this.fphone = fphone;
		this.fage = fage;
	}
	
	// 3.메소드(겟/셋, 인포)
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFphone() {
		return fphone;
	}

	public void setFphone(String fphone) {
		this.fphone = fphone;
	}

	public int getFage() {
		return fage;
	}

	public void setFage(int fage) {
		this.fage = fage;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s, 연락처: %s, 나이: %d.\n", this.fname, this.fphone, this.fage);
	}
	
	public void showName(int i) {
		System.out.printf("%d번--이름: %s\n", (i+1), this.fname);
	}
	
	public void showIdx(int i) {
		System.out.printf("%d번=> ", (i+1));
	}

	
	
	
}//클래스
