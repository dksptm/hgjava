package com.yedam.condition;

public class DoWhileExe3 {
	public static void main(String[] args) {
		
		boolean run = false;
		int cnt = 0;
		// break point 만들기 > 왼쪽 숫자에 더블클릭, 해제하려면 다시 더블클릭
		// 벌레아이콘 클릭하고(switch)
		// 왼쪽메뉴상단에 step over(화살표 조금둥근것, F6)
		
		do {
			System.out.println("한번 출력합니다..." + cnt);
			run = true;
			if(cnt++ > 3) {
				run = false;
			}
		} while (run); //run이 참이면 do또 실행
		
		System.out.println("end of prog.");
		
	}//main
}//class
