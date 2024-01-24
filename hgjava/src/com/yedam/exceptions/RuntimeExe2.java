package com.yedam.exceptions;

public class RuntimeExe2 {
	public static void main(String[] args) {
		
		// 실행예외
		String str = "10";
		
		str = null;
		
		try {
			str = "ten";
			System.out.println(str.toString());//NullPointer
			int num = Integer.parseInt(str);//NumberFormat			
		} catch(NullPointerException ne) {
//			ne.printStackTrace(); //NullPointerException 클래스의 기능
			System.out.println("참조값이 없습니다.");
		} catch(NumberFormatException ne2) {
//			ne2.printStackTrace();
			System.out.println("숫자값이 아님.");
		} catch(Exception e) { // 예외(실행,일반 모두)의 가장 상위 클래스사용
			System.out.println("알수없는 예외.");
		}
		// 단, 순서는 주의해줘야.Exception이 먼저오면 그냥 이 catch만 진행하고 완료됨
		// 어떤 예외인지 catch할 기회가 없음
		// 그냥 Exception만 하거나, 젤 밑에 두거나.
		
		
		System.out.println("end of prog.");
	}//main
}//class
