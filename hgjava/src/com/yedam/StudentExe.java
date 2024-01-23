package com.yedam;

import com.yedam.classes.Student;

public class StudentExe {
	public static void main(String[] args) {
		Student std = new Student("S001", "홍길동");
		//패키지가 다르기 때문에 public만 접근가능
		//(예:생성자가 public이 아니면 위의 new도 사용못함)
		std.setScore(90); //이거는 public이라 가능
		std.showInfo(); // 접근수준 default라 접근불가능 --> public으로 변경하면 접근가능
		
	}
}
