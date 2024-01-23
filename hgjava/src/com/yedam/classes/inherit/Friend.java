package com.yedam.classes.inherit;

import lombok.Data;

// 이름,연락처 (Friend)
// 이름,연락처,학교,전공 (UnivFriend)
// 이름,연락처,회사,부서 (CompFriend)
@Data
public class Friend extends Object{ //모든 클래스는 Object를 상속한다. 그래서 생략가능
	private String name;
	private String phone;
	
	public void changeInfo(String info1, String info2) {
		return;
	}
	// --> 자식클래스에서 상속받아서 오버라이딩하기위한 메소드
	
	//@Override 하는 이유: 부모클래스를 재정의하기위한 표시(특별한 기능없음)
	//@Override붙여주면 반환,메소드명,매개값 등 같은지 체크해줌
	@Override
	public String toString() {
		return "이름은 "+ name + ", 연락처는 " + phone;
	}
	
	
	
	// 생성자, 게터/세터 생성해주는거 이클립스기능말고 라이브러리를 사용해보자!
	// https://mvnrepository.com/ > lombok검색 > Project Lombok, 1.18.30버전 > jar 다운받기
	// hgjava에서 우측클릭>빌드패스>컨피겨빌드>라이브러리탭>클래스패스선택> Add External JARs..>파일선택추가>apply and close
	// 왼쪽에서 롬복추가된것 확인>> 이클립스에서 사용하려면 플러그인 프로그램 다운로드 받아야함
	// https://projectlombok.org/ (또는 https://projectlombok.org/download)
	// 명령프롬프트에서 cd Download -> dir/w -> java -jar lombok.jar -> 플러그인설치화면
	//-> 이클립스 설치된 폴더선택 ->인스톨 -> dev폴더에 lombok.jar추가, ini파일에도 마지막에 jar추가됨
	// 이클립스 재실행
	
	//라이브러리 사용
	//@Data 하고 ctrl+space -> import lombok.Data;
	//필드만 생성해도 게터.세터, 가능
	
	// 참고로 생성자 안에 super()없어도 자동으로 인식(?)한다. 하지만 적어주면 더 명확하다
	
	
	
	

}
