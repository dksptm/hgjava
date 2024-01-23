package com.yedam.classes;
// 라이브러리(API)클래스

// 아래의 public class Student { ... } 이게 생성자인듯?--->아니다!!
// 학생번호, 이름, 점수, 키 -> 속성(필드)
// 소개(학생번호,이름,점수) -> 기능(메소드)
public class Student {
	//====== 1. 필드 ======
	private String sno; //번호선언
	private String sname; //null (초기값)
	private int score; // 0 (초기값)
	private double height; //0.0 (초기값)
	private boolean onSchool;
	
	// 보통 속성들은 값을 넣거나 빼는것 직접 접근못하게 함
	// -> 이 Student 클래스에서는 마음껏 사용가능하나 이 클래스 제외 이 필드에 직접 접근 못함
	// private, public 같은 접근지시자
	
	// 대체적으로 필드들은 다 프라이빗으로 한다.
	// 왜? 중요한 정보아니라도 의미없는 값이 들어올수도 있기때문에
	// 그냥 필드선언으로는 막을 방법 없어서 메소드를 통해 값을 담아주기 위한 메소드가 게터.세터
	
	// 다른클래스에서(실행클래스도 다른클래스)
	// 아래 이런거 사용못함
//	s1.sno = "S001";
//	s1.sname = "홍길동";
//	s1.score = 80;
//	s1.height = 178.9;
	// 아래 getter, setter 메소드로 가자!
	
	// (목적에 필요한 것만 필드로 선언하면 된다. 시시콜콜한 정보 모두X)
	
	//====== 2. 생성자 ======
	// 생성자 : new Friend(). <-기본생성자
	// 매개값이 없는 생성자를 기본생성자라고 함
	// 꼭 필요한거라 따로 명시안하면 기본생성자(new Friend())를 컴파일러가 만들어줌
//	Student(){
//		this.sno = "S001"; //생성자 호출하는 것만으로 sno에 값을 넣어준다.(초기화)
//	}
	// 만약 이 기본생성자를 개발자가 안만들어주면 new Student() 사용못함
	// 아예 아무것도 안만들면 컴파일러가 만들어주는데 개발자가 생성자를 만들면 따로 안만들어줌
	
	// 생성자 또 정의 할 수 있다.(1개만 가능한거 아님)
	
	// 매개변수받아서 초기화값에 넣어주는 생성자 만듬(생성자 이름이 같아도..된다? 아니 같은게 좋다?)
	public Student(String no, String name) {
		sno = no;
		sname = name;
	}

	public Student(String no, String name, int score) {
//		sno = no;
//		sname = name; 이렇게해도되고 생성자자체를 가져올수도 (this 가 생성자 자체를 말하는것 같기도 함..)(super()처럼..)
		this(no, name);
		this.score = score; //매개변수명과 필드명이 같으니 this. 붙여줘야. 왜? 변수가 우선순위가 필드보다 좀 높다.
	}
	// this. 객체에서 자기자신을 가리킬때 사용.
	
	// 이클립스에서 자동으로 생성자를 만들어주기도 한다!
	// 이 화면에서 우측클릭>소스>밑에서3번째 G~C~using field>필드선택
	public Student(String sno, String sname, int score, double height) {
		// super(); //상속받는 부모 클래스를 super라고 한다. 
		// 왜 Student는 부모클래스가 없는데 생성됐을까? 
		// 모든 클래스는 object라는 클래스를 상속받습니다.
		// 사실은 이 클래스는 public class Student extends Object 였던것!!
		this.sno = sno;
		this.sname = sname;
		this.score = score;
		this.height = height;
	}
	// 일단 생성자는 초기값이기 때문에 필드나 기능같은거 많이넣으면 안좋음
	// 사실 위의 이것들도 생성자 오버로딩이라 할 수 있다!!
	
	//====== 3. 메소드 ======
	// 메소드
	// 메소드 : 이름,매개값,리턴(리턴은 꼭 있어야. 만약 없으면 void로)
	
	// 리턴없는(void) 메소드
	public void showInfo() {
		System.out.printf("번호는 %s, 이름은 %s, 점수는 %d\n", this.sno, this.sname, this.score);
		// 메소드안에 필드사용하는거라 ->this. (근데 이름같은 매개변수 없으면 안써도 됨)(알아서 this를 가리키는줄 암)
		// this. 이 스튜던트 클래스의 필드라는..
	}
	
	// String을 리턴하는 메소드
	String showInfoStr() {
		return "번호는 " + sno;
	}

	
	// =========getter, setter 메소드=============
	
	// 그래서 프라이빗 필드들은 어떻게 값을 넣어주고 확인하나? -> 게터,세터방식으로!
//	public void setHeight(double height) { // 값을 담을때는 세터-> 담아야하니깐 매개변수..?// 그리고 리턴없음 세터니깐.
//		if(height < 0) {
//			this.height = 160;
//		} else {
//			this.height = height;			
//		}
//	}
//	// 값을 확인해주는 메소드 제공
//	public double getHeight() { // 값을 불러올때는 게터. 그냥 부르는거라 매개변수없는..?
//		return this.height;
//	}
//	
//	// 보통 메소드는 퍼블릭, 속성들은 프라이빗..
//	// 관례! 관례를 어기지 말자!
//	// 대체적으로 각 필드마다 게터세터가 있음 - 겟메소드, 셋메소드가 있어야함
//	
//	// sno, sname, score 필드의 getter/setter 작성해보기.
//	public void setSno(String sno) { // 값을 담을때는 세터
////		if() {
////			
////		} // 중복값확인하고싶음
//		this.sno = sno; // void메소드는 리턴쓰면 안됨
//	}
//	// 값을 확인해주는 메소드 제공
//	public String getSno() { // 값을 불러올때는 게터
//		return this.sno;
//	}
//	
//	public void setSname(String sname) { // 값을 담을때는 세터
//		this.sname = sname; // void메소드는 리턴쓰면 안됨
//	}
//	// 값을 확인해주는 메소드 제공
//	public String getSname() { // 값을 불러올때는 게터
//		return this.sname;
//	}
//	
//	public void setScore(int score) { // 값을 담을때는 세터
//		this.score = score; // void메소드는 리턴쓰면 안됨
//	}
//	// 값을 확인해주는 메소드 제공
//	public int getScore() { // 값을 불러올때는 게터
//		return this.score;
//	}
	
	// 당연히 게터.세터도 이클립스가 자동으로 만들어준다.
	// 우측클릭>소스>제너레이트 게터,세터> 필드선택> 셀렉트올(또는 게터만, 세터만)
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isOnSchool() { // boolean타입필드의 getter는 is를 붙인다.
		return onSchool;
	}

	public void setOnSchool(boolean onSchool) {
		this.onSchool = onSchool;
	}
	
	// Student 라는 클래스는 사실 정보를을 모아두는.. 클래스의 의미가 크다(필드넣고 게터세터넣고..등)
	// 보통은 기능들을 (CRUD하는) 모아두는 클래스를 따로 만든다>> StudentApp 
	
	
	
}
