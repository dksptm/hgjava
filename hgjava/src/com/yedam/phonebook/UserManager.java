package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.yedam.collection.Member;

// 기능은 c:/temp/userList.txt 에 저장된 아이디/비번을 이용
public class UserManager {

	private File userFile = new File("c:/temp/userList.txt");
	private Map<String, String> users = new HashMap<>();
	private String id = "", pw = "";
	private static UserManager instance = new UserManager();

	private UserManager() {
		init();
	}

	public static UserManager getInstance() {
		return instance;
	}

	public void init() {
		try {
			FileReader fr = new FileReader(userFile);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			while ((str = br.readLine()) != null) {
				String[] strAry = str.split(" ");
				users.put(strAry[0], strAry[1]);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public boolean userCheck(String id) {
//		Set<Entry<String, String>> userSet = users.entrySet();
//		for (Entry<String, String> user : userSet) {
//			if (user.getKey().equals(id)) {
//				System.out.print("비밀번호 입력> ");
//				String pw = MenuViewer.keyboard.nextLine();
//				if (user.getValue().equals(pw)) {
//					return true;
//				} else {
//					System.out.println("비밀번호 틀림.");
//					return false;
//				}
//			}
//		}
//		System.out.println("없는 아이디.");
//		return false;
//	}
	
	public boolean userCheck() {
		if(!idCheck()) {
			for(int i=0;i<3;i++) {
				idCheck();
			}
		} else if(idCheck()) {
			for(int i=0;i<3;i++) {
				System.out.print("비밀번호 입력>> ");
				pw = MenuViewer.keyboard.nextLine();
				if(pwCheck(pw)) {
					return true;
				}				
			}
		}
		return false;
	}
	
	
	public boolean pwCheck(String pw) {
		if(users.get(id).equals(pw)) {
			System.out.println("로그인 성공.");
			return true;
		}
		System.out.println("비밀번호 오류.");
		return false;
	}

	public boolean idCheck() {
		System.out.print("아이디 입력>> ");
		id = MenuViewer.keyboard.nextLine();
		Set<Entry<String, String>> userSet = users.entrySet();
		for (Entry<String, String> user : userSet) {
			if (user.getKey().equals(id)) {
				return true;
			}
		}
		System.out.println(id + "는 없는 아이디.");
		id = "";
		return false;
	}

	public void print() {
		Set<Entry<String, String>> userSet = users.entrySet();
		for (Entry<String, String> user : userSet) {
			System.out.println(user.toString());
		}
	}

}
