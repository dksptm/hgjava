package com.yedam.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		StudentApp app = new StudentApp(); // 초기화완료.

		while (run) {
			System.out.println("1.등록 2.출력 9.종료");
			System.out.print("선택>> ");
			String menu = scn.nextLine();

			switch (menu) {
			case "1": // 번호 이름 점수 (엔터)
				System.out.println("번호 이름 점수(엔터)");
				String[] stdAry = scn.nextLine().split(" ");
				Student student = new Student(Integer.parseInt(stdAry[0]), 
						stdAry[1], Integer.parseInt(stdAry[2]));
				if (app.add(student)) {
					System.out.println("등록완료.");
				} else {
					System.out.println("등록에러.");
				}
				break;

			case "2":
				List<Student> list = app.list();
				for (Student std : list) {
					System.out.println(std.toString());
				}
				System.out.println("조회완료.");
				break;

			case "9":
				System.out.println("프로그램 종료.");
				app.save();
				run = false;
			}

		} // end of while.

		System.out.println("end of main.");
	}// end of main.

	void write() {
		List<Student> storage = new ArrayList<>();
		storage.add(new Student(201, "김민규", 80));
		storage.add(new Student(202, "박민규", 75));
		storage.add(new Student(203, "최민규", 93));
		storage.add(new Student(204, "이민규", 77));

		try {
			FileWriter fw = new FileWriter("c:/temp/test2.dat");
			BufferedWriter bw = new BufferedWriter(fw);
			// storage에 담긴 값들을 하나씩 처리하는 반복.
			for (Student std : storage) {
				String str = std.getSno() + " " + std.getSname() + " " + std.getScore(); // 자동형변환
				bw.write(str + "\n");
			}
			bw.flush();
			fw.flush();
			bw.close();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void read() {
		// test.dat 파일 읽어서 => Student 컬렉션에 담는 작업
		List<Student> storage = new ArrayList<Student>();
		try {
			FileReader fr = new FileReader("c:/temp/test.dat");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String read = br.readLine(); // 101 name 90
				if (read == null)
					break;
				String[] readAry = read.split(" ");
				storage.add(new Student(Integer.parseInt(readAry[0]), readAry[1], Integer.parseInt(readAry[2])));
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 컬렉션 정보 출력.
		for (Student std : storage) {
			System.out.println(std.toString());
		}

	}

}
