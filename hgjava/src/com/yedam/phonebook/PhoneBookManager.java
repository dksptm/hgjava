package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

// 생성자(초기화), 등록, 검색, 삭제, 종료(파일저장)
public class PhoneBookManager {

	private File dataFile = new File("c:/temp/phoneBook.dat");
	// 컬렉션선언.
	HashSet<PhoneInfo> storage = new HashSet<>();

	// 싱글톤
	private static PhoneBookManager instance; // 초기값: null.

	private PhoneBookManager() {
		readFromFile(); // 초기화.
	}

	public static PhoneBookManager getInstance() {
		if (instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}
	
	// 메소드1, 메소드2, 메소드3 - 어차피 이 안에서만 사용할 예정-> private
	private PhoneInfo getFriendInfo() {
		System.out.print("이름>> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("연락처>> ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo getCompanyFriendInfo() {
		System.out.print("이름>> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("연락처>> ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("회사>> ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}
	
	private PhoneInfo getUnivFriendInfo() {
		System.out.print("이름>> ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("연락처>> ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("전공>> ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("학년>> ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine(); //엔터처리
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	// 추가.
	public void inputDate() {
		System.out.println("구분");
		System.out.println("1.일반 2.회사 3.학교");
		System.out.print("선택>> ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine(); //엔터처리
		PhoneInfo info = null;
		switch(choice){
		case InputSelect.NORMAL: 
			info = getFriendInfo();
			break;
		case InputSelect.COMPANY: 
			info = getCompanyFriendInfo();
			break;
		case InputSelect.UNIV: 
			info = getUnivFriendInfo();
			break;	
		}
		if(storage.add(info)) {
			System.out.println("등록완료.");
		} else {
			System.out.println("등록오류.");
		}
		
	}
	
	public void searchDate() {
		
	}

	// 삭제.
	public void deleteData() {
		// 이름 검색 후 삭제. Iterator => iter.hasNext, iter.next, iter.remove
		System.out.print("삭제할 이름>> ");
		String name = MenuViewer.keyboard.nextLine();
		Iterator<PhoneInfo> iter = storage.iterator();
		while(iter.hasNext()) {
			PhoneInfo info = iter.next();
			if(info.getName().equals(name)) {
				iter.remove(); // 반복자를 삭제하면 삭제가 됨(가리키는 지팡이를 삭제하는 거라서..)
				System.out.println(name + "삭제.");
				return; //메소드 나옴.
			}
			// storage.remove를 할수없음(이름만 값을 받는거라..) p.567참고
			// PhoneInfo info 는 새로운 haseCode라서 안되는듯..
		}
		System.out.println(name + "이름이 없습니다.");
	}
	
	// 초기화.
	public void readFromFile() {
		if (dataFile.exists() == false) { // 파일이 없으면.
			return; // 메소드 종료.
		}

		// 있으면 파일을 읽어옴.
		try {
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr); // 성능보다는 한라인씩 읽기위함.
			String str = "";
			PhoneInfo info = null;
			while ((str = br.readLine()) != null) { // 한 라인씩 읽어서 null값이 아닌경우에만.
				String[] record = str.split(",");
				// 컬렉션에 저장.
				// 항목이 2개|3개|4개.
				// 이를 위해 앞에 번호부여. 1번은 기본, 2번은 회사, 3번은 학교.
				int type = Integer.parseInt(record[0]);
				switch(type) {
				case InputSelect.NORMAL: 
					info = new PhoneInfo(record[1], record[2]);
					break;
				case InputSelect.COMPANY: 
					info = new PhoneCompanyInfo(record[1], record[2], record[3]);
					break;
				case InputSelect.UNIV: 
					info = new PhoneUnivInfo(record[1], record[2], record[3], Integer.parseInt(record[4]));
					break;
				}
				storage.add(info);
			}// end of while.

		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	} //end of readFromFile().
	
	// 저장.
	public void storeToFile() {
		try {
			FileWriter fr = new FileWriter(dataFile);
			Iterator<PhoneInfo> iter = storage.iterator();
			
			while(iter.hasNext()) {
				PhoneInfo info = iter.next();
				// toString 활용
				fr.write(info.toString() + "\n");
			}
			fr.flush(); fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}// end of class.
