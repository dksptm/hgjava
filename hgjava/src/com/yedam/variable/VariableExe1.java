package com.yedam.variable;

public class VariableExe1 {
	public void sum() {
		int n2; // 이렇게는 선언가능(main블럭안, sum블럭안)
	}
	public static void main(String[] args) {
		// let n1 = 100; javascript
		// 정수도 무한정 담을수없다. 범위가 있다.
		// int(기본데이터타입)
		// 기본데이터타입의 클래스가 Integer
		// 실제 변수에 값을 담는게 아닌 값이 담아져있는 주소를 참조(int가 그렇다는 말X int는 실제 메모리에저장)
		// wrapper클래스 : Integer. 는 int에 대한 기능들을 담아놓은 클래스
		// const obj = { name:'홍길동', age:20, showInfo(){} }; javascript
		// 홍길동 => 기본데이터타입 문자, name:'홍길동'은 속성
		// Integer.MIN_VALUE 도 똑같이 속성
		int n1 = 1000000; // int에 대응되는 wrapper클래스 : Integer.
		
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.MAX_VALUE); // 2147483647
		
		n1 = 2147483647;
		n1 = -2147483648;
		
		// 무한정 큰 데이터 담고싶을 때 long, 숫자뒤에 L입력해서 long이란걸 알려줘야
		long n2 = 21474836478L;
		n2 = -21474836488L;
		
		double n3 = Math.random(); // 0<= 랜덤(임의실수) < 1 -> 실수타입으로 만들어줘야
		System.out.println(n3);
		
		int n4 = (int)(Math.random()*10); //0~10 임의실수. -> 형변환 -> 앞에 (타입) 적으면됨
		// -> 형변환이니깐 변수선언시 int로!
		
		// 정수 int 실수 double(기본값), float
		
		// 문자 : javascript에서는 기본값이지만 자바에서는 클래스다.-> 대문자
		// 자바에서 클래스는 모둔 앞글자 대문자 -> 참조값이다! 실제값 아닌 주소값 가지고 있음
		// Integer, Math, String...
		// int 등은 기본데이터값
		
		String str = "홍길동";
		
//		int n2; 이렇게하면 오류! 같은 변수명으로 두번 선언 불가. but 다른 메소드면 상관X(지금은 main메소드 안)
		
		byte b1 = 127;
		b1 = -128;
		
		// short의 max, min값은?
		System.out.println(Short.MIN_VALUE); //-32768
		System.out.println(Short.MAX_VALUE); //32767
		short s1 = 32767;
		
//		short s3 = s1 - 30; error? 연산의 기준은 (-) 인트타입 => s1 - 30; 은 int라서 에러!
		short s3 = (short)(s1 - 30); //이렇게 쇼트로 타입형변환하든지, int로 선언하든지
		// 항상 = 기준으로 양쪽은 같은 타입이어야 한다.(당연함..)
		// 왼쪽항 = 오른쪽항 : 항상 타입이 동일.
		double d1 = 40; // 40은 정수이지만 자동으로 (double)40; 으로 형변환을 하기때문에 가능
		
		// 이렇게 정수범위를 byte~long하는이유? 메모리때문에(서버에서는 메모리 아껴쓰는필요함)
		
	}
}
