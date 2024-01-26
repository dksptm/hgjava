package com.yedam.todo.classes;
// API-데이터

// 고유번호, 책제목, 저자 -->필수정보
// 발행연도, 별점(실수1f), 한줄평
public class Book {
	// 필드
	private char c;
	private int i;
	private String number;
	private String title;
	private String author;
	private int pubY;
	private double starred;
	private String hanjul;

	public Book(char c, int i, String title, String author) {
		super();
		this.c = c;
		this.i = i;
		this.number = c + String.format("%03d", i);
		this.title = title;
		this.author = author;
	}

	public double getStarred() {
		return starred;
	}

	public void setStarred(double starred) {
		this.starred = starred;
	}

	public String getHanjul() {
		return hanjul;
	}

	public void setHanjul(String hanjul) {
		this.hanjul = hanjul;
	}

	// 메소드
	public void showInfo() {
		String str = "(%s) %s,『%s』, %d\n";
		System.out.printf(str, this.number, this.author, this.title, this.pubY);
	}

	public void assessment() {
		String str = "『%s』한줄평: %s (%s)\n";
		System.out.printf(str, this.title, this.hanjul, this.starred);
	}

	public void showTitle() {
		String str = "(%03d)-->『%s』\n";
		System.out.printf(str, this.number, this.title);
	}

}
