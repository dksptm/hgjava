package com.yedam.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentApp {
	// 초기화(test.dat)	=> 컬렉션에 저장.
	// 추가 				=> 컬렉션에 추가.
	// 목록
	// 종료 				=> 컬렉션 -> 파일저장(test.dat).

	// 필드
	List<Student> storage = new ArrayList<>();
	
	// 생성자(바로 init()하도록 넣기)
	public StudentApp() {
		init();
	}
	
	// 초기화(파일 -> 컬렉션에 저장).
	public void init() {
		try {
			FileReader fr = new FileReader("c:/temp/test.dat");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String read = br.readLine();
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
		System.out.println("초기화완료.");
	}// init()
	
	// 추가
	public boolean add(Student std) {
		return storage.add(std);
	}// add()
	
	// 목록
	public List<Student> list() {
		return storage;
	}// list()
	
	// 종료(컬렉션 -> 파일에 저장).
	public void save() {
		try {
			FileWriter fw = new FileWriter("c:/temp/test.dat");
			BufferedWriter bw = new BufferedWriter(fw);
			for (Student std : storage) {
				String str = std.getSno() + " " + std.getSname() + " " + std.getScore();
				bw.write(str + "\n");
			}
			bw.flush(); fw.flush();
			bw.close(); fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// save()

}
