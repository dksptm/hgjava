package com.yedam.phonebook;

// 사용자메뉴를 비정상적으로 처리.
// 실행예외 아닌 일반예외로 처리하기 위함.
public class MenuChoiceException extends Exception { // 일반예외라서 Exception 상속.
	// 예외처리하는 클래스로 만들기 위해.
	int wrongChoice;
	
	public  MenuChoiceException(int wrongChoice) {
		super("없는 메뉴번호입니다."); // super는 Exception.(ctrl클릭해볼것)
		this.wrongChoice = wrongChoice;
	}
	
	public void showWrongChoice() {
		System.out.println(wrongChoice +"는 없는 메뉴번호입니다.");
	}
}
