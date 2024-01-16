package com.yedam.variable;

//static : 스택, 퀵 같은 특별한 메모리영역에 메소드를 저장해주는 것(사용할준비되게해주는것)
//메모리상에 main, update 메소드 준비시켜주는것
//없으면 new를 통해 클래스 인스턴스 만들고 사용해야함

public class VariableExe4 {
	public static void main(String[] args) {
		// true, false
		// boolean isTrue = 10; 불가능
		boolean isTrue = 10 > 20;
		
		//update(10)의 returen이 boolean이므로 isTrue(boolean타입)에 할당가능
		isTrue = update(12);
		
		if(isTrue) {
			System.out.println("참값.");
		}else {
			System.out.println("거짓값.");
		}
		
		// 멤버라는 데이터타입을 불러오는것(멤버라는 클래스에 인스턴스를 만들겠다.)
		//=> 변수하나로 String, int, double 타입의 값을 담을 수 있다.
		Member m1 = new Member();  // "", 20, 155.5 다 선언 불가능 -> 먼저 Member라는 인스턴스를 만들어야함
		
		m1.name = "홍길동";
		m1.age = 20;
		m1.height = 167.8;
		
		Member m2 = new Member();
		// 비어있는 초기값을 가지고 실체(인스턴스)를 만들어준다.
		
		// 속성에 값을 하나씩 채워넣음
		m2.name = "홍길동";
		m2.age = 20;
		m2.height = 167.8;
		
		isTrue = m1.height > m2.height;
		isTrue = m1.age == m2.age;
		isTrue = m1 == m2; //값이 같더라도 항상 false. why? 주소값이 다르다!
		
		System.out.println(m1); //com.yedam.variable.Member@626b2d4a
		System.out.println(m2); //com.yedam.variable.Member@5e91993f
		
		byte a = 10;
		int b = (int)a; // 강제형변환
		int c = a; // 자동형변환 (가능이유? int > byte 이기때문에)
		// 여전히 a 변수 자체는 byte타입이다.
		
	} //end of main
	
	public static boolean update(int arg) {
		return arg % 2 == 0; //arg=11 -> returen false, arg=10 -> return true 
	}
	
}
