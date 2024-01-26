package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExe {
	public static void main(String[] args) {
		// 입력출력 => 복사
		try {
			FileInputStream fis = new FileInputStream("c:/temp/sample.pdf");
			FileOutputStream fos = new FileOutputStream("c:/temp/samplecopy.pdf");

			// 보조스트림. Buffered... // 성능향상.
			BufferedInputStream bis = new BufferedInputStream(fis); // 연결
			BufferedOutputStream bos = new BufferedOutputStream(fos); // 연결

			while (true) {
				int buf = bis.read();
				if (buf == -1)
					break; // while 종료조건
				bos.write(buf);
			}
			bos.flush(); bos.close();
			fos.flush(); fos.close();
			bis.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("copy완료.");

	}

	void copy() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/sample.pdf");
			FileOutputStream fos = new FileOutputStream("c:/temp/samplecopy.pdf");

			byte[] byteAry = new byte[100]; // 100바이트씩
			while (true) {
				int buf = fis.read(byteAry);
				if (buf == -1)
					break; // while 종료조건
				fos.write(byteAry);
			}
			fos.flush();
			fos.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("copy완료.");

	}

	void read() {
		// 바이트 입력 스트림

		// 파일 입력 스트림
		try {
			FileInputStream fis = new FileInputStream("c:/temp/sample.dat");
			while (true) {
				int bytes = fis.read(); // (end of file)eof=> -1반환
				if (bytes == -1)
					break;
				System.out.println(bytes);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of file.");
	}

	void writer() {
		// 바이트 출력 스트림.
		// file로 출력. dat파일은 직접보기에는 곤란(2진파일임). 읽어들이는 스트림으로 봐야.
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/sample.dat");
			fos.write(10);
			fos.write(20);
			fos.write(30);
			fos.flush(); // 모든정보 비우기.
			fos.close(); // 자원환원.(JVM으로).꼭 해줘야함.
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of file.");

	}

}
