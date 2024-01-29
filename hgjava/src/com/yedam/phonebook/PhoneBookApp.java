package com.yedam.phonebook;

import java.util.InputMismatchException;

// 연락처 app. 
public class PhoneBookApp {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.getInstance();
		boolean run = false;
		// 사용자 권한 체크
		// UserManager => userCheck(아이디,비번)
		// 3번 연속으로 인증이 실패할 경우 프로그램 종료.
		UserManager um = UserManager.getInstance();
		
//		System.out.print("아이디 입력>> ");
//		String id = MenuViewer.keyboard.nextLine();
		if(um.userCheck()) {
			run = true;
		}
		
		Thread mediaThread = new MediaThread();
		
		int menu = 1;
		while (run) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();

				if (menu < InitMenu.INPUT || menu > InitMenu.EXIT) {
					throw new MenuChoiceException(menu);
					/**
					 * menu 번호를 받아서 새로운 예외 객체 생성. 
					 * 객체생성하고 menu번호 받는 이유 : 잘못입력한 값도 보여주고 싶어서. 
					 * 예외를throw. (예외를 던진다.) 
					 * -> 이 예외자체도 반드시 try-catch해줘야(왜? 예외니깐 catch에 가줘야.) 
					 * p.461 참고-> 책에서는 메소드에 throw붙이고, 그 메소드를 부른 곳에서 try-catch했는데 
					 * 여기는 if문에서 throw하고 이 throw를 받아야(catch)하는게 어차피 이 안이라..? 
					 * 여기가 메인메소드라 메인메소드에 throws MenuChoiceException 하긴그래서..그런듯
					 */
				}
				
				if (menu == InitMenu.INPUT) { // 이렇게하는 이유: menu == 1 보다 의도가 명확해짐.
					manager.inputDate();
				} else if (menu == InitMenu.SEARCH) {
//					manager.searchDate();
				} else if (menu == InitMenu.DELETE) {
					manager.deleteData();
				} else if (menu == InitMenu.EXIT) {
					System.out.println("종료.");
					manager.storeToFile();
					mediaThread.interrupt();
					run = false;
				} else if (menu == InitMenu.PLAY) {
					if(mediaThread.isAlive()) {
						System.out.println("이미 실행중입니다.");
						continue;
					}
					mediaThread.start();
				}
				
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
			} 
		} // while.

		System.out.println("end of prog.");
	}// end of main.
}// end of class.
