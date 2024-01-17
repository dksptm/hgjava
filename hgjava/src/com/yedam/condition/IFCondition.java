package com.yedam.condition;

public class IFCondition {
	public static void main(String[] args) {
		boolean isTrue = true;
		isTrue = isTrue != true;
		
		if(!!isTrue) {
			// 실행구문.
			System.out.println("참값");
		} else {
			System.out.println("거짓값");			
		}
		
		int score = 95;
		// if구문이 하나이다.(if~else if~esle)
		if(score >= 90) {
			System.out.println("A학점");						
		}else if(score >= 80) {
			System.out.println("B학점");						
		}else {
			System.out.println("C학점");									
		}
		// if구문 3개다 아래는 의도와는 달라짐..
//		if(score >= 90) {
//			System.out.println("A학점");						
//		}
//		if(score >= 80) {
//			System.out.println("B학점");						
//		}
//		if(score >= 70){
//			System.out.println("C학점");									
//		}
		
		System.out.println("end of prog.");
		
	}//end main

}//end class
