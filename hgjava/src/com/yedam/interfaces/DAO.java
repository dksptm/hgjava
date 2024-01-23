package com.yedam.interfaces;

//class 대신 interface
//interface DAO 안에 쓴 메소드는 모두 abstract다.(굳이 abstract안써도)
//규칙만!
//보통 처음에 모든 규칙을 한다.나중에 수정하게 되면 연결된 다른 클래스들 에러.
//필드가 필요하다? 그럼 추상이나 클래스 상속
//대체적으로 인터페이스를 사용한다. 추상클래스는 사용안하는...(실행클래스의 유지보수위해)
//상속은 쓰겠지..당연히..
public interface DAO {
	//상수
	int VER = 1; //바꿀수없다.
	//규칙.
	public void insert();
	public void update();
	public void delete();
}
