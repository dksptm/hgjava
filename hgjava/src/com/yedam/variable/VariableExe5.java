package com.yedam.variable;

public class VariableExe5 {
	public static void main(String[] args) {
		
		double d1 = 10; //-> 10이라는 리터럴이 double타입으로(10.0d)으로.
		double result = d1 + 20; // 내부적으로 20도 double타입으로 자동형변환((double)20.0f)(플롯을 더블로)
		
		int sum = 60;
		result = sum / 7; // 더블타입 result에 담았지만 정수/정수 라서 정수만 남겨짐
		System.out.println(result);	//몫만 나옴 (8.5714..)(소수가 나오더라도 정수만 남겨짐)
		
		//sum = "1"+3; // 불가. 문자+숫자라 자동으로 문자+문자로
		//아니면 Integer클래스의 parseInt()메소드 사용
		sum = Integer.parseInt("1")+3; //가능
		
		// Double.parseDouble()메소드 사용
		result = Double.parseDouble("1.234")+2.3; //가능
		
		// char: 2byte, 65536개(음수없음)
		for(int i=0; i<10; i++) {
			int temp = (int) (Math.random()*25) + 97;
			System.out.println((char)temp);			
		}// 랜덤한 알파벳 추출가능
		
		
	} //end main
	
} //end class
