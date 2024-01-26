package com.yedam.io.emp;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class empExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		EmpApp app = new EmpApp(); // 초기화완료.
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		while (run) {
			System.out.println("1.등록 2.출력 9.종료");
			System.out.print("선택>> ");
			String menu = scn.nextLine();

			switch (menu) {
			case "1": // 사번 이름 입사일(yy-MM-dd) 급여(엔터)
				System.out.println("사번 이름 입사일(yy-MM-dd) 급여(엔터)>> ");
				String[] empAry = scn.nextLine().split(" ");
				Employee employee = null;
				try {
					employee = new Employee(Integer.parseInt(empAry[0]), empAry[1], sdf.parse(empAry[2]),
							Integer.parseInt(empAry[3]));
				} catch (Exception e) {
					e.printStackTrace();
				}

				if (app.add(employee)) {
					System.out.println("등록완료.");
				} else {
					System.out.println("등록에러.");
				}

				break;

			case "2":
				List<Employee> list = app.list();
				for (Employee emp : list) {
					System.out.print(emp.toString());
				}
				System.out.println("조회완료.");
				break;

			case "9":
				System.out.println("프로그램 종료.");
				app.save();
				run = false;
			}
		} // end of while.

		System.out.println("end of main.");
		scn.close();
	}// end of main.
}// end of class.
