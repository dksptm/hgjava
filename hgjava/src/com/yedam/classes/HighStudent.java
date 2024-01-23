package com.yedam.classes;

// student클래스 상속하는 고등학생 클래스
// 그런데 부모클래스에 기본생성자가 정의되지 않으면-->컴파일에러
// 그럼 Student클래스에 기본생성자를 만들거나(그런데 안만든 이유도 있겠지)
// 이 HighStudent 생성자를 만들때 부모클래스 불러올때(super();)
// super(sno, name); 이렇게 Student 생성자에 맞게 불러오면 된다!
public class HighStudent extends Student {
	private String teacher;
	
	// 기본생성자가
//	public HighStudent(){
//		super();
//	}
	// 이거라서. super();를 사용못하고.. super안에 들어갈 매개변수도 없고... 그래서 처음엔 에러가 난다 
	
	public HighStudent(String sno, String name) {
		super(sno, name);
	}
	
	public HighStudent(String sno, String name, int score, String teacher) {
		super(sno, name, score); //부모클래스 생성자에 맞게 불러옴
		this.teacher = teacher;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
	// 부모메소드를 재정의(overriding)
	// this대신 super : 부모꺼니깐
	// sno대신 getSno : private니깐
	// 그런데! super.getSno() 도 맞긴한데..
	// 어차피 getSno()는 자식도 사용가능해서 this.getSno()
	public void showInfo() {
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d, 선생님은 %s입니다.\n"
				, this.getSno(), this.getSname(), this.getScore(), this.teacher);
	}
	
	
	
	
}
