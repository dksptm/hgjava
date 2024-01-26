package com.yedam.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharStreamExe {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 문자기반 입출력 + Buffered
		try {
			FileReader fr = new FileReader("c:/temp/test.dat");
			BufferedReader br = new BufferedReader(fr); // 한 char씩 읽음
			while (true) {
				String read = br.readLine(); // 한라인씩 읽기 // 속도체감없어서 readLine() 메소드사용
				// 리턴타입 문자열.없으면 null.
				if(read == null) //eof => null반환.
					break;
				System.out.println(read);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end of prog.");
	}

	void read() {
		// 파일을 입력

		Class cls = CharStreamExe.class; // 경로확인하기위함.
		String path = cls.getResource("ByteStreamExe.class").getPath();
		System.out.println(path); /// D:/git/hgjava/hgjava/bin/com/yedam/io/ByteStreamExe.class
		path = "D:/git/hgjava/hgjava/src/com/yedam/io/ByteStreamExe.java"; // java파일로..

		try {
			FileReader fr = new FileReader(path);
			while (true) {
				int read = fr.read();
				if (read == -1)
					break;
				System.out.print((char) read); // 결과정수라서 char로 변경.
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void write() {
		// 문자기반 입출력.
		// 파일에 출력
		try {
			FileWriter fw = new FileWriter("c:/temp/test.dat");
			while (true) {
				System.out.print("입력>> ");
				String str = scn.nextLine();
				if (str.equals("stop"))
					break;
				fw.write(str + "\n");
			}
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
