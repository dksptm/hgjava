package com.yedam.phonebook;

// App에서 사용할 메뉴.
// 인터페이스의 필드 -> public static final 의미를 자동으로 담고있음
// 열거형 enum 대신 인터페이스에 해봄.
public interface InitMenu {

	int INPUT = 1; // public static final
	int SEARCH = 2, DELETE = 3, EXIT =4;
	int PLAY = 0;
}
