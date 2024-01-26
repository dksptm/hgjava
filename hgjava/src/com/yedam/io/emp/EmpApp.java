package com.yedam.io.emp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// 초기화(데이터 활용 컬렉션)
// 추가
// 목록
// 종료(컬렉션 -> 파일저장)
public class EmpApp {
	private List<Employee> storage = new ArrayList<>();

	/**
	 * ArrayList도 객체, Employee도 객체 객체->바이트 (ObjectOutputStream) ObjectOutputStream 가
	 * 모든 클래스를 바이트로 바꿔주는것X java.io.Serializable 구현클래스만 가능 (Serializable 안에 메소드X. 그냥
	 * 표시만.) ArrayList 클래스에 가보면 implements java.io.Serializable 확인가능 Employee에도
	 * implements java.io.Serializable 해줌.
	 */

	public EmpApp() {
		try {
			init();
		} catch (Exception e) {
			System.out.println("생성자에서 init()할때 오류.");
		}
	}

	// 초기화
	public void init() throws Exception{

		File file = new File("c:/temp/emp.dat");
		if (!file.exists()) {
			System.out.println("파일은 생성됨. 내용은 없음.");
			file.createNewFile();
		} else {
//			System.out.println("파일 지우기.");
//			file.delete();
			System.out.println((file.lastModified())/1000/60/60/24/365); // 정보확인.(1900년 기준 밀리세컨드로)
			// val/1000/60/60/24/365
		}

		FileInputStream fis = new FileInputStream(file); // 이렇게 파일객체를 매개값으로 넣어도 됨.
		ObjectInputStream ois = new ObjectInputStream(fis);

		storage = (List<Employee>) ois.readObject(); // 바이트->객체(역직렬화). 캐스팅필요.
		ois.close();
		fis.close();

	}// init()

	// 등록 add(). 목록 list().
	public boolean add(Employee emp) {
		return storage.add(emp);
	}

	public List<Employee> list() {
		return storage;
	}

	public void save() {
		// 기본스트림 -> 보조스트림(객체) -> 저장.
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/emp.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(storage); // writeObject() 객체타입으로 바로 작성.
			oos.flush();
			fos.flush();
			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// 2진파일로 저장되기 때문에, 노트패드든 뭐든 내가 볼 수 없다..
	} // save()

}// class
