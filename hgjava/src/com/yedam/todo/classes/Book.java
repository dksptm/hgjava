package com.yedam.todo.classes;
// API-데이터

// 고유번호, 책제목, 저자 -->필수정보
// 발행연도, 별점(실수1f), 한줄평
public class Book {
	//필드
	private String number;
	private String title;
	private String author;
	private int pubY;
	private double starred;
	private String hanjul;
	//생성자
	public Book() {
	}
	public Book(String number, String title, String author, int pubY) {
		this.number = number;
		this.title = title;
		this.author = author;
		this.pubY = pubY;
	}
	
	//getter, setter
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPubY() {
		return pubY;
	}
	public void setPubY(int pubY) {
		this.pubY = pubY;
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
	
	//메소드
	public void showInfo() {
		String str = "(%s) %s,『%s』, %d\n";
		System.out.printf(str, this.number, this.author, this.title, this.pubY);
	}
	
	public void assessment() {
		String str = "『%s』한줄평: %s (%s)\n";
		System.out.printf(str, this.title, this.hanjul, this.starred);
	}
	
	public void showTitle() {
		String str = "(%s)-->『%s』\n";
		System.out.printf(str, this.number, this.title);
	}
	
	
	



	
	
	
	
	

}