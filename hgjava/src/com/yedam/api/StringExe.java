package com.yedam.api;

public class StringExe {

	void method1() {

		// String은 생성자도.. 메소드도 많다..

		String str = "Hello";
		str = new String("Hello");
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			System.out.println(b);
		}
		str = new String(new byte[] { 72, 101, 108, 108, 111 });
		System.out.println(str);
		str = new String(bytes);
		System.out.println(str);

		System.out.println(str.indexOf("a")); // 없는값은 -1
		System.out.println(str.charAt(1));

		String blank = " ";
		byte[] blankByte = blank.getBytes();
		for (byte b : blankByte) {
			System.out.println(b);
		}

		// 바이트배열을 문자열로 변환
		String exstr = "Black Pink";
		byte[] exbytes = exstr.getBytes();
		String exstr2 = new String(exbytes, 6, 4);
		System.out.println(exstr2);

		exbytes = new byte[12];
		System.out.print("입력>> ");
//		int readByte = System.in.read();

		for (byte b : exbytes) {
			System.out.println(b);
		}
//		System.out.println("바이트 개수?"+readByte);

//		String str2 = new String(exbytes, 0, readByte-3);
//		System.out.println("str2: "+str2);

	}

	public static void main(String[] args) {

		String[] jumin = { 
				"970101-1234567", 
				"970101-2234567", 
				"9701011234567", 
				"970101 1234567", 
				"030101 4234567",
				"030101 1234567", 
				"970101 4234567" 
				};
		for (String ssn : jumin) {
			checkGender2(ssn);
		}

		String[] names = { "김길동", "홍길동", "이상민", "김민수", "길동이", "길길동", "박김길동" };
		int cnt = 0;
		for (String ssn : names) {
			if (ssn.indexOf("길동") > 0)
				cnt++;
		}
		System.out.println("이름이 길동인 사람: "+cnt + "명");

	}// main

	static void checkGender1(String ssn) {

		int idx = 0;
		if (ssn.length() == 13) {
			idx = 6;
		} else if (ssn.length() == 14) {
			idx = 7;
		}

		char gen = ssn.charAt(idx);
		int year = Integer.parseInt(ssn.substring(0, 2));
		if (year < 25) {
			if (gen == '1' || gen == '2') {
				System.out.printf("%02d년생 성별오류\n", year);
				return;
			}
		} else {
			if (gen == '3' || gen == '4') {
				System.out.printf("%02d년생 성별오류\n", year);
				return;
			}
		}

		switch (gen) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("성별숫자 오류");
		}
	}// 젠더메소드

	static void checkGender2(String ssn) {
		int year = Integer.parseInt(ssn.substring(0, 2));
		boolean before2000 = year > 23;

		char pos = ssn.charAt(ssn.length() - 7); // 뒤에서 세아렸다!!
		String gender = "여자";

		if (before2000) {
			if (pos == '1') {
				gender = "남자";
			} else if (pos == '2') {
				gender = "여자";
			} else {
				gender = "오류";
			}
		} else {
			if (pos == '3') {
				gender = "남자";
			} else if (pos == '4') {
				gender = "여자";
			} else {
				gender = "오류";
			}
		}
		System.out.println(gender);

	}

}
