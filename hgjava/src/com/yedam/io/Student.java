package com.yedam.io;

public class Student {
	private int sno;
	private String sname;
	private int score;
	
	public Student(int sno, String sname, int score) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.score = score;
	}

	public int getSno() {
		return sno;
	}

	public String getSname() {
		return sname;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "▷ " + sno + " 이름: " + sname + " 점수: " + score + ".";
	}
	
	
}
